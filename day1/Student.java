package week1.day1;

public class Student {
	String StudentName ="Rehana";
	int RollNo=564465;
	String CollegeName="kcas";
	int Markscored=562;
	int CGPA=95;
	
	public void studentName() {
		String StudentName ="Rehana";

		System.out.println(StudentName);
		System.out.println(RollNo);
		System.out.println(CollegeName);
		System.out.println(Markscored);
		System.out.println(CGPA);
	}
		

				
			
				
			public static void main (String[]args) {
				Student details =new Student();
				System.out.println(details.StudentName);
				details.studentName();

		}
		

}
