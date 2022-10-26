package Exercises01;

public class PrimeNumber {
    public static void main(String[] args) {
		int i,j;
		for(i=1;i<=100;i++) {
			for(j=2;j<i;j++) if(i%j==0) break;
			if(j+1>=i) {
				System.out.printf("%3d",i);
				System.out.println();
			}
		}
	}
}
