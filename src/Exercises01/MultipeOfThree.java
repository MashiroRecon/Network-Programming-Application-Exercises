package Exercises01;

public class MultipeOfThree {
    public static void main(String[] args){
        int i;
        for(i=0;i<=100;i++){
            if(i%3==0){
                System.out.printf("%3d",i);
                System.out.println();
            }
        }
    }    
}
