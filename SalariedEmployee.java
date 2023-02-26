// Name: Joey Mills


public class SalariedEmployee extends Employee{
	private double weeklySalary;
	//constructor
	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary, Date birthDate) {
		super(firstName, lastName, socialSecurityNumber, birthDate);
		if(weeklySalary < 0.0) {
			throw new IllegalArgumentException("Weekly salary must be >= 0.0");
		}
		this.weeklySalary = weeklySalary;
	}
	//set salary
	public void setWeeklySalary(double weeklySalary) {
		if (weeklySalary < 0.0) {
			throw new IllegalArgumentException("Weekly Salary must be >= 0.0");
		}
		this.weeklySalary = weeklySalary;
	}
	//return salary
	public double getWeeklySalary() {
		return weeklySalary;
	}
	public String toString() {
		return String.format("Salaried Employee: %s%n%s: $%,.2f", super.toString(),"weekly salary", getWeeklySalary());
	}
	@Override
	public double earnings() {
		return weeklySalary;
	}
	
}
