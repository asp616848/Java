package questions;

import java.util.Scanner;

public class sumofn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        do{
            System.out.println(sum);
            sum = sum + a;
            a = a-1;
           
        }
        while (a > -1);
        sc.close();
    }
}
