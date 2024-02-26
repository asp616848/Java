package advancedpatterns;

public class four {
    public static void main(String[] args) {
        for (int i=0;i<6;i++){
            for(int n=0; n<=5-i;n++){
                System.out.print(" ");
            }
            for(int j=i; j>=1;j--){
                System.out.print(j);
            }
            
            for(int k=2; k<=i;k++){
                System.out.print(k);
            }
            System.out.println();
        }

    }
}
