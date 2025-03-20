package ClassObjectAssignment;
class Box{
	double Height;
	double width;
	double breadth;
	
	Box(double Height,
	double width,
	double breadth){
		
		this.breadth=breadth;
		this.Height=Height;
		this.width=width;
	}
	
	public double getVolume()
	{
		return Height*width*breadth;
	}
	
	public double getArea()
	{
		return (2*breadth*width+2*breadth*Height+2*width*Height);
	}
	
	
}

public class Q3_Ass {

	public static void main(String[] args) {
		Box b=new Box(12.3,3.2,5.6);
		System.out.println(b.getArea());
		System.out.println(b.getVolume());
		
		

	}

}
