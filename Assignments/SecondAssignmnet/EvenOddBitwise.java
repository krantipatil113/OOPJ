/*
Q23:  Given a number, find whether it is  odd or even  using the  &  bitwise operator and print 
the result without using  if-else
*/


class EvenOddBitwise
{
	public static void main(String args[])
	{
		int a=12;
		if((a&1)==0)
		{
		System.out.println("even number:");
		}
		else{
		System.out.println("odd number:");
		}
	}
}