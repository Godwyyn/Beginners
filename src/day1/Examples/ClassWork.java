package day1.Examples;
import java.util.*;

public class ClassWork {

	public static void main(String[] args) {
	Set<Person>  name = new HashSet<Person>();
	name.add( new Person("Ben" , 20 , 20));
	name.add( new Person("Godwin" , 10 , 10));
	name.add( new Person("Emman" , 2 , 5));
	
	
System.out.println(name.hashCode());
System.out.println(name.toString());



for(Person p : name){
	
	System.out.print(p.age);
	System.out.print(p.name);
	System.out.print(p.height);
	
}

for(int i =0; i< name.size(); i++){

	}

}
