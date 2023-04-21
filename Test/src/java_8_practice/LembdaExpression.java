package java_8_practice;

import java.util.function.BiConsumer;

public class LembdaExpression {

	public static void main(String[] args) {
		BiConsumer<Integer, Integer> biconsumer = (a,b)->System.out.println(a+b);
	}

}
