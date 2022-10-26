package Exercises01;

public class FibonacciSeries {
    public static void main(String[] args) {
		int i=0;
		int j=1;
		int t=0;
		System.out.printf("%5d",i);
		System.out.println();
		System.out.printf("%5d",j);
		System.out.println();
		while(i+j<=10000) {
			System.out.printf("%5d",i+j);
			System.out.println();
			if(t%2==0) i=i+j;
			else j=i+j;
			t++;
		}
	}
}
