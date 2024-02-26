package advancedpatterns;

public class three {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int n=1;n<=5-i;n++){
                System.out.print(" ");
            }
            for(int j=1; j<=i;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
