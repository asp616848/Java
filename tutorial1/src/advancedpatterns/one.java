package advancedpatterns;

public class one {
    
    public static void main(String[] args) {
        int a=10;
        for (int k=1 ; k<6 ; k++){
            for (int n=1; n< k ; n++ ){
                System.out.print("*");
            }
            for (int i= a ; i>2*k; i=i-1){
                System.out.print(" ");
                }
            for (int j=1; j< k ; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int x=1 ; x<5 ; x++){
            for (int y=5; y > x ; y-- ){
                System.out.print("*");
            }
            for (int z=3 ; z<=2*x; z=z+1){
                System.out.print(" ");
                }
            for (int b=5; b>x ; b-- ){
                System.out.print("*");
            }
            System.out.println();
            
        }
    }
}

