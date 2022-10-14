package Exercises04;

public class SetGradeSample {
	public static void main(String[] args) {
		CitStudent02 kodai=new CitStudent02(2132999,"工大  太郎",2);
		kodai.enshu1.addScore(50);
		kodai.enshu1.addScore(40);
		kodai.enshu1.addScore(70);
		kodai.enshu1.addScore(10);
		kodai.enshu1.addScore(90);
		kodai.enshu1.addScore(20);
		kodai.enshu1.setEot_test(80);
		kodai.enshu1.setReport(60);
		showGrade(kodai);
	}
	public static void showGrade(CitStudent02 data) {
		System.out.println("No: "+data.getNo()+" "+data.getName()+" "+data.enshu1.getLastGrade());
		if(data.getDepartment()==1) System.out.print("情報工学科");
		else if(data.getDepartment()==2) System.out.print("情報ネットワーク学科");
		if(data.enshu1.getLastGrade()>=90) System.out.println("  S");
		else if(data.enshu1.getLastGrade()>=80) System.out.println("  A");
		else if(data.enshu1.getLastGrade()>=70) System.out.println("  B");
		else if(data.enshu1.getLastGrade()>=60) System.out.println("  C");
		else System.out.println("  D");
		System.out.println("High: "+data.enshu1.high+" Low: "+data.enshu1.low+" Ave: "+data.enshu1.ave+" Total: "+data.enshu1.total+" Num: "+data.enshu1.num);
	}
}
