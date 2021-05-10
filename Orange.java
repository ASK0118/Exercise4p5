package InterfaceAndAbstraction;

public class Orange extends Fruit {
	
	private double vitC;
	private double weight;
	private String taste;
	private String place;
	private double price;
	
	public Orange(String name, double w, String t, double vc, String p, double pr) {
		
		super(name);
		this.vitC = vc;
		this.weight = w;
		this.taste = t;
		this.place = p;
		this.price = pr;
		
		
		if (this.weight<=50) {
			totalPrice();
			System.out.println("Quantity bought                            : " + this.weight);
			System.out.println("Price per "+ name + "                            : RM "+ this.weight);
			System.out.println("Discount get                               : 0 %");
			System.out.println("Total price of " + this.weight + " " + name + "                     : RM "+ totalPrice());
		}
		
			else if(this.weight>50 && this.weight<=200) {
				double newP = 2.8;
				totalPrice(newP);
				System.out.println("Quantity bought                            : " + this.weight);
				System.out.println("Price per "+ name + "                            : RM " + newP);
				System.out.println("Discount get                               : 0% ");
				System.out.printf("Total price of %d %s                    : RM %2f%n", this.weight, name ,totalPrice(newP));
		}
		
			else {
				double newP = 2.5;
				double disc;
				
				Discount oo = new OrangeDiscount();  //create a new object
				disc = oo.rateOfDiscount();
				totalPrice(newP, disc);
				System.out.println("Quantity bought                            : " + this.weight);
				System.out.println("Price per "+ name + "                            : RM " + newP);
				System.out.printf("Discount get                               : %.2f percent", disc*100);
				System.out.printf("%nTotal price of %.1f %s                    : RM %.2f%n", this.weight, name ,totalPrice(newP, disc));
		}
		
		if(this.weight<= 76) {
			getVitC();
			System.out.println("Weight              : " + this.weight + " g");
			System.out.println("Size of orange      : Small");
			System.out.printf("Amount of Vitamin C : %.2f mg%n", getVitC());
		}
		
		else if(this.weight > 76 && this.weight <= 88 ) {
			double nVC = 46.8;
			getVitC(nVC);
			System.out.println("Weight              : " + this.weight + " g");
			System.out.println("Size of orange      : Medium");
			System.out.printf("Amount of Vitamin C : %.2f mg%n", getVitC(nVC));
		}
		
		else if(this.weight >88) {
			double nVC = 63.82;
			String harm = "You consume too much orange. It is very harmful!!!";
			getVitC(nVC);
			System.out.println("Weight              : " + this.weight + " g");
			System.out.println("Size of orange      : Large");
			System.out.printf("Amount of Vitamin C : %.2f mg%n%s", getVitC(nVC), harm);
		}
		
	}
	
	public double totalPrice() {	// overloading method with no argument
		return this.price * this.weight;
		
	}
	
	public double totalPrice(double newP) {    // overloading method with 1 argument
		return newP * this.weight;
	}
	
	public double totalPrice(double newP, double disc) {     // overloading method with 2 argument
		return (newP * this.weight) - (newP * this.weight*disc);
	}
	
	public double getVitC() {   //overloading method with no parameter
		return this.vitC * this.weight;
	}
	
	public double getVitC(double nvc) {   //overloading method with 1 parameter
		return nvc * this.weight;
	}
	
	public String taste() {
		return "\nThe taste of orange : " + this.taste;
	}
	
	 public String toString() {     //overriding method
			return "The origin of " + name + "                        : "+ this.place ;
		}
}

