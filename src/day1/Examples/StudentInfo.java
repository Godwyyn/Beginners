package day1.Examples;
import java.util.Scanner;

public class StudentInfo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Student myInfo = new Student();
		myInfo.firstName = input.next();
		myInfo.dept = input.next();
		myInfo.getExamScore();
		System.out.println(myInfo.examScore);
	}


}
