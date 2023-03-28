//==================================================================//
//	WeeklySales.java	Author:Lewis/Loftus
//						Updated: Bhisma/26-02-2023
//	
//	Represents a sales person who has a first name, last name,
//	and total number of sales.
//==================================================================//

public class WeeklySales {
	public static void main (String[] args) {
		SalesPerson[] salesStaff = new SalesPerson[10];
		
		salesStaff[0] = new SalesPerson("Jane", "Jones", 3000);
		salesStaff[1] = new SalesPerson("Daffy", "Duck", 3935);
		salesStaff[2] = new SalesPerson("James", "Jones", 3000);
		salesStaff[3] = new SalesPerson("Dick", "Walter", 2800);
		salesStaff[4] = new SalesPerson("Don", "Trump", 1570);
		salesStaff[5] = new SalesPerson("Jane", "Black", 3000);
		salesStaff[6] = new SalesPerson("Harry", "Taylor", 7300);
		salesStaff[7] = new SalesPerson("Andy", "Adams", 5000);
		salesStaff[8] = new SalesPerson("Jim", "Doe", 2850);
		salesStaff[9] = new SalesPerson("Walt", "Smith", 3000);
		
		Sorting.insertionSort(salesStaff);
		
		System.out.println("\n==Ranking of Sales for the Week==\n");
		
		for(SalesPerson s : salesStaff)
			System.out.println(s);
	}
}
