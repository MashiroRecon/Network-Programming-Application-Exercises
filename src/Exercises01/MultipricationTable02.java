package Exercises01;

public class MultipricationTable02 {
    public static void main(String[] args) {
		System.out.print("    ");
		int i;
		for(i=1;i<10;i++) System.out.printf("%3d",i);
		System.out.println();
		for(i=1;i<32;i++) System.out.print("-");
		System.out.println();
		int j;
		for(j=1;j<10;j++) {
			System.out.printf("%3d|",j);
			for(i=1;i<10;i++) {
				if(j>i) System.out.print("   ");
				if(j<=i) System.out.printf("%3d",j*i);
			}
			System.out.println();
		}
	}
}
