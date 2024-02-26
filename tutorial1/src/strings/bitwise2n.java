package strings;    //bitwise question

import java.util.Scanner;

public class bitwise2n {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Please a number!");
    int a= sc.nextInt();
    int b= a -1;
    if ((a & b) == 0){
        System.out.println("Yes its even power");
    }
    else {
        System.out.println("No,Its not a power of 2.");
    }
    sc.close();
  }
}
