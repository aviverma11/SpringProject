package java_8_practice;

public class TestInterface implements InterfaceDemoImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		InterfaceDemoImp obj = new TestInterface();
		obj.avinash1();
		InterfaceDemoImp.raviraj();

	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("which one will run");
		
	}
	public void avinash1() {
		InterfaceDemoImp.super.avinash1();
		System.out.println("inside class avinsh");
	}

}
