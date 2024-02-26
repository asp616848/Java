package questions;

public class triangle01 {
    public static void main(String[] args) {
        
        for (int i=1 ; i<=5 ; i=i+1) {
            for(int j=1 ; j<=i; j=j+1){
                if ((i+j)%2 == 0){
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
            }System.out.println();
            
        }
    }
}
