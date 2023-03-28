//==================================================================//
//	Numbers.java	Author:Lewis/Loftus
//					Updated: Bhisma/25-02-2023
//	
//	Demonstrate the selection sort on an array of integers.
//==================================================================//

import java.util.Scanner;

public class Numbers {
	//----------------------------------------------------------
	//	Reads in an array of integers, sorts them,
	//	then prints them in sorted order.
	//----------------------------------------------------------
	public static void main(Strings[] args) {
		Integer[] intList;
		int size;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nHow many integers do you want to sort? ");
		size = scan.nextInt();
		intList = new Integer[size];
		
		System.out.println("\nEnter the numbers...\n");
		for (int i = 0; i < size; i++) {
			intList[i] = scan.nextInt();
		}
		
		scan.close();

		Sorting.selectionSort(intList); 
		// error: The method selectionSort(Comparable ) in the type sorting is not applicable for the argument (int )
		// to fix this, we need to use Integer data type rather than int. So, change intList data type to Integer.

		System.out.println("\nSelection Sort:");
		for (int i = 0; i < size; i++) {
			System.out.println(intList[i] + " ");
		}
		System.out.println();
		
		Sorting.insertionSort(intList);
		
		System.out.println("\nInsertion Sort:\n");
		for (int i = 0; i < size; i++) {
			System.out.println(intList[i] + " ");
		}
		System.out.println();
	}
}
