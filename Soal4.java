import java.util.Scanner;

public class Soal4 {

	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int totalSale = keyboard.nextInt();
	    keyboard.close();
		int gajiPokok = 500000;
		int hargaItem = 50000;
        double bonus, denda, gajiAkhir;

        if (totalSale < 15) {
            denda = (totalSale - 15) * 0.15 * hargaItem;
            gajiAkhir = gajiPokok + denda;
        } else if (totalSale < 40) {
            bonus = totalSale * 0.1 * hargaItem;
            gajiAkhir = gajiPokok + bonus;
        } else if (totalSale < 80) {
            bonus = totalSale * 0.25 * hargaItem;
            gajiAkhir = gajiPokok + bonus;
        } else {
            bonus = totalSale * 0.35 * hargaItem;
            gajiAkhir = gajiPokok + bonus;
        }
        System.out.println(gajiAkhir);
	}
}

