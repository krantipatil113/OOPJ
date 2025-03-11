/*
10:  Write a program to determine if a  character is a vowel  or a consonant using the 
ternary operator.
*/
	
	class Vowels
	{
		void check(int c)
		{
			String sh= (c=='a' ||c=='A' ||c=='E' ||c=='e' ||c=='i' ||c=='I' ||c=='o' ||c=='O' ||c=='u' ||c=='U')? "character is vowel" :"character is constant";
			System.out.println(sh);
		}
	}
	
	class VowelsConst
	{
		public static void main(String args[])
		{
		char c='a';
		Vowels ob=new Vowels();
		ob.check(c);
		
		}
	}