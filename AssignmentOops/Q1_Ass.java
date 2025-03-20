/*
 * Q1. Room Volume Calculation
Design a class named Room with three data members: height, width, and breadth. Include a method
volume() to compute and return the volume of the room. Create a separate class RoomDemo that
creates instances of the Room class and displays the volume for each instance.

 */

package ClassObjectAssignment;

class Room
{
	private double height;
	private double width;
	private  double breath;
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getBreath() {
		return breath;
	}
	public void setBreath(double breath) {
		this.breath = breath;
	}
	
	
	
	public Room(double height, double width, double breath) {
		super();
		this.height = height;
		this.width = width;
		this.breath = breath;
	}
	//method calcute volume
	
	public double volume()
	{
		
		return height*width*breath;
	}
	
	
}

public class Q1_Ass{   //classDemo

	public static void main(String[] args) 
	{
		Room room=new Room(12.2,34.5,123.5);
		Room room1=new Room(23.2,12.3,56.6);
		
		System.out.println(room.volume());
		System.out.print(room1.volume());
		
		

	}

}
