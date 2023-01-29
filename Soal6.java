import java.math.BigInteger;
import java.util.Scanner;

public class Soal6 {
	public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        BigInteger angka1 = new BigInteger(keyboard.nextLine());
        BigInteger angka2 = new BigInteger(keyboard.nextLine());
        keyboard.close();
        
        BigInteger jumlah = angka1.add(angka2);
        BigInteger kali = angka1.multiply(angka2);
        System.out.println(jumlah);
        System.out.println(kali);
    }
}
