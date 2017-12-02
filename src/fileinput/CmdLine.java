package fileinput;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CmdLine {

	public void useInputSR() {

		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);

			System.out.println("Enter some text: ");
			String text = br.readLine();
			System.out.println("You entered: " + text);

			isr.close();
		} catch (Exception e) {
			System.out.println("something went haywire!!");
		}
	}

	public void useScanner() {

		try {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter some text: ");
			
			int count = 0;
			while (sc.hasNext()) {
				if(++count <= 1)
					System.out.print("You entered: ");
				System.out.print(sc.next() + " ");
			}

			sc.close();
		} catch (Exception e) {
			System.out.println("something went haywire!!");
		}
	}

	public static void main(String[] args) {

		CmdLine cLine = new CmdLine();
		// cLine.useInputSR();
		cLine.useScanner();
	}
}
