//Write a program to convert a double value to int using typecasting and explain the data loss.
class doubleInt
{
public static void main(String args[])
{
	int a=2341;
	double d=2313.45644;
	System.out.println(a);
	System.out.println("double to int:"+(int)d);
}
}

//when user forcefully do the castiong of data then we can loss the data,if we cast big size od data to 
//small size then it can be loss the data.