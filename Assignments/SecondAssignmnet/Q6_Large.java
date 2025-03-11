//Q6:  Write a program to find the  largest of three numbers  using only the  ternary operator 
class Q6_Large
{
public static void main(String args[])
{
	int a=23;
	int b=12;
	int c=45;
	String large=((a>b)&&(a>c)?"a is large":(b>a && b>c)? "b is large" :"c is large");
	System.out.println(large);
}
}