/*
Q14:  Write a program to count the  number of 1s (set bits)  in a binary representation of a 
number using bitwise operations. 
Hint  : Use  n & (n - 1) 
*/

class CountOnes
{
	void count(int num)
	{
		int c=0;
		while(num>0)
		{
		num=(num&(num-1));
		c++;
		}
		System.out.println(c);
	
	}
}

class countBinaryOne
{
	public static void main(String arg[])
	{
	 int num=5;
	 CountOnes ob=new CountOnes();
	 ob.count(num);
		
	}
}