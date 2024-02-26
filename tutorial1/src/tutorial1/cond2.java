package tutorial1;
import java.util.*;
public class cond2 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if (a == b){
            System.out.println("Both are EQUAL");
        }
        else if (a>b){
            System.out.println("a is greater");
        }
        else {
            System.out.println("b is greater");
        }
        sc.close();
    }
}
//the below is also part of conditions but i was too lazy to write a code
switch (key) {
    case value:
        
        break;

    default:
        break;
}