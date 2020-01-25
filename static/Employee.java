class Employee{
	String name;
	int id;
	int salary;
	static String company;

	void attendemployee(){
	System.out.println("attending company");
        }
	void getEmployeeDetails(){
	System.out.println("EmployeeDetails:");
	System.out.println(this.name+"\t"+this.id+"\t"+this.salary+"\t"+this.company);
	}
}


	