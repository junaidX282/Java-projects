import java.time.DateTimeException;
import java.util.Scanner;
import java.util.zip.DataFormatException;

public class DiaryEntry {

	int date;
	String entryText;
	String mood="happy";
	
	
	public static void main(String[] args) {
		DiaryEntry obj =new DiaryEntry();
		Scanner sc = new Scanner(System.in);
		
		
		
		try {
			System.out.println(" enter date:");
			int date = sc.nextInt(); 
			if(date>31) {
				throw new DateTimeException("jhg");
			}
			else {
				System.out.println("date = "+date);
				System.out.println("mood  = "+obj.mood);
				
				System.out.println("enter text");
				String str=sc.next();
				System.out.println(str);
			}
		}catch (DateTimeException e) {
			System.out.println("date is wrong");
		}catch (Exception e) {
			System.out.println("please enter integer");
		}
	}
}
