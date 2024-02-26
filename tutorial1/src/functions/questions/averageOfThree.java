package functions.questions;

import java.util.Scanner;

public class averageOfThree {
    public static int averageOfInput(int a,int b, int c) {
        int avg= (a+b+c)/3;
        System.out.println("The Average of Three input numbers are:"+ avg);
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        averageOfInput(a, b, c);
        sc.close();
    }
}

