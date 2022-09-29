import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ejercicios1 {
	
	public static void apartado1() {
		int n1 = 36, n2 = 27;
		
		System.out.printf("El resultado de sumar %d y %d es %d",n1,n2,n1+n2);

	}
	
	public static void apartado2() {
		int n1 = 15, n2 = 4;
		
		System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
		System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
		System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
		System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
		System.out.println(n1 + " % " + n2 + " = " + (n1 % n2));
	}
	
	public static void apartado3() {
		int n1 = 4, n2 = 4;
		
		System.out.println(n1 + " es menor que " + n2 + ": " + (n1 < n2));
		System.out.println(n1 + " es igual que " + n2 + ": " + (n1 == n2));
		System.out.println(n1 + " es mayor o igual que " + n2 + ": " + (n1 >= n2));
	}
	
	public static void apartado4() {
		double A = 2, B = 2, C = 3, D = 4;
		System.out.print(A + " ");
		System.out.print(B + " ");
		System.out.print(C + " ");
		System.out.println(D);
		
		System.out.print( ( A+B)*C/D );
	}
	
	public static void apartado5() {
		int N = 1;
		System.out.println("Valor inicial de N = " + N);
		N += 77;
		System.out.println("N + 77 = " + N);
		N -= 3;
		System.out.println("N -3 = " + N);
		N *= 2;
		System.out.println("N * 2 = " + N);

	}
	
	public static void apartado6() {
		int A = 1, B = 2, C = 3, D = 4;
		int auxA=A, auxB=B, auxC=C, auxD=C;
		B = auxC;
		C = auxA;
		A = auxD;
		D = auxB;
		System.out.printf("Valores iniciales: A = %d B = %d C = %d D = %d\n",A,B,C,D);
		System.out.println("B toma el valor de C -> B = " + B);
		System.out.println("C toma el valor de A -> C = " + C);
		System.out.println("A toma el valor de D -> A = " + A);
		System.out.println("D toma el valor de B -> D = " + D);

	}
	
	public static void apartado7() {

		char c1 = 'b', c2 = 'k';
		System.out.println("'" + c1 + "' tiene la posici�n " + (int)c1);
		System.out.println("'" + c2 + "' tiene la posici�n " + (int)c2);
		System.out.println("Diferencia entre '" + c1 + "' y '" + c2 + "': " + (c2 - c1));
	}

	public static void apartado8() {
		int a = 5;
		System.out.println(a);
		int b = ++a;
		System.out.println(b);
		int c = a++;
		System.out.println(c);
		b *= 5;
		System.out.println(b);
		a *= 2;
		System.out.println(a);
		
	}
	
	public static void apartado9() {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("¡Buenos días " + name + "!");
		sc.close();
	}
	
	public static void apartado10() throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Dime un n�mero: ");
		int num = Integer.parseInt(reader.readLine());
		System.out.println("Doble: " + (num * 2) + ", triple: " + (num * 3));
	}
	
	public static void apartado11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Grados cent�grados: ");
		double gradosC = sc.nextDouble();
		double gradosF = 32 + (9 * gradosC / 5);
		System.out.println("Grados Farenheit: " + gradosF);
		sc.close();
	}
	
	public static void apartado12() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime un n�mero de 3 cifras: ");
		int num = sc.nextInt();
		int unidades = num % 10;
		int num2 = num / 10; 
		int decenas = num2 % 10; 
		int centenas = num2 / 10;
		
		System.out.println("Centenas: " + centenas + ", decenas: " + decenas + ", unidades: " + unidades);
		sc.close();
	}

	public static void apartado13() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Fecha de nacimiento (dia mes a�o): ");
		int dia = sc.nextInt();
		int mes = sc.nextInt();
		int anyo = sc.nextInt();
		
		int suma = dia + mes + anyo;
		int num1 = suma % 10;
		int num2 = (suma / 10) % 10;
		int num3 = (suma / 100) % 10;
		int num4 = suma / 1000;
		int numSuerte = num1 + num2 + num3 + num4;
		System.out.println("Tu n�mero de la suerte es: " + numSuerte);
		sc.close();
	}
	
	public static void apartado14() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu edad: ");
		int age = sc.nextInt();
		System.out.println("Dentro de 15 años tendrás " + (age+15) + " años");
		sc.close();

	}
	
	public static void apartado15() {
		Scanner s = new Scanner (System.in);
		System.out.println("Introduce un producto: ");
		String item1 = s.nextLine();
		Scanner c = new Scanner (System.in);
		System.out.println("Introduce su precio: ");
		double price1 = c.nextDouble();
		
		
		Scanner a = new Scanner (System.in);
		System.out.println("Introduce un producto: ");
		String item2 = a.nextLine();
		Scanner n = new Scanner (System.in);
		System.out.println("Introduce su precio: ");
		double price2 = n.nextDouble();
		
		
		Scanner e = new Scanner (System.in);
		System.out.println("Introduce un producto: ");
		String item3 = e.nextLine();
		Scanner r = new Scanner (System.in);
		System.out.println("Introduce su precio: ");
		double price3 = r.nextDouble();
		
		
		System.out.printf("%-15s%13s%13s\n","NOMBRE","PRECIO","CON IVA");
		System.out.printf("%-15s%12.2f€%12.2f€\n",item1, price1, price1*1.21);
		System.out.printf("%-15s%12.2f€%12.2f€\n",item2,price2, price2*1.21);
		System.out.printf("%-15s%12.2f€%12.2f€",item3,price3, price3*1.21);

		
		s.close();
		c.close();
		a.close();
		n.close();
		e.close();
		r.close();
		
	}
	
	public static void apartado20() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce 3 dígitos numéricos: ");
		int number = sc.nextInt();
		int U = number % 10;
		int aux = number/10;
		int D = aux % 10;
		int C = aux/10;
		System.out.printf("Has escrito: %d + %d + %d = %d",U,D,C,U+D+C);
		
		sc.close();
	}
	
	public static void apartado21() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nombre y edad: ");
		String nombre = sc.next();
		int edad = sc.nextInt();
		
		System.out.println("Estos son tus datos\n\tNombre: " + nombre + "\n\tEdad: " + edad);
		
		sc.close();
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
//		apartado1();
//		apartado2();
//		apartado3();
//		apartado4();
//		apartado5();
//		apartado6();
//		apartado7();
//		apartado8();
//		apartado9();
//		apartado10();
//		apartado11();
//		apartado12();
//		apartado13();
//		apartado14();
//		apartado15();
//		apartado20();
//		apartado21();
	}

}
