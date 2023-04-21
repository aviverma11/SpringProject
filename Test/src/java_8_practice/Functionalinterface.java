package java_8_practice;

public class Functionalinterface {

	public static void main(String[] args)
    {
		Functionalinterface pMain=new Functionalinterface();
        pMain.printForm(() -> System.out.println("Printing form"));
    }
 
    public void printForm(Printable p)
    {
        p.print();
    }
}
