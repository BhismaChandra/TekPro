import java.util.Scanner;

public class Soal5 {
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
        String plat = keyboard.nextLine();
	    keyboard.close();
        long gabung = Long.parseLong(plat.replace(" ",""));
        long sisa = (gabung - 999999) % 5;
        if (sisa == 0) {
            System.out.println("Jalan");
        } else {
            System.out.println("Berhenti");
        }
    }
}