package java_8_practice;

public interface FuncitonalInterfaceDemo {
	void avi(); //abstract Method
	
	default void print() {
		System.out.println("hello");
	}
	
	default void print1() {
		System.out.println("hello");
	}
	
}
