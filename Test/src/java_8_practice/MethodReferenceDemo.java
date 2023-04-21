package java_8_practice;

class Test{
	public static void testing() {
		System.out.println("its working");
	}
}
public class MethodReferenceDemo {

	public static void main(String[] args) {
		FuncitonalInterfaceDemo demo = Test::testing;
		demo.avi();
	}

}
