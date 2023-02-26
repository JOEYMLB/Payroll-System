//Name: Joey Mills

public class PayrollSystemTest{
	//create subclass objects
	public static void main(String[] args) {
		int currentMonth = 2;
		SalariedEmployee salariedEmployee=
				new SalariedEmployee("John","Smith","111-11-1111",800.00,new Date(2,29,1992));
		HourlyEmployee hourlyEmployee=
				new HourlyEmployee("Karen","Price","222-22-2222",16.75,40,new Date(8,12,1987));
		CommissionEmployee commissionEmployee= 
				new CommissionEmployee("Sue","Jones","333-33-3333",10000,.06,new Date(9,8,1993));
		BasePlusCommissionEmployee basePlusCommissionEmployee=
				new BasePlusCommissionEmployee("Bob","Lewis","444-44-4444",5000,.04,300,new Date(12,25,1997));
		
		//create four-element employee array
		Employee[] employees = new Employee[4];
		//initalize array with employees
		employees[0] = salariedEmployee;
		employees[1] = hourlyEmployee;
		employees[2] = commissionEmployee;
		employees[3] = basePlusCommissionEmployee;
		
		
		
		System.out.printf("Employees processed polymorphically: %n%n");
		//calculate the payroll for each employee polymorphically
		for(Employee currentEmployee: employees) {
			//add bonus of $100.00 to payroll during birthday month
			System.out.println(currentEmployee);
			// determine whether element is a BasePlusCommissionEmployee 
			 if (currentEmployee instanceof BasePlusCommissionEmployee) { 
				// downcast Employee reference to BasePlusCommissionEmployee reference 
				 BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee; 
				 employee.setBaseSalary(1.10 * employee.getBaseSalary()); 
				 System.out.printf("new base salary with 10%% increate is: $%, .2f%n",
						 employee.getBaseSalary());
				 System.out.printf("earned $%, .2f%n%n", currentEmployee.earnings());
			 }
			 if (currentMonth == currentEmployee.getBirthDate().getMonth()) {
	                System.out.printf("earned $%,.2f. %s\n\n", currentEmployee.earnings() + 100.00,
	                        "Note: added a $100 bonus to your payroll amount for birthday!!!");
	            } else {
	                System.out.printf("earned $%,.2f\n\n", currentEmployee.earnings());
	            }
	        }
			 
			// get type name of each object in employees array
			 for (int j = 0; j < employees.length; j++) {
				 System.out.printf("Employee %d is a %s%n", j,employees[j].getClass().getName());
		}
	}
}

	  

      
     