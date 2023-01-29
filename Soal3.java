import java.util.Scanner;

public class Soal3 {

	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
        int angka1 = keyboard.nextInt();
        char operator = keyboard.next().charAt(0);
        int angka2 = keyboard.nextInt();
	    keyboard.close();

        switch (operator) {
            case '+':
                System.out.println(angka1 + angka2);
                break;
            case '-':
                System.out.println(angka1 - angka2);
                break;
            case '*':
                System.out.println(angka1 * angka2);
                break;
            case '/':
                System.out.println(angka1 / angka2);
                break;
            case '%':
                System.out.println(angka1 % angka2);
                break;
        }
	}
}

