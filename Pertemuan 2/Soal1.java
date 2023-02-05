import java.util.Scanner;

public class Soal1 {

	public static void main (String[] args) {
		Scanner keyboard = new Scanner (System.in);
		String kalimat = keyboard.nextLine();
		keyboard.close();

		String[] tokens = kalimat.split("[^A-Za-z]+");
		int n = tokens.length;
		System.out.println(n);
		for (String token : tokens) {
			System.out.println(token);
		}
	}
}



