/*Q7:  Implement a Java program that checks whether a given year is a  leap year or not  using 
logical (  &&  ,  ||  ) operators  .*/

class Q7_leap
{
	public static void main(String args[])
	{
	int year=2022;
	if((year%2==0)||(year%4==0)&&(year%100!=0))
	{
	System.out.println("year is leap year:"+year);
	}else
	{
	System.out.println("year is not leap:"+year);
	}
	}
}