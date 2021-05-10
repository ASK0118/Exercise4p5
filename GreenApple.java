package InterfaceAndAbstraction;

public class GreenApple extends Apple{
	
	private String color;
	
	public GreenApple(String name, int q, double p, String pc, String c) {
		super(name, q, p, pc);
		this.color = c;
		
		color();
	}

	public void color() {
		System.out.println("Color of " + name + "                       : " + this.color);
	}
	public String toString() {    //overriding method
		return "The origin of " + name + "                  : "+ super.place ;
	}
	 
	public String taste() {    //overriding method
		return "The taste of Green Apple                   : Little bit sour" + "\n";
	}
	
}
