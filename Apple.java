package InterfaceAndAbstraction;

public class Apple extends Fruit {
	
	protected int quantity;
	protected double price;
	protected String place;
	
	public Apple(String name, int q, double p, String pc) {  //Constructor with 3 arguments
		super(name);
		this.quantity = q;
		this.price = p;
		this.place = pc;
		
		System.out.println("\nInfo of " + name );
		System.out.println("-----------------------------");
		
		if (this.quantity<=5) {
			totalPrice();
			System.out.println("Quantity bought                            : " + this.quantity);
			System.out.println("Price per "+ name + "                            : RM "+ this.price);
			System.out.println("Discount get                               : 0 %");
			System.out.println("Total price of " + this.quantity + " " + name + "                     : RM "+ totalPrice());
		}
		
			else if(this.quantity>5 && this.quantity<=20) {
				double newP = 2.8;
				totalPrice(newP);
				System.out.println("Quantity bought                            : " + this.quantity);
				System.out.println("Price per "+ name + "                            : RM " + newP);
				System.out.println("Discount get                               : 0% ");
				System.out.printf("Total price of %d %s                    : RM %2f%n", this.quantity, name ,totalPrice(newP));
		}
		
			else {
				double newP = 2.5;
				double disc;
				
				Discount aa = new AppleDiscount();  //create a new object
				disc = aa.rateOfDiscount();
				totalPrice(newP, disc);
				System.out.println("Quantity bought                            : " + this.quantity);
				System.out.println("Price per "+ name + "                            : RM " + newP);
				System.out.printf("Discount get                               : %.2f percent", disc*100);
				System.out.printf("%nTotal price of %d %s                    : RM %.2f%n", this.quantity, name ,totalPrice(newP, disc));
		}
	}
	
	public double totalPrice() {	// overloading method with no argument
		return this.price * this.quantity;
		
	}
	
	public double totalPrice(double newP) {    // overloading method with 1 argument
		return newP * this.quantity;
	}
	
	public double totalPrice(double newP, double disc) {     // overloading method with 2 argument
		return (newP * this.quantity) - (newP * this.quantity*disc);
	}
	
	public String toString() {     //overriding method
		return "The origin of " + name + "                        : "+ this.place ;
	}
	
	public String taste() {     //overriding method
		return "The taste of Apple                         : Sweet" + "\n";
	}
}

