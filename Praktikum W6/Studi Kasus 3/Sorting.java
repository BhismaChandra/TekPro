//==================================================================//
//	Sorting.java	Author:Lewis/Loftus
//					Updated: Bhisma/25-02-2023
//	
//	Demonstrate the selection sort and insertion sort algorithms.
//==================================================================//

public class Sorting {
	//----------------------------------------------------------
	//	Sorts the specified array of objects using the selection
	//	sort algorithm.
	//----------------------------------------------------------
	public static void selectionSort(Comparable[] list) {
		int min;
		Comparable temp;
		
		for (int index = 0; index < list.length - 1; index++) {
			min = index;
			for (int scan = index + 1; scan < list.length; scan++)
				if (list[scan].compareTo(list[min]) < 0)
					min = scan;
			
			//swap the values
			temp = list[min];
			list[min] = list[index];
			list[index] = temp;
		}
	}
	
	//----------------------------------------------------------
	//	Sorts the specified array of objects using the insertion
	//	sort algorithm.
	//----------------------------------------------------------
	public static void insertionSort(Comparable[] list) {
		for (int index = 1; index < list.length; index++) {
			Comparable key = list[index];
			int position = index;
			
			// shift smaller value to the right
			// modify the sorted order by changing the comparison operator
			while (position > 0 && key.compareTo(list[position - 1]) > 0) {
				list[position] = list[position - 1];
				position--;
			}
			list[position] = key;
		}
	}
}
