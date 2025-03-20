package ExceptionAs;

import java.util.InputMismatchException;
import java.util.Scanner;

class Student
{
	String name;
	int rollNo;
	double mark[];
	double average;
	char grade;
	public Student(String name, int rollNo, double[] mark) {
		//super();
		this.name = name;
		this.rollNo = rollNo;
		this.mark = mark;
		this.average=average;
		this.grade=grade;
	}
	
	public void calculateAverage()
	{
		double sum=0;
		for(int i=0;i<mark.length;i++)
		{
			sum=sum+mark[i];
		}
		System.out.println(sum);
		average=(sum/mark.length);
		System.out.println("average:"+average);
	}
	
	public void alculateGrade()
	{
		if(average>=90)
		{
			System.out.println("Grade A");
		}
		else if(average<90 && average>=80) System.out.println("Grade B");
		else if(average<80 && average>=70) System.out.println("Grade c");
		else if(average<70 && average>=60) System.out.println("Grade D");
		else if(average<60) System.out.println("fail");
		
	}
	
	
	
}

public class Q2_ass {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student details");
		Student st=null;
		try
		{
			System.out.println("enter name");
			String name=sc.nextLine();
			System.out.println("enter rollnumber");
			int rollNum=sc.nextInt();
			System.out.println("enter marks");
			double mark[]=new double[5];
			
				for(int i=0;i<mark.length;i++)
				{
					mark[i]=sc.nextDouble();
					if(mark[i]<0 || mark[i]>100) throw new   IllegalArgumentException();
					
				}
				 st=new Student(name,rollNum,mark);
				
			
			
			
		}catch (InputMismatchException e) {
			System.out.println("OOOps! something goes wrong,please enter valid values");
		}catch(IllegalArgumentException e)
		{
			System.out.println("You entered negative values");
		}
		//System.out.println("Average:"+st.average);
		st.calculateAverage();
		st.alculateGrade();

		
	}

}
