import java.util.Scanner;

public class Soal2 {

	public static void main (String[] args) {
		Scanner keyboard = new Scanner (System.in);
		while (keyboard.hasNext()) {
			String kalimat = keyboard.next();
			int nomor = keyboard.nextInt();
			System.out.printf("%-15s%03d\n", kalimat, nomor);

		}
		keyboard.close();
	}
}

