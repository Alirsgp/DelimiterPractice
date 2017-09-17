import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class PracticeDelimiter {
	static File myFile = new File("crazyText.txt");
	private static Scanner uploadedFile;
	public static void main(String [] args) {

		try {
		uploadedFile = new Scanner(myFile);
		uploadedFile.useDelimiter("/|#|%");

		} catch(Exception ex) {
			System.out.println("File not found!");
		}
		while(uploadedFile.hasNext()) {
		String myText = uploadedFile.next();
		System.out.print(myText);
		System.out.print(" ");
			} 
		}
	}