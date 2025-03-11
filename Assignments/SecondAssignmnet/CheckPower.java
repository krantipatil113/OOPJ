/*
Q11:  Write a program to check if a given number is a  power of 2  using bitwise operators. 
Hint  :  n & (n - 1) == 0  for positive numbers. 
*/


class PowerOf
{
	void check(int n)
	{
		if((n &(n-1))==0)
		{
		System.out.println("number is power of 2:"+n);
		}
		else
		{
		System.out.println("number is not power of 2:"+n);
		}
	}
}

class CheckPower
{
	public static void main(String args[])
	{
		PowerOf ob=new PowerOf();
		ob.check(8);
	}
}