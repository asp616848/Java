package strings;

import java.util.Scanner;

public class question {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        String array[] = new String[size];
        int totlenght=0;
        
        for (int i=0; i < size; i++){
            array[i] = sc.next();
            totlenght = totlenght + array[i].length();
        
        }
        System.out.println(totlenght);
        System.out.println(array.toString());

    }
}
