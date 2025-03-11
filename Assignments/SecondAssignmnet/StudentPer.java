/*
Q18:  Given a student’s percentage, print  “Pass”  if the percentage is 40 or above; 
otherwise, print  “Fail”  , using only the ternary operator. 
*/

class Student
{
	static void passFail(int per)
	{
		String res=(per>=40)?"pass" :"fail";
		System.out.println(res);
	}
}

class StudentPer
{
	public static void main(String args[])
	{
		int per=60;
		Student.passFail(per);
	}
}