package java_8_practice;

public interface Printable {
	 
    void print();
    default void printColor()
    {
        System.out.println("Printing Color copy");
    }
}
