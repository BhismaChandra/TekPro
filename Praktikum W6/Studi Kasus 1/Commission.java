//==================================================================//
//	Commision.java		Author: Bhisma/21-02-2023
//	
//	Represents an employee that gets paid by the hour plus commission.
//==================================================================//


public class Commission extends Hourly {
    private double totalSales;
    private double commissionRate;

	//----------------------------------------------------------
	// Constructor: Sets up this employee with the specified
	// information.
	//----------------------------------------------------------
    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double hourlyRate, double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, hourlyRate);
        this.commissionRate = commissionRate;
        totalSales = 0;  // sales has yet to be sold
    }
	
    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }

	//----------------------------------------------------------
	// Computes and returns the pay for this commission employee.
	//----------------------------------------------------------
    @Override
    public double pay() {
        double payment = super.pay(); // pay method of Hourly
        payment += totalSales * commissionRate; // add commission on sales
        totalSales = 0; // reset total sales
        return payment;
    }

	//----------------------------------------------------------
	// Returns information about this commission employee as a
	// string.
	//----------------------------------------------------------
    @Override
    public String toString() {
        String result = super.toString(); // toString method of Hourly
        result += "\nTotal sales: $" + totalSales;
        return result;
    }
}
