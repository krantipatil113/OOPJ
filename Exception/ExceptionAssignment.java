/*
 * Q1. Electricity Bill Calculation with Exception Handling 
Design a Java program to calculate the electricity bill for a customer, including exception 
handling for invalid input values. Implement a class named ElectricityBill with the following 
specifications: 
Class: ElectricityBill 
Instance Variables 
●  customerName (String): Name of the customer 
●  unitsConsumed (double): Number of electricity units consumed 
●  billAmount (double): The calculated bill amount 
Constructor 
●  A parameterized constructor to initialize the customerName and unitsConsumed 
fields. 
●  Throw an IllegalArgumentException if unitsConsumed is negative. 
Method 
●  void calculateBillAmount(): This method calculates the electricity bill based on the 
following rules: 
○  First 100 units: Rs. 5 per unit 
○  Next 200 units (101–300): Rs. 7 per unit 
○  Above 300 units: Rs. 10 per unit 
Main Program 
In the main() method: 
1.  Prompt the user to enter the customer’s name and units consumed. 
2.  Use try-catch blocks to handle the following scenarios: 
○  Catch InputMismatchException if the user enters non-numeric data for units. 
○  Catch IllegalArgumentException if a negative value is entered for units. 
3.  If the input is valid, create an object of the ElectricityBill class, compute the bill using 
calculateBillAmount(), and print the customer’s name, units consumed, and the total 
bill amount.
 */

package ExceptionAs;

import java.util.InputMismatchException;
import java.util.Scanner;


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
public class ExceptionAssignment {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter details");
		System.out.println("enter name");
		String name=sc.nextLine();
		ElectricityBill ob=null;
		System.out.println("enter the Units");
		try {
			
			double unit=sc.nextDouble();
			
			ob=new ElectricityBill(name,unit);
		}catch (InputMismatchException e) {
			System.out.println("OOOps! something goes wrong,please enter valid values");
		}catch(IllegalArgumentException e)
		{
			System.out.println("You entered negative values");
		}
		
		double TotalBill=ob.calculateBillAmount();
		System.out.println("name:"+ob.custerName+":Unit:"+ob.unitAmount+":TotalAmount:"+TotalBill);
	
		

	}

}
