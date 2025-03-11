/*
Q12:  Write a Java program to  multiply a number by 8  without using  *  or  /  operators. 
Hint  : Use bitwise left shift (  <<  ).
*/

class multiplyNumber
{
	int num;
	void mul(int a)
	{
		 num=a<<2;
		System.out.println(num);
	}
	

}

class Number
{
	public static void main(String args[])
	{
		int a=8;
		multiplyNumber ob=new multiplyNumber();
		ob.mul(a);
	}
}