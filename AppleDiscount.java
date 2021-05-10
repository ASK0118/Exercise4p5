package InterfaceAndAbstraction;

class AppleDiscount implements Discount{
	
	public float rateOfDiscount() {
		return 0.2f;
	}
	
}

class FujiAppleDiscount implements Discount{
	
	public float rateOfDiscount() {
		return 0.2f;
	}
}

class GrapesDiscount implements Discount{
	
	public float rateOfDiscount() {
		return 0.3f;
	}
}

class OrangeDiscount implements Discount{
	
	public float rateOfDiscount() {
		return 0.25f;
	}
}