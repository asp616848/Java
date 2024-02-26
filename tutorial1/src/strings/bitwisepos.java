package strings;

public class bitwisepos {
    public static void main(String[] args) {
        int n = 12;
        int mask = 1 <<2;
        int result= n^mask ; 
        System.out.println(result); 
    }
}