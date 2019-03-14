package practice.intf;

public class MainClass {

	public static void main(String[] args) {
		new InterfaceA() {
			
			@Override
			public void functionA() {
				System.out.println("functionA");
				
			}
		}.functionA();
		
		InterfaceA ia = new InterfaceClass();
		InterfaceB ib = new InterfaceClass();
		
		ia.functionA();
		ib.functionA();
		ib.functionB();
		
		// Lambda Expression
		InterfaceA ibb = () -> System.out.println("Lambda Expression");
		ibb.functionA();
	}
}
