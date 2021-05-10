package InterfaceAndAbstraction;

public class Grapes extends Fruit {

	protected int kJoules;
	protected int amount;
	protected String color;
	private double price;
	private String place;
	
	public Grapes(String name, int kJ, int a, String c, double d, String p) {
		super(name);
		this.kJoules = kJ;
		this.amount = a;
		this.color = c;
		this.price = d;
		this.place = p;
		
		if (this.amount<=150) {
			totalPrice();
			System.out.println("Quantity bought                            : " + this.amount);
			System.out.println("Price per "+ name + "                            : RM "+ this.price);
			System.out.println("Discount get                               : 0 %");
			System.out.println("Total price of " + this.amount + " " + name + "                     : RM "+ totalPrice());
		}
		
			else if(this.amount>150 && this.amount<=300) {
				double newP = 5.0;
				totalPrice(newP);
				System.out.println("Quantity bought                            : " + this.amount);
				System.out.println("Price per "+ name + "                            : RM " + newP);
				System.out.println("Discount get                               : 0% ");
				System.out.printf("Total price of %d %s                    : RM %.2f%n", this.amount, name ,totalPrice(newP));
		}
		
			else {
				double newP = 4.8;
				double disc;
				
				Discount gg = new GrapesDiscount();  //create a new object
				disc = gg.rateOfDiscount();
				totalPrice(newP, disc);
				System.out.println("Quantity bought                            : " + this.amount);
				System.out.println("Price per "+ name + "                            : RM " + newP);
				System.out.printf("Discount get                               : %.2f percent", disc*100);
				System.out.printf("%nTotal price of %d %s                    : RM %.2f%n", this.amount, name ,totalPrice(newP, disc));
		}
		if (this.color.equals("Red")) {
			calcNutrition();
			System.out.println("Food energy provided by 100 g Red Grapes  : "+ this.kJoules + " kJ");
			System.out.println("Food energy provided by " + this.amount + " g Red Grapes  : "+ calcNutrition() + " kJ");
		}
		
		else if (this.color.equals("Green")) {
			int nKj = 300;
			calcNutrition(nKj);
			System.out.println("Food energy provided by 100 g Green Grapes: "+ nKj + " kJ");
			System.out.println("Food energy provided by " + this.amount + " g Green Grapes: "+ calcNutrition(nKj) + " kJ");
		}
		
		else
			System.out.println("There are no such color.");
	}
	
	public double totalPrice() {	// overloading method with no argument
		return this.price * this.amount;
		
	}
	
	public double totalPrice(double newP) {    // overloading method with 1 argument
		return newP * this.amount;
	}
	
	public double totalPrice(double newP, double disc) {     // overloading method with 2 argument
		return (newP * this.amount) - (newP * this.amount*disc);
	}
	
	 public int calcNutrition() {
		 return this.kJoules * this.amount;
	 }
	 
	 public int calcNutrition(int nKj) {
		 return nKj * this.amount;
	 }
	 
	 public String taste() {
			return "The taste of grapes                       : Sweet and Sour";
		}
	 
	 public String toString() {     //overriding method
			return "The origin of " + name + "                        : "+ this.place ;
		}
	
}

