/*
Q9:  Implement a Java program that checks if a number is  within a specific range (20 to 
50)  without using  if-else  . 
Hint  : Use  logical AND (  &&  ) in a print statement  . 
*/

class Number
{
	public void check(int a)
	{
	if(a>20 && a<50)
	{
	System.out.println("number is in range");
	}
	else{
		System.out.println("Number out of range");
	}
	}


}
class NumberCheck
{
	public static void main(String args[])
	{
		int n=34;
		Number ob=new Number();
		ob.check(n);
		
	}

}