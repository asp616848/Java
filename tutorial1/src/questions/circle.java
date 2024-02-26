package questions;
import java.util.*;
public class circle{

    public static void main(String[] args) {
        System.out.println("Enter the value of radius in terms of integers.");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.println("Area is below-");
        double b = 3.14 * a * a ;
        System.out.println(b);
        System.out.println("Perimeter");
        double c = 2 * 3.14 * a;
        System.out.println(c);
    sc.close();
}
}