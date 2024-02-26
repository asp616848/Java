package strings;

import java.util.Scanner;

public class decToBin {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder();

        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        while (a>0){
            if(a%2==1){
                sb.append(1);
            }
            else{
                sb.append(0);
            }
             a /= 2;
            
        }
        System.out.println(sb.reverse());
        }
}
