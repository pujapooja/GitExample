class StudentTester{
	public static void main(String[] args){
	System.out.println("main method ended");
	Student.university="VTU";
	System.out.println(Student.university);
	
	Student st=new Student();
	st.name="Pruthvi";
	st.rollnum=121;
	st.perc=78.78;
	st.getStudentDetails();
	System.out.println("------");

	Student st1=new Student();
	st1.name="Sushma";
	st1.rollnum=122;
	st1.perc=87.78;
	st1.getStudentDetails();
	
	System.out.println("main method ended");
	}
}
