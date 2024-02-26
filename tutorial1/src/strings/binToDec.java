package strings;

import java.util.Scanner;

public class binToDec {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String binary = sc.nextLine();
        int lenght = binary.length();
        int decimal=0;
        for(int i=0;i<lenght;i++){
            if(binary.charAt(i)=='1')
            decimal += Math.pow(2,i);
        }
        System.out.println(decimal);
        sc.close();
    }
}
