/*
 * Q6. Electricity Bill Calculation – Java Program 
Design a Java program to calculate the electricity bill for a customer based on the number of units 
consumed. Implement a class named ElectricityBill with the following specifications: 
Class: ElectricityBill 
Instance Variables 
●  customerName (String): Name of the customer 
●  unitsConsumed (double): Number of electricity units consumed 
●  billAmount (double): The calculated bill amount 
Constructor 
●  A parameterized constructor to initialize the customerName and unitsConsumed fields. 
Method 
●  void calculateBillAmount(): This method calculates the electricity bill amount based on the 
following tariff rules: 
○  First 100 units: Rs. 5 per unit 
○  Next 200 units (i.e., 101 to 300): Rs. 7 per unit 
○  Remaining units (above 300): Rs. 10 per unit 
Main Program 
In the main() method: 
 */
package ClassObjectAssignment;

class ElectricityBill
{
	String custerName;
	double unitAmount;
	double billAmount;
	
	ElectricityBill(String name,double unit)
	{
		this.custerName=name;
		this.unitAmount=unit;
	}
	
	double  calculateBillAmount()
	{
		if(unitAmount<100)
		{
			return unitAmount*5;
		}
		else if(unitAmount>100)
		{
			return (100*5)+(unitAmount-200)*7;
		}
		else
		{
			return (100*5)+(200*7)+(unitAmount-300)*10;
		}
		
	}
}

public class Q6_Ass {

	public static void main(String[] args) {
		ElectricityBill ob=new ElectricityBill("ajit",76);
		System.out.println(ob.calculateBillAmount());
		

	}

}
