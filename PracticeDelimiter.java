import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class PracticeDelimiter {
	static File myFile = new File("crazyText.txt");
	static File outFile = new File("outFile.txt");
	static PrintWriter output;
	private static Scanner uploadedFile;


	public static void main(String [] args) throws FileNotFoundException {

		try {
		uploadedFile = new Scanner(myFile);
		uploadedFile.useDelimiter("/|#|%|//n| ");
		output = new PrintWriter(outFile);

		} catch(Exception ex) {
			System.out.println("File not found!");
		}
		while(uploadedFile.hasNext()) {
		String myText = uploadedFile.next();
		System.out.print(myText);
		System.out.print(" ");
		try {
				output.print(myText + " ");
			} catch (Exception e) {
				System.out.println("Lol");
			}
		}
		output.close();

		System.out.println(); 
		}

	}
