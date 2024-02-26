package tutorial1;

import java.util.*;

public class cond {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a * b;
		if (c >= 10)
		{
		System.out.print(true);
		}
		else
		{System.out.print("False,It's smaller than 10.");
		}
		sc.close();

	}

}
