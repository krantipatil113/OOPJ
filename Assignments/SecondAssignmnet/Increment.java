/*
Q21:  Write a program that  increments a number without using  +  or  ++  operators. 
Hint  : Use bitwise  - (~x) 
*/

class Increment
{
	public static void main(String args[])
	{
		int x=12;
		System.out.print(-(~x));
	}

}
