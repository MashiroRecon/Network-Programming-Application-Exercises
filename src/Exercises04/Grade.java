package Exercises04;

public class Grade {
	int high,low,total,num,eot_test,report;
	double ave;
	Grade(){
		high=low=total=num=eot_test=report=0;
		ave=0.0;
	}
	public void setHigh(int p_high) {
		if(p_high<=100&&p_high>=0)if(p_high>=(int)ave) high=p_high;
		else System.out.println("ERROR");
	}
	public int getHigh() {
		return high;
	}
	public void setLow(int p_low) {
		if(p_low<=100&&p_low>0)if(p_low<=(int)ave) low=p_low;
		else System.out.println("ERROR");
	}
	public int getLow() {
		return low;
	}
	public void setAve(double p_ave) {
		if(p_ave<=100.0&&p_ave>=0.0)
            if(p_ave<=(double)high&&p_ave>=(double)low) ave=p_ave;
		else System.out.println("ERROR");
	}
	public double getAve() {
		return ave;
	}
	public void setTotal(int p_total) {
		total=p_total;
	}
	public int getTotal() {
		return total;
	}
	public void incNum(int p_num) {
		num=p_num;
	}
	public int getNum() {
		return num;
	}
	public void addScore(int score) {
		setTotal(getTotal()+score);
		incNum(num+1);
		if(score>=getHigh()) setHigh(score);
		setAve(getTotal()/getNum());
		if(num==1) setLow(score);
		else if(score<=getLow()) setLow(score);
    }
	public void setEot_test(int p_eot_test) {
		if(p_eot_test<=100&&p_eot_test>0) eot_test=p_eot_test;
		else System.out.println("ERROR");
	}
	public int getEot_test() {
		return eot_test;
	}
	public void setReport(int p_report) {
		if(p_report<=100&&p_report>=0) report=p_report;
		else System.out.println("ERROR");
	}
	public int getReport() {
		return report;
	}
	public int getLastGrade() {
		return (int)(getEot_test()*0.6+getReport()*0.3+getTotal()*0.1);
	}
}
