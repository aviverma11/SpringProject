package java_8_practice;

@FunctionalInterface
public interface InterfaceDemoImp {
	public void method1();
	
	default void avinash1() {
		System.out.println("its avinash");
	}
	static void raviraj() {
		System.out.println("its raviraj");
	}
}
