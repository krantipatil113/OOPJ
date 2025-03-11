//6. Write a program to display character and string literals along with their ASCII values.
import java.util.*;
class charString
{
public static void main(String args[])
{
	char ch='a';
	String s1="Kranti";
	int i,j;
	System.out.println("Character:"+ch+" "+(int)ch);
	for( i=0;i<s1.length();i++);
	{
	 j=(int)s1.charAt(i);
		System.out.println(s1.charAt(i)+" "+j);
	}
	
	
	
	
}
}