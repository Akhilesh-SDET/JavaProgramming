package OOPSConcepts;

public class A003_Mobile {
	String brand;
	String size;
	String model;
	String colour;

	public A003_Mobile(String brand, String size, String model, String colour) {
		this.brand = brand;
		this.size = size;
		this.model = model;
		this.colour = colour;
	}

	public void display(String brand, String size, String model, String colour) {
		System.out.println("brand is " + brand);
		System.out.println("size is " + size);
		System.out.println("model is " + model);
		System.out.println("colour is " + colour);
	}

	public void details() {
		System.out.println("brand is " + brand);
		System.out.println("size is " + size);
		System.out.println("model is " + model);
		System.out.println("colour is " + colour);
	}

	public static void main(String[] args) {
		A003_Mobile obj = new A003_Mobile("Samsung", "6.2inch", "S25", "Black");
		obj.display(obj.brand, obj.size, obj.model, obj.colour);
		obj.details();
	}

}
