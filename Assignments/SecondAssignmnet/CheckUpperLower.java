/*
Q19:  Write a Java program that checks whether a character is  uppercase, lowercase, or 
not a letter  using only the ternary operator
*/


class UpperLower
{
	static void check(char ch)
	{
		int a=(int)ch;
		String result = (a>64 && a<91)? "Uppercase" : (a>96 && a<123)? "Lowercase" : "Not a character";
		System.out.println(result);
	}

}

class CheckUpperLower
{
	public static void main(String args[])
	{
	
	UpperLower.check('b');
	UpperLower.check('S');
		
	}
}