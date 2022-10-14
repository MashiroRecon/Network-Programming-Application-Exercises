package Exercises04;

public class CitStudent02 {
	int no,year,grade,department,S_Unit,A_Unit,B_Unit,C_Unit;
	String name;
	Grade enshu1=new Grade();
	CitStudent02(){
		no=year=grade=department=0;
		name="";
	}
	CitStudent02(int p_no,String p_name){
		no=p_no;
		name=p_name;
		department=(p_no/1000)%10;
		year=grade=0;
	}
	CitStudent02(int p_no,String p_name,int p_year){
		no=p_no;
		name=p_name;
		department=(p_no/1000)%10;
		year=p_year;
		grade=S_Unit=A_Unit=B_Unit=C_Unit=0;
	}
	public void setNo(int p_no) {
		no=p_no;
		department=(no/1000)%10;
	}
	public int getNo() {
		return no;
	}
	public int getDepartment() {
		return department;
	}
	public void setName(String p_name) {
		name=p_name;
	}
	public String getName() {
		return name;
	}
	public void setYear(int p_year) {
		year=p_year;
	}
	public int getYear() {
		return year;
	}
	public void setGrade(int p_grade) {
		grade=p_grade;
	}
	public int getGrade() {
		return grade;
	}
	/*public double getGPA() {
		S_Unit=A_Unit=B_Unit=C_Unit=2;
		
		return   //((S_Unit*4+A_Unit*3+B_Unit*2+C_Unit)/
	}*/
}
