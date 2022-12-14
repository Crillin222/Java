package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
	
	//SIMPLEDATEFORMAT
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	//ATRIBUTES
	private Date manufactureDate;
	
	//CONSTRUCTORS
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	//GETTERS E SETTERS
	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	//METHODS
	@Override
	public String priceTag() {
		return getName()
						+ " (used) $ "
						+ String.format("%.2f", getPrice())
						+ " (Manufacture date: "
						+ sdf.format(manufactureDate)
						+ ")";
	}

}
