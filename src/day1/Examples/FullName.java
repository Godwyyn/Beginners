package day1.Examples;
import java.util.Scanner;


public class FullName {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String firstName,secondName, lastName;
		int yearOfBirth;
		int age;
		System.out.print("Enter your first name ");
		firstName = input.next();
		System.out.print("Enter your Middle name ");
		secondName = input.next();
		System.out.print("Enter your surname ");
		lastName = input.next();
		System.out.print("Enter your year of birth ");
		yearOfBirth = input.nextInt();
		age = 2016 - yearOfBirth;
		
		System.out.println("Your full name is " + lastName + "," + firstName + " " + secondName+"\nand you are "+ age +"years");
		
		

	}

}
