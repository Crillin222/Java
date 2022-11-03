package entities;

public class Individual extends TaxPayer {
	
	//ATRIBUTE
	private Double healthExpenditures;
	
	//CONSTRUCTOR
	public Individual() {
		super();
	}

	public Individual(String name, Double annualIncome, Double healthExpenditures) {
		super(name, annualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	//GETTERS E SETTERS
	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}
	
	//METHODS
	@Override
	public Double tax() {
		if (getAnnualIncome() < 20000.00) {
			return getAnnualIncome() * 0.15 - healthExpenditures * 0.50;
		}
		else {
			return getAnnualIncome() * 0.25 - healthExpenditures * 0.50;
		}
	}
	

}
