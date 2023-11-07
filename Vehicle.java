
public class Vehicle {

	String vehicleType;
	int rentalRate;
	
	public void rent(String vehicle,int rent ) {
		rent=rent*30;
		System.out.println(vehicle+" "+rent);
	}
	
}


class Car extends Vehicle{
	
	
}
class Motorvehicle extends Vehicle{
	

	
}
class Van extends Vehicle{
	
	
}
class Main {
	public static void main(String[] args) {
		
		Vehicle obj = new Car();
		obj.rent("innova",500);
		
		Vehicle obj1 = new Van();
		obj.rent("van",8500);
	}
}
