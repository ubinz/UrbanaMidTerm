package design;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {
		EmployeeInfo employee1 = new EmployeeInfo(1);
		EmployeeInfo employee2 = new EmployeeInfo(2);
		EmployeeInfo employee3 = new EmployeeInfo(3, 25, "eva", "QA", 2);

		employee1.setPerformance(3);
		employee1.setSalary(103920);
		employee1.setEmployeeName("Urbana");
		employee1.setEmployeeAge(25);

		EmployeeInfo.calculateEmployeeBonus(employee1.getSalary(), employee1.getEmployeeName(), employee1.getPerformance());
		EmployeeInfo.calculateEmployeePension(employee3.calculateSalary());



	}



}
