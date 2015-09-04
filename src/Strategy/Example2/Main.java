package Strategy.Example2;

public class Main {

	public static void main(String[] args) {
	      Context context = new Context(new Add());		
	      System.out.println("10 + 20 = " + context.executestretagy(10, 20));

	      context = new Context(new Substract());		
	      System.out.println("10 - 20 = " + context.executestretagy(10, 20));

	      context = new Context(new Multiply());		
	      System.out.println("10 * 20 = " + context.executestretagy(10, 20));
	   }
}
