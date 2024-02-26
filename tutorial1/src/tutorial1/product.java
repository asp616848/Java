package tutorial1;
import java.util.*;
public class product { 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		System.out.print(x);
		Scanner sca = new Scanner(System.in);
		int a = sca.nextInt();
		int b = sca.nextInt();
		System.out.print(a*b);
		sca.close();
		sc.close();
		
		}
}
