package questions;

public class floydtri {
    public static void main(String[] args) {
        int num = 1;
        for(int i=0 ; i<6 ; i= i+1){
            for(int k=0 ; k<i ; k= k+1){
                System.out.print(num + "  ");
                num++;
            }
            System.out.println();   
        }
    }
    }
