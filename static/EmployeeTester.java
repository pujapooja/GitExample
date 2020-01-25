class EmployeeTester{
	public static void main(String[] args){
	System.out.println("main method started");
	Employee.company="TATA";
	System.out.println("Employee.company");

	Employee em=new Employee();
	em.name="Pooja";
	em.id=10;
	em.salary=40000;
	em.getEmployeeDetails();
	System.out.println("-----");

	Employee em1=new Employee();
	em1.name="Dolly";
	em1.id=01;
	em1.salary=43000;
	em1.getEmployeeDetails();

	System.out.println("main method ended");
	}
}