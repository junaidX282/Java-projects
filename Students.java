

public class Students {

	String name;
	int rollno;
	int marks;
	
	
	Students(String name, int rollno, int marks)
	{
		this.name=name;
		this.rollno=rollno;
		this.marks=marks;
	}
	void show()
	{
		if (marks>=90) {
			System.out.println(name+" "+rollno+" Grade= S");
		}
		else if (marks>=80) {
			System.out.println("name= "+name+" rollno = "+rollno+" Grade= A");
		}
		else if (marks>=70) {
			System.out.println("name= "+name+" rollno = "+rollno+" Grade= B");
		}
		else if (marks>=60) {
			System.out.println("name= "+name+" rollno = "+rollno+" Grade= C");
		}
		else if (marks>=50) {
			System.out.println("name= "+name+" rollno = "+rollno+" Grade= D");
		}
		else if (marks>=40) {
			System.out.println("name= "+name+" rollno = "+rollno+" Grade= E");
		}
		else {
			System.out.println("name= "+name+" rollno = "+rollno+" Grade= fail");		}
	}
	public static void main(String[] args) {
		

		Students obj=new Students("junaid", 7, 60);
		Students obj1=new Students("Ashi", 8, 40);
		obj.show();
		obj1.show();
	}
}


