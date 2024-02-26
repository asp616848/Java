package questions;

public class invertedhaldpyra {
    public static void main(String[] args) {
        for (int i=0 ; i<4 ; i= i+1 ){
            for (int j=0 ; j < 4 - i ; j= j+1){
                System.out.print(" ");
            }
            for (int k=0 ; k<= i; k= k+1){
                System.out.print("*");
            }
                System.out.println();
        }
    }
}
