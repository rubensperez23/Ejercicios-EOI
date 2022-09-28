package java1;

import java.util.Scanner;

public class HolaMundo {

	public static void main(String[] args) {
		//exercise1();
		//exercise2();
		//exercise5();
		//exercise6();

	}
	
	private static void exercise1() {
		System.out.println(36+27);

	}
	
	private static void exercise2() {
		int n1 = 15, n2 = 4;
		System.out.printf("%d + %d = %d\n",n1,n2,n1+n2);
		System.out.printf("%d - %d = %d\n",n1,n2,n1-n2);
		System.out.printf("%d / %d = %d\n",n1,n2,n1/n2);
		System.out.printf("%d * %d = %d\n",n1,n2,n1*n2);
		System.out.println(n1 + " % " + n2 + " = " + (n1 % n2));
	}
	
	private static void exercise5() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println("Valor inicial de N = "+N);
		N+=77;
		System.out.println("N + 77 = "+N);
		N-=3;
		System.out.println("N - 3 = "+N);
		N*=2;
		System.out.println("N * 2 = "+N);
		sc.close();
	}
	
	private static void exercise6() {
		int A = 1, B=2, C= 3, D=4;
		System.out.printf("Valores inciciales: A = %d B = %d C = %d D = %d \n",A,B,C,D);
		System.out.println("B toma el valor de C -> B = "+C);
		System.out.println("C toma el valor de A -> C = "+A);
		System.out.println("A toma el valor de D -> A = "+D);
		System.out.println("D toma el valor de B -> D = "+B);

	}
	
	
	
}
