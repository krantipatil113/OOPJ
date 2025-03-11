//Q5:  Write a Java program to  swap two numbers  using the  +=  and  -=  operators only. 
class Q5_swap
{
	public static void main(String args[])
	{
	int a=10;
	int b=20;
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("a:"+a);
	System.out.println("b:"+b);
	}
}