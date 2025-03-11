/*
Q16:  Write a program that determines whether a given number is  positive, negative, or 
zero  using only the  ternary operator  . 
*/

class PositiveNegative
{
	void check(int a)
	{
		String num= (a>0)?"positive number" :(a<0)?"negative number":"equals to zerro";
		System.out.println(num);
		
	}

}
class checkNumber
{
	public static void main(String args[])
	{
		int a=0;
		PositiveNegative ob=new PositiveNegative();
		ob.check(a);
	}
}