/*Q2:  Write a program to check whether a given number is  even or odd  using only  bitwise 
operators  . 
Hint  : Use  n & 1  to check.*/
import java.util.Scanner;
class Q2_EvenOdd
{
	public static void main(String args[])
	{
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number to check even odd");
	int num=sc.nextInt();
	
	String str=((num ^ 1) == (num + 1))?"even":"odd";
	System.out.println("number is:"+str);
	}
}
	
