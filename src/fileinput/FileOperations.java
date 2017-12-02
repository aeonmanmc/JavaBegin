package fileinput;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOperations {

	public void WriteFile(String text) {

		try {
			FileOutputStream fos = new FileOutputStream(
					"C:/Users/t_sus_000/Desktop/EclipseFiles/abc.txt");
			byte b[] = text.getBytes();
			fos.write(b);
			fos.close();
			System.out.println("success...");
		} catch (Exception e) {
			System.out.println("sum exception bro!!");
		}
	}

	public void ReadFile() {

		try {
			FileInputStream fis = new FileInputStream(
					"C:/Users/t_sus_000/Desktop/EclipseFiles/abc.txt");
			int i = 0;
			while ((i = fis.read()) != -1)
				System.out.print((char) i);
			fis.close();
		} catch (Exception e) {
			System.out.println("Couldn't open file !!");
		}
	}

	public void WriteBuffered(String text) {

		try {
			FileOutputStream fos = new FileOutputStream(
					"C:/Users/t_sus_000/Desktop/EclipseFiles/abc.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			byte b[] = text.getBytes();
			bos.write(b);
			bos.flush();
			bos.close();
			fos.close();
			System.out.println("success...");
		} catch (Exception e) {
			System.out.println("sum exception bro!!");
		}
	}

	public void ReadBuffered() {

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
			System.out.println("Couldn't open file !!");
		}
	}

	public static void main(String[] args) {
		FileOperations oper = new FileOperations();
		// oper.WriteFile("Hello there!!!");
		// oper.ReadFile();
		oper.WriteBuffered("Jello 1 out buffer");
		// oper.ReadBuffered();
	}

}
