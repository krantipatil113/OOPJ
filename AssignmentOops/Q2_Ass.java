/*
 * Q2. Student Marks and Average 
Create a class Student with the following members: 
●  Name of the student 
●  Marks in three subjects 
●  A method to assign initial values 
●  A method to compute the total and average marks 
●  A method to display the student’s name and total marks 
Write a main() method to demonstrate the functionality of the class.
 */
package ClassObjectAssignment;

class Student
{
	String studentName;
	int english_Mark;
	int math_Mark;
	int science_Mark;
	int sum=0;
	public void value_marks(String name,int m1,int m2,int m3)
	{
		this.studentName=name;
		this.english_Mark=m1;
		this.math_Mark=m2;
		this.science_Mark=m3;
	}
	
	public void total_Average()
	{
		 sum=english_Mark+math_Mark+science_Mark;
		int avg=sum/3;
		System.out.println("average:"+avg);
	}
	
	public void Student_details()
	{
		System.out.println("Student Name:"+studentName);
		System.out.println("Total marks:"+sum);
	}
}

public class Q2_Ass {

	public static void main(String[] args) {
		Student st=new Student();
		st.value_marks("kranti",40, 60, 76);
		
		
		st.total_Average();
		st.Student_details();
		

	}

}
