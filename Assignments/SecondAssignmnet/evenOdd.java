/*
Q15:  Implement a program to swap  odd and even bits  of a number using bitwise 
operators. 
Hint  : Use masks:  (x & 0xAAAAAAAA) >> 1 | (x & 0x55555555) << 1 
*/

class EvenOdd
{
	void swap(int a)
	{
		int evenBits = (a & 0xAAAAAAAA) >> 1; // Get even bits and shift right
        int oddBits = (a & 0x55555555) << 1;   // Get odd bits and shift left
        int res = (evenBits | oddBits);   
		System.out.println(res);
	}
}
class evenOdd
{
	public static void main(String args[])
	{
	int a=10,b=20;
	EvenOdd ob=new EvenOdd();
	ob.swap(a);
	
	}

}