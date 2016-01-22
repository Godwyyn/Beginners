package day1.Examples;
import java.util.Scanner;
public class SwitchCase {
	
	Scanner input;
	
	public SwitchCase(){
		
	 input = new Scanner(System.in);
		
	}

	public static void main(String[] args) {
		
		
		SwitchCase a = new SwitchCase();
		
		int score = 0;
		//score = a.input.nextInt(score);
		switch( score ){
		case 70:
			score = 70 - 100  ;
			firstClass();
			break;
		case 2:
			score = 60 - 69;
			secondClass();
		break;
		case 3:
			score = 50 ;
			thirdClass();
			break;
			default:
				System.out.println("no resullt");
			
		}
	}
	
	
	public  static void firstClass(){
		System.out.println("your grade is A");
		
	}
	public static void secondClass(){
		System.out.println("your grade is B");
	}

 public static void thirdClass(){
System.out.println("your grade is C");	
}
}