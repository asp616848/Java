import java.util.Scanner;

public class sumOfN {
    
    public static void sumOfn(int i, int n,int sum){
        if(i==n+1){
            System.out.println(sum);
            return;
        }
        sum += i;
        sumOfn(i+1,n,sum);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        sumOfn(1, n,0);
        sc.close();
    }
}
