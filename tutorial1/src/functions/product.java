package functions;

import java.util.Scanner;

public class product {
    public static int productOfTwo(int a, int b) {
        int product= a*b;
        System.out.println(product);
        return product;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        sc.close();
        productOfTwo(a, b);
    }
}
