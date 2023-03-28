//==================================================================//
//	SalesPerson.java	Author:Lewis/Loftus
//						Updated: Bhisma/26-02-2023
//	
//	Represents a sales person who has a first name, last name,
//	and total number of sales.
//==================================================================//

public class SalesPerson implements Comparable {
	private String firstName, lastName;
	private int totalSales;

	//----------------------------------------------------------
	//	Contstructor: Sets up the sales person object with
	//				  the given data.
	//----------------------------------------------------------
	public SalesPerson (String firstName, String lastName, int sales) {
		this.firstName = firstName;
		this.lastName = lastName;
		totalSales = sales;
	}

	//----------------------------------------------------------
	//	Return the sales person as a string
	//----------------------------------------------------------
	public String toString() {
		return lastName + ", " + firstName + ":\t" + totalSales;
	}

	//----------------------------------------------------------
	//	Return true if the sales people have the same name
	//----------------------------------------------------------
	public boolean equals(Object other) {
		return (lastName.equals(((SalesPerson)other).getLastName())
				&& firstName.equals(((SalesPerson)other).getFirstName()));
	}

	//----------------------------------------------------------
	//	Order is based on total sales with the name
	//	(last, then first) breaking a tie.
	//----------------------------------------------------------
	public int compareTo(Object other) {
		SalesPerson otherSalesPerson = (SalesPerson) other;
		
		int salesComparison = Integer.compare(this.totalSales, otherSalesPerson.totalSales);
		if (salesComparison != 0) {
			return salesComparison;
		}
		
		int lastNameComparison = this.lastName.compareTo(otherSalesPerson.lastName);
		if (lastNameComparison != 0) {		// compareTo method of String class
			return lastNameComparison;
		}

		return this.firstName.compareTo(otherSalesPerson.firstName);
	}



	//----------------------------------------------------------
	//	First name accessor.
	//----------------------------------------------------------
	public String getFirstName() {
		return firstName;
	}

	//----------------------------------------------------------
	//	Last name accessor.
	//----------------------------------------------------------
	public String getLastName() {
		return lastName;
	}

	//----------------------------------------------------------
	//	Last name accessor.
	//----------------------------------------------------------
	public int getSales() {
		return totalSales;
	}
}