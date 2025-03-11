/*
Q17:  Implement a Java program that finds the  minimum of four numbers  using nested 
ternary operators

*/

class MinimumNumber
{
	static void min(int a,int b,int c,int d)
	{
		int res=(a<b && a<c && a<d)?a :(b<a && b<c && b<d)?b:(c<a && c<b && c<d)? c:d;
		System.out.println(res);
	}

}
class NumberMin
{
	public static void main(String args[])
	{
		int a=12,b=23,c=45,d=56;
		MinimumNumber.min(a,b,c,d);
		
	}
}