package entities;

public abstract class TaxPayer {
	
	//ATRIBUTES
	private String name;
	private Double annualIncome;

	//CONSTRUCTOR
	public TaxPayer() {
	}

	public TaxPayer(String name, Double annualIncome) {
		this.name = name;
		this.annualIncome = annualIncome;
	}

	//GETTERS E SETTERS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(Double annualIncome) {
		this.annualIncome = annualIncome;
	}
	
	//METHODS
	public Double tax() {
		return 0.0;
	}
	
}
