package practice;

public class Human {
	
	private double height = 177.1;
	private double weight = 69.2;
	private String blood_type = "A";
	
	public Human() {
		
	}
	
	public Human(double height, double weight, String blood_type) {
		this.height = height;
		this.weight = weight;
		this.blood_type = blood_type;
	}


	public double getHeight() {
		return this.height;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public String getBloodType() {
		return this.blood_type;
	}

	public void setBloodType(String blood_type) {
		this.blood_type = blood_type;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}

	public static void main(String[] args) {
		System.out.println("height, weight, blood_type");
		
		Outer o1 = new Outer();
		Outer.Inner i1 = o1.new Inner();
		Outer o2 = new Outer();
//		Outer.Inner i2 = new Outer.Inner();
		System.out.println(o2);
		o2.display();
		System.out.println(-2%3);
	}
}

class Outer {
    int x=100;
    Outer.Inner inner = new Outer.Inner();
    
    public void display() {
    	Outer outer = new Outer();	// 얘를 메소드 밖으로 보내면 스택오버플로우 예외가 생긴다..?
    	Outer.Inner inner1 = outer.new Inner();
        inner1.display();
    }
    
    class Inner {
    	int y=200;
        public void display() {
            System.out.println(this);
        } 
    }
}