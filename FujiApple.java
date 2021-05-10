package InterfaceAndAbstraction;

public class FujiApple extends Apple {

	private double yen;
	
	public FujiApple(String name, int q, double p, String pc, double yen) {
		super(name, q, p, pc);
		this.yen = yen;
		
		if (super.quantity<=5) {
		convert();
		System.out.printf("Total price of %d %s (Japanese yen): %.2f yen%n", this.quantity, name ,convert());
	    }
		 	
		  else if(super.quantity>5 && super.quantity<=20) {
			  double newP = 2.8;
			  convert(newP);
			  System.out.printf("Total price of %d %s (Japanese yen): %.2f yen%n", this.quantity, name ,convert(newP));
		  }
		
		  else {
			  double newP = 2.5;
			  double disc;
			  
			  Discount cc = new FujiAppleDiscount();  //create a new object
			  disc = cc.rateOfDiscount();
			  convert(newP, disc);
			  System.out.printf("Total price of %d %s (Japanese yen): %.2f yen%n", this.quantity, name ,convert(newP, disc));  
		  }
			  
	}
		
	
	public double convert() {
		return super.totalPrice() * this.yen ;
	}
	
	public double convert(double newP) {
		return super.totalPrice(newP) * this.yen ;
	}
	
	public double convert(double newP, double disc) {
		return super.totalPrice(newP, disc) * this.yen ;
	}

	public String toString() {    //overriding method
		return "The origin of " + name + "                  : "+ super.place;
	}
	
	public String taste() {    //overriding method
		return "The taste of Fuji Apple                   : Sweet than normal apple" + "\n";
	}
}
