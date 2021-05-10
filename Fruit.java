package InterfaceAndAbstraction;

public abstract class Fruit {
	
	//define super class as abstract class. Because we don't need to create instance of fruits
	//class which declare as abstract cannot create instance object
	
	protected String name;
	
	public Fruit(String n) {   //Constructor with 1 argument
		
		this.name = n;
		//System.out.println(name + " constructor is invoked");
	}
	
	//declare method that has no implementation
	//only subclass know to implement the method
	public abstract double totalPrice();
	public abstract double totalPrice(double newP);
	public abstract double totalPrice(double newP, double disc);
	public abstract String toString();
	public abstract String taste();
	
}
