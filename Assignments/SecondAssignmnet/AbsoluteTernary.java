/*
Q20:  Implement a Java program that  returns the absolute value  of a given number using 
the ternary operator (without using  Math.abs() 
*/

class AbsoluteTernary
{
	public static void main(String args[])
	{
		int a=34;
		int x=(a>0)?a:-a;
		System.out.println(a+" "+x);
	}
}