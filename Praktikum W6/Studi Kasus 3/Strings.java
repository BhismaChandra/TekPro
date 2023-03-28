//==================================================================//
//	String.java		Author:Lewis/Loftus
//					Updated: Bhisma/25-02-2023
//	
//	Demonstrate the selection sort on an array of strings.
//==================================================================//

import java.util.Scanner;

public class Strings {
	//----------------------------------------------------------
	//	Reads in an array of strings, sorts them,
	//	then prints them in sorted order.
	//----------------------------------------------------------
	public static void main(String[] args) {
		String[] stringList;
		int size;
		
		Scanner scan = new Scanner(System.in);

		System.out.println("\nHow many strings do you want to sort? ");
		size = scan.nextInt();
		stringList = new String[size];

		System.out.println("\nEnter the strings...\n");
		for (int i = 0; i < size; i++) {
			stringList[i] = scan.next();
		}

		scan.close();

		Sorting.selectionSort(stringList);

		System.out.println("\nSelection Sort:\n");
		for (int i = 0; i < size; i++) {
			System.out.println(stringList[i] + " ");
		}
		System.out.println();

		Sorting.insertionSort(stringList);

		System.out.println("\nInsertion Sort:\n");
		for (int i = 0; i < size; i++) {
			System.out.println(stringList[i] + " ");
		}
		System.out.println();
	}
}