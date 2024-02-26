public class factorial {
    public static void Factorial(int i,int n, int fact) {
        if(i==n+1){
            
            System.out.println(fact);
            return;
        }
        fact *=i;
        Factorial(i+1, n, fact);
    }
    public static void main(String[] args) {
        Factorial(1, 5, 1);
        
    }
}
