import java.util.Scanner;

public abstract class Shape {

		public abstract void calculateArea(); 
			
}
class Circle extends Shape{

	
	public void calculateArea() {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter circle radius");
		int r=sc.nextInt();
		
		System.out.println("radius is :"+3.14*r*r);
	}

	
	
	
}
class Triangle extends Shape{

	
	public void calculateArea() {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter triangle hight");
		int h=sc.nextInt();
		
		System.out.println("enter triangle base");
		int b=sc.nextInt();
		
		System.out.println("radius is :"+h*b/2);
		
	}
	
}
class Rectangle extends Shape{

	
	public void calculateArea() {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter rectangle length");
		int l=sc.nextInt();
		
		System.out.println("enter rectangle width");
		int w=sc.nextInt();
		
		System.out.println("radius is :"+l*w);
	}
}
class Main2{
	public static void main(String[] args) {
		
		Rectangle obj= new Rectangle();
		obj.calculateArea();
		
		Circle obj2 = new Circle();
		obj2.calculateArea();
		
		Triangle obj3 = new Triangle();
		obj3.calculateArea();
	}
}