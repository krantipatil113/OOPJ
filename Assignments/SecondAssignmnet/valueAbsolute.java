/*
Q13:  Implement a Java program to find the  absolute value  of an integer using bitwise 
operators. 
Hint  :  mask = num >> 31; abs = (num + mask) ^ mask; 
*/

class AbsioluteValue
{
	int mask=0,abs=0;
	void cal(int num)
	{
		mask=num>>31;
		abs=(num+mask)^mask;
		System.out.println(abs);
	}
	
}

class valueAbsolute{
public static void main(String args[])
{
	int num=234;
	AbsioluteValue ob=new AbsioluteValue();
	ob.cal(num);
}
}