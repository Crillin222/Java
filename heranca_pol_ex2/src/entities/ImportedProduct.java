package entities;

public class ImportedProduct extends Product{
	
	//ATRIBUTES
	private double customsFee;
	
	//CONSTRUCTORS
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, double price, double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	
	//GETTERS E SETTERS
	public double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(double customsFee) {
		this.customsFee = customsFee;
	}
	
	//METHODS
	public double totalPrice() {
		return getPrice() + customsFee;
	}
	
	@Override
	public String priceTag() {
		return getName()
						+ " $ "
						+ String.format("%.2f", totalPrice())
						+ " (Customs fee: $ "
						+ String.format("%.2f", customsFee)
						+ ")";
	}
	
	

}
