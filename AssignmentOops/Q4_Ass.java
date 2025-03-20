/*
 * Q4. Complex Number Operations 
Create a class to represent complex numbers. Include the following constructors: 
1.  A default constructor that sets both real and imaginary parts to 0 
2.  A constructor that initializes the real part only 
3.  A constructor that initializes both real and imaginary parts 
Also, write member functions to: 
●  Add two complex numbers 
●  Multiply two complex numbers 
In the main() method: 
●  Create two complex numbers: 3 + 2i and 4 - 2i 
●  Display their sum and product
 */
package ClassObjectAssignment;

class ComplexNumber
{
	int real;
	int img;
	
	//default constructor
	public ComplexNumber()
	{
		
	}
	
	//
	public  ComplexNumber(int a,int b)
	{
		this.real=a;
		this.img=b;
	}
	
	static void addNumber(ComplexNumber c1,ComplexNumber c2)
	{
		ComplexNumber cm=new ComplexNumber();
		cm.real=c1.real+c2.real;
		cm.img=c1.img+c2.img;
		
		System.out.println(cm.real+"+i"+cm.img);
	}
	
	
	static void mulNumber(ComplexNumber c1,ComplexNumber c2)
	{
		ComplexNumber cm=new ComplexNumber();
		cm.real=c1.real*c2.real;
		cm.img=c1.img*c2.img;
		
		System.out.println(cm.real+"+i"+cm.img);
	}
	
}

public class Q4_Ass {

	public static void main(String[] args) 
	{
		ComplexNumber c1 =new ComplexNumber(1,4);
		
		System.out.println(c1.real+"+i"+c1.img);
		
		ComplexNumber c2 =new ComplexNumber(4,7);
		System.out.println(c2.real+"+i"+c2.img);
		
		ComplexNumber.addNumber(c1,c2);
		ComplexNumber.mulNumber(c1,c2);
		
		//System.out.println()
		
	

	}

}
