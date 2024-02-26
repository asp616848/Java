package questions;
public class hollow {
    
    
    public static void main(String[] args) {
        int a = 4;
        int b = 5;

        for(int i = 1; i <= a ; i = i+1){
            for(int j = 1; j <= b ; j = j+1)
                if (i == 1 || j == 1 || i == a || j == b ) {
                    System.out.print("*");
                } else{
                    System.out.print(" ");}
            System.out.println();
        }
    
    }
}
