package entities;

public class Company extends TaxPayer {
	
	//ATRIBUTE
	private int employeeNumber;
	
	//CONSTRUCTOR
	public Company() {
		super();
	}

	public Company(String name, Double annualIncome, int employeeNumber) {
		super(name, annualIncome);
		this.employeeNumber = employeeNumber;
	}

	//GETTERS E SETTERS
	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	
	//METHOD
	@Override
	public Double tax() {
		if (employeeNumber <= 10) {
			return getAnnualIncome() * 0.16;
		}
		else {
			return getAnnualIncome() * 0.14;
		}
	}

}
