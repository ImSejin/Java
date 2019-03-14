package practice.intf;

public class InterfaceClass implements InterfaceA, InterfaceB {

	public InterfaceClass() {
		System.out.println(" -- InterfaceClass constructor -- ");
	}
	
	public InterfaceClass(String str){
		this();
		System.out.println("str");
	}
	
	@Override
	public void functionA() {
		System.out.println(" -- functionA() -- ");
	}

	@Override
	public void functionB() {
		System.out.println(" -- functionB() -- ");
		
	}
}
