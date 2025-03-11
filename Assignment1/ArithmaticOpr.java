import java.util.Scanner;
class ArithmaticOpr
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the first number:");
	int num1=sc.nextInt();
	System.out.println("enter the second number");
	int num2=sc.nextInt();
	int add,sub,mul,div;
	add=num1+num2;
	System.out.println("addition of program:"+add);
	sub=num1-num2;
	System.out.println("Substraction of number:"+sub);
	mul=num1*num2;
	System.out.println("Multiplication of number:"+mul);
	div=num1/num2;
	System.out.println("Division of numbers:"+div);
	
	
	
	
	}
}
	