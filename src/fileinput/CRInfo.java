package fileinput;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CRInfo {

	public void WriteFile(String[] names) {

		try {

			FileOutputStream fos = new FileOutputStream(
					"C:/Users/t_sus_000/Desktop/EclipseFiles/abc.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);

			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < names.length; i++)
				sb.append(names[i] + " ");
			String text = sb.toString();
			System.out.println(text);
			byte b[] = text.getBytes();
			bos.write(b);

			bos.flush();
			bos.close();
			fos.close();
			System.out.println("success...");
		} catch (Exception e) {
			System.out.println("couldn't create file...");
		}
	}

	public void ReadFile() {

		try {

			FileInputStream fis = new FileInputStream(
					"C:/Users/t_sus_000/Desktop/EclipseFiles/abc.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);

			int i = 0;
			while ((i = bis.read()) != -1)
				System.out.print((char) i);

			bis.close();
			fis.close();
		} catch (Exception e) {
			System.out.println("couldn't open file...");
		}
	}

	public static void main(String[] args) {

		CRInfo cfo = new CRInfo();
		//String names[] = { "Amir", "Bmir", "Cmir" };

		//cfo.WriteFile(names);
		cfo.ReadFile();
	}

}
