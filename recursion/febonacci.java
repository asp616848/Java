import java.util.Scanner;

public class febonacci {
    public static int febonaNo(int i, int j, int feboNo,int k,int n) {
        if(k==n){
            return feboNo;
        }
        k=k+1;
        feboNo=i+j;
        return febonaNo(j,i+j,feboNo,k,n);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int x = febonaNo(0, 1, 0, 1, n);
        System.out.println(x);
        sc.close();
    }
    
}
