



public class MathToolKit {
	

	void calculate(int a ,int b) {
		
		int result =a-b;
		 System.out.println("result = "+result);
		 
		 System.out.println("maxium "+Math.max(a, b));
		 System.out.println("minimum ="+Math.min(a, b));
	}
	
	void calculate(int a, int b,int c) {
			int result=a+b+c;
			System.out.println("result = "+result);
			 
			 System.out.println("maxium "+Math.max(a,Math.max(c, b)));
			 System.out.println("minimum ="+Math.min(a,Math.min(b, c)));
	}
	
	void calculate(double a,double b) {
		double result=a/b;
		
		System.out.println("result = "+result);
		 
		 System.out.println("maxium "+Math.max(a, b));
		 System.out.println("minimum ="+Math.min(a, b));
	}
	
	void calculate(double a , double b,int c) {
		double result=a*b*c;
		System.out.println("result = "+result);
		 
		 System.out.println("maxium "+Math.max(a, b));
		 System.out.println("minimum ="+Math.min(a, b));
	}
	
}
class main3{
	
	public static void main(String[] args) {
		 MathToolKit obj = new MathToolKit();

		 obj.calculate(1.6,1.1,1);
		 //obj.calculate(67, 7,5);
		 
		
	}
}
	

