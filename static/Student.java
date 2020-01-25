class Student{
	String name;
	int rollnum;
	double perc;
	static String university;

	void attendclasses(){
		System.out.println("attending classes");
	}

	void getStudentDetails(){
		System.out.println("StudentDetails:");
		System.out.println(this.name+"\t"+this.rollnum+"\t"+this.perc+"\t"+this.university);
	}
}

	
	