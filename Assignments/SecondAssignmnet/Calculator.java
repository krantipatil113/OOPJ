/*
Q22:  Implement a  calculator  that takes two numbers and an operator (  +  ,  -  ,  *  ,  /  ) as input 
and prints the result using only  switch-case  .
*/

import java.util.Scanner;
class Calculator
{

public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number and operation want to perform");
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	sc.nextLine();
	String opr=sc.nextLine();
	
	switch(opr)
	{
		case "add" :int sum=n1+n2;
					System.out.println(sum);
					break;
		case "sub" :int sub=n1-n2;
					System.out.println(sub);
					break;
		case "mul" :int mul=n1*n2;
					System.out.println(mul);
					break;
		case "div" :int div=n1/n2;
					System.out.println(div);
					break;
		default :System.out.println("invalid");
				break;
	
	
	
	
	}
}
}