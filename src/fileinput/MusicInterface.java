package fileinput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class MusicInterface {

	final String FILE_NAME = "C:/Users/t_sus_000/Desktop/EclipseFiles/abc.txt";

	public void Serialize(ArrayList<MusicModel> mm) {

		try {
			FileOutputStream fos = new FileOutputStream(FILE_NAME);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(mm);

			oos.flush();
			oos.close();
			fos.close();
			System.out.println("success...");
		} catch (Exception e) {
			System.out.println("Couldn't create file...");
		}
	}

	@SuppressWarnings("unchecked")
	public ArrayList<MusicModel> Deserialize() {

		ArrayList<MusicModel> mm = new ArrayList<MusicModel>();
		try {
			FileInputStream fis = new FileInputStream(FILE_NAME);
			ObjectInputStream ois = new ObjectInputStream(fis);

			mm = (ArrayList<MusicModel>) ois.readObject();

			ois.close();
			fis.close();
		} catch (Exception e) {
			System.out.println("Couldn't find file...");
		}

		return mm;
	}

	public void DisplayList(ArrayList<MusicModel> mm) {

		System.out.println("Artist" + "\t\t" + "Song");
		Iterator<MusicModel> iter = mm.iterator();
		while (iter.hasNext()) {
			MusicModel temp = iter.next();
			System.out.println(temp.artist + "\t" + temp.song);
		}
	}

//	public void SearchList(ArrayList<MusicModel> mm) {
//
//		System.out.println("Search for an artist: ");
//		String text = null;
//		try {
//			Scanner scanner = new Scanner(System.in);
//			Scanner sc = scanner.useDelimiter("\n");
//			text = sc.next();
//			sc.close();
//			scanner.close();
//		} catch (Exception e) {
//		}
//
//		Iterator<MusicModel> iter = mm.iterator();
//		while (iter.hasNext()) {
//			System.out.println(iter.next());
//			// if (iter.next().artist.equals(text)) {			//use compareTo here
//			// System.out.println("Found: " + text);
//			// return;
//			// }
//		}
		// System.out.println("Couldn't find: " + text);
//	}

	public static void main(String[] args) {

		ArrayList<MusicModel> mm = new ArrayList<MusicModel>();
		// mm.add(new MusicModel("Gorillaz", "Feel Good Inc."));
		// mm.add(new MusicModel("Deltron 3030", "City rising from the Ashes"));

		MusicInterface mi = new MusicInterface();
		// mi.Serialize(mm);
		mm = mi.Deserialize();
		mi.DisplayList(mm);
		System.out.println("");
		//mi.SearchList(mm);
		System.out.println("Program ended...");
	}
}
