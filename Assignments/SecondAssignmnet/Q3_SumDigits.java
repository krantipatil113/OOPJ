/*Q3:  Implement a program that calculates the  sum of digits  of an integer using  modulus 
(  %  ) and division (  /  ) operators*/
import java.util.*;
class Q3_SumDigits
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int num=sc.nextInt();
		System.out.println("You Entered number:"+num);
		int rem,sum=0;
		while(num!=0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println("sum of digits:"+sum);
	}
}
		
