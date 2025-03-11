/*
Q25:  Implement a program that reverses an  integer number  without using string 
conversion (  StringBuilder  or  toCharArray  ). 
Hint  : Use  while(n!=0) { rev = rev * 10 + n % 10; n /= 10; } 
*/

class ReverseNumber
{
	public static void main(String args[])
	{
		int a=5634;
		int rev=0,rem=0;
		while(a!=0)
		{
			
			rem=a%10;
			rev=rev*10+rem;
			a=a/10;
		}
		System.out.println("reverse:"+rev);
	
	}
	
}