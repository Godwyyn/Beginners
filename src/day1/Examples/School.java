package day1.Examples;

public class School <T> {
	private T teachers;
	public void set(T teachers){
		this.teachers = teachers;
		
	}
public T get(){
	return teachers;
}
}
