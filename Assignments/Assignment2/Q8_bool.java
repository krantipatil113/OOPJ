/*Q8:  Write a program that  takes three boolean inputs  and prints  true  if at least two of 
them are  true  . 
Hint  : Use logical operators (  &&  ,  ||  ). */

class Q8_bool
{
	public static void main(String args[])
	{
	boolean a=true;
	boolean b=false;
	boolean c=true;
	
	if(a &&(b||c) ||(b &&(a||c)) ||(c && (a||b)))
	{
	System.out.println(true);
	}
	else
	{
	System.out.println(false);
	}
	}
}