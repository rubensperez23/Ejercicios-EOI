import java.io.IOException;
import java.util.Scanner;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

public class Ejercicios2 {
	
	public static void buscarSiguienteProfesor() {
		Scanner sc = new Scanner(System.in);
		String cadena="w Esta es una cadena más larga que la Anterior, hola adiós hola hola";
		boolean salir = false;
		int posicionEncontrada = -1;
		// Pista: contains, indexOf, lastIndexOf
		System.out.println("Introduzca la cadena a buscar: ");
		String cadenaBuscada = sc.nextLine();
		while(!salir) {
			posicionEncontrada = cadena.toLowerCase().indexOf(cadenaBuscada.toLowerCase(), posicionEncontrada+1);
			if(posicionEncontrada!=-1) {  // Encuentro la cadena
				System.out.println(cadena.substring(posicionEncontrada));
				System.out.println("¿Buscar siguiente? (s/n): ");
				String respuesta = sc.nextLine();
				if(respuesta.toLowerCase().equals("n")) {
					salir = true;
				}
			} else {
				System.out.println("No se encuentran más ocurrencias de la cadena");
				salir = true;
			}			
		}
		sc.close();
	}
	
	public static void buscarSiguienteYo() {
		Scanner sc = new Scanner(System.in);
		String frase ="Nos veremos en el infierno";
		System.out.println("Texto: "+frase);
		String auxfrase = frase;
		System.out.println("Introduzca el elemento que quiere buscar");
		String cadena = sc.nextLine();
		while (auxfrase.contains(cadena)){
				System.out.println(frase.substring(frase.indexOf(cadena)));
				
				System.out.println("¿Quieres reemplazarla?");
				String respuesta1 = sc.nextLine();
				
				if(respuesta1.equals("s")) {
					System.out.println("¿Por qué elemento?");
					String respuesta2 = sc.nextLine();
					frase = frase.replaceFirst(cadena, respuesta2);
					}
				
				
				System.out.println("¿Siguiente ocurrencia?");
				String respuesta3 = sc.nextLine();
				if(respuesta3.equals("s")) {
					auxfrase = frase.substring(frase.indexOf(cadena)+1);
					} else {break;}
		}
		System.out.println("Fin de búsqueda de coincidencias");
		System.out.println("Resultado final: " +  frase);
		sc.close();
	}
	
	public static void apartado2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Escriba un número: ");
		int num = sc.nextInt();
		System.out.println(num % 10 == 0?"El número es múltiplo de 10":"El número no es múltiplo de 10");
		sc.close();
	}

	public static void apartado3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una palabra: ");
		String word1 = sc.nextLine();
		char letter1 = word1.charAt(0);
		String word2 = word1.toUpperCase();
		char letter2 = word2.charAt(0);
		
		System.out.println(letter1 == letter2?"Empieza en mayúscula": "Empieza en minúscula");
		sc.close();
	}

	public static void apartado4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe una palabra: ");
		String p1 = sc.nextLine();
		System.out.print("Escribe otra palabra: ");
		String p2 = sc.nextLine();

		if (p1.equals(p2)) {
			System.out.println("Las palabras son iguales");
		} else {
			System.out.println("Las palabras son distintas");
		}
		
		sc.close();
	}

	public static void apartado5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un dividendo: ");
		int n1 = sc.nextInt();
		System.out.print("Introduce un divisor: ");
		int n2 = sc.nextInt();

		if (n2 == 0) {
			System.out.println("El divisor no puede ser igual a 0");
		} else {
			System.out.printf("El resultado de dividir %d entre %d es %.2f",n1,n2,(float) n1/n2);
		}
		
		sc.close();
		
	}
	
	public static void apartado6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int n1 = sc.nextInt();
		System.out.print("Introduce otro número: ");
		int n2 = sc.nextInt();
		System.out.print("Introduce otro número: ");
		int n3 = sc.nextInt();

		if (n1 >= n2 && n1 >= n3) {
			System.out.println("El mayor número es el "+ n1);
		} else if (n2 >= n1 && n2 >= n3){
			System.out.println("El mayor número es el "+ n2);
		} else {System.out.println("El mayor número es el "+ n3);}
		
		sc.close();
	}
	
	public static void apartado7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce las horas: ");
		int n1 = sc.nextInt();
		System.out.print("Introduce los minutos: ");
		int n2 = sc.nextInt();
		System.out.print("Introduce los segundos: ");
		int n3 = sc.nextInt();

		if (n1 >= 0 && n1 <= 23) {
			
			if (n2 >= 0 && n2 <=60) {
				
				if (n3 >= 0 && n3 <=60) {
					
					System.out.printf("Hora actual: %02d:%02d:%02d",n1,n2,n3);
					
				} else {System.out.println("Los segundos deben estar en el rango de 0 a 60");}
				
			} else {System.out.println("Los minutos deben estar en el rango de 0 a 60");}
			
		} else {System.out.println("Las horas deben estar en el rango de 0 a 23");}
		
		sc.close();
	}
	
	public static void apartado8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int n = sc.nextInt();
		System.out.println(n%2==0? n + " es par" : n + " es impar");
		sc.close();
	}
	
	public static void apartado9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el número de mes actual: ");
		int month = sc.nextInt();
		switch (month) {
			case 1: System.out.println("Estamos en enero y tenemos 31 días por delante");
			break;
			case 2: System.out.println("Estamos en febrero y tenemos 28 días por delante");
			break;
			case 3: System.out.println("Estamos en marzo y tenemos 31 días por delante");
			break;
			case 4: System.out.println("Estamos en abril y tenemos 30 días por delante");
			break;
			case 5: System.out.println("Estamos en mayo y tenemos 31 días por delante");
			break;
			case 6: System.out.println("Estamos en junio y tenemos 30 días por delante");
			break;
			case 7: System.out.println("Estamos en julio y tenemos 31 días por delante");
			break;
			case 8: System.out.println("Estamos en agosto y tenemos 31 días por delante");
			break;
			case 9: System.out.println("Estamos en septiembre y tenemos 30 días por delante");
			break;
			case 10: System.out.println("Estamos en octubre y tenemos 31 días por delante");
			break;
			case 11: System.out.println("Estamos en noviembre y tenemos 30 días por delante");
			break;
			case 12: System.out.println("Estamos en diciembre y tenemos 31 días por delante");
			break;
			default: System.out.println("No has introducido un número de mes válido");
			
			sc.close();
		}
	}
	
	public static void apartado10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un carácter: ");
		char character = sc.nextLine().charAt(0);
		
		switch (character) {
			case 44:
			case 46:
			case 58:
			case 59: System.out.println("Has introducido un signo de puntuación");
			break;
			case 48:
			case 49:
			case 50:
			case 51:
			case 52:
			case 53:
			case 54:
			case 55:
			case 56:
			case 57: System.out.println("Has introducido una cifra numérica");
			break;
			default: System.out.println("Has introducido un carácter que no es ni un signo de puntuación ni una cifra numérica");
			
			sc.close();
		}
	}
	
	public static void apartado11() {
		
		Scanner sc = new Scanner(System.in);
		int n3 = 0;
		
		while (n3!=5) {
			System.out.print("Introduce un número: ");
			int n1 = sc.nextInt();
			System.out.print("Introduce otro número: ");
			int n2 = sc.nextInt();
			System.out.print(
					"Introduce la opción deseada (indicando su respectivo número): \n1.Sumar 2.Restar 3.Multiplicar 4.Dividir 5.Salir");
			n3 = sc.nextInt();
			switch (n3) {
			case 1:
				System.out.println("Resultado: " + (n1 + n2));
				break;
			case 2:
				System.out.println("Resultado: " + (n1 - n2));
				break;
			case 3:
				System.out.println("Resultado: " + (n1 * n2));
				break;
			case 4:
				if (n2 != 0) {
					System.out.println("Resultado: " + ((float) n1 / n2));
				} else {
					System.out.println("No se puede dividir por 0");
				}

				break;
			case 5:
				break;
			default:
				System.out.println("No has introducido una opción válida");
			}
		}
		
		sc.close();
		
	}
	
	public static void apartado12() {
		double entrada = 50;
		
		Scanner s = new Scanner(System.in);
		System.out.print("Dime tu edad: ");
		int edad = s.nextInt();
		
		s.nextLine();
		//Eso se pone porque con .nexInt() coge el dato y el intro que le das
		//Está la opción de int edad = Integer.ParseInt(sc.nextLine());
		if(edad < 18) {
			
			System.out.println("Precio entrada: " + entrada*0.75);
			
		} else if(edad < 65) {
			
			System.out.print("¿Eres socio? (si/no)");
			String resp = s.nextLine();
			
			// Soluci�n con expresi�n regular
//			Pattern regex = Pattern.compile("^s[i��]?$", Pattern.CASE_INSENSITIVE);
//			Matcher m = regex.matcher(resp);
//			if(m.matches()) {
//				entrada *= 0.6;
//			}
			
			switch(resp) {
				case "s": case "si": case "sí": case "S": case "SI": case "SÍ":
					System.out.println("Precio entrada: " + entrada*0.6);
					break; 
				default: System.out.println("Precio entrada: " + entrada);
			}
			
			
			
		} else if (edad >= 65) {
			System.out.println("Precio entrada: " + entrada*0.25);;
			
		} else {System.out.println("Los valores introducidos no son correctos");}
		s.close();
		
		
		}
	
	public static void apartado13() {
		int i = 20;
		while (i>0) {
			System.out.println(i);
			i--;
		}
		
		for (i = 20; i > 0; i--) {
			System.out.println(i);
		}
	}
	
	public static void apartado14() {
		int i = 0;
		System.out.println("Valor inicial = 0 \nIntroduce un sumando: ");
		Scanner sc = new Scanner(System.in);
		int number;
		do {
			number = sc.nextInt();
			if (number != 0) {System.out.println("Introduce otro sumando: ");}
			i += number;
		} while (number != 0);
		System.out.println("Valor final = "+i);
		sc.close();
	}
	
	public static void apartado15() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int num = sc.nextInt();
		int c = 1;
		while ( (num/10) > 0 ) {
			num /= 10;
			c += 1;
		}
		System.out.println("Tu número tiene " + c + ((c==1)?" cifra":" cifras"));
		sc.close();
	}
	
	public static void apartado16() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime un número: ");
		int ancho = sc.nextInt();
		
		for(int i = 0; i < ancho; i++) {
			System.out.print("*");
		}
		System.out.println();
		sc.close();
	}

	public static void apartado17() {
		for(int i = 1;i<=30;i++) {
			if(i % 3 == 0) {continue;}
			System.out.println(i);
		}
	}
	
	public static void apartado18() {
		for(int i = 0; i <= 100; i+=5) {
			System.out.println(i);
		}
	}
	
	public static void apartado19() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un número: ");
		int num = sc.nextInt();
		for (int i=1; i<=num; i++) {
			if (i != num) {
				System.out.print(i + ",");
				}
			else {System.out.print(i);}
		}
		System.out.println();
		sc.close();
	}
	
	public static void apartado20() {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int num;
		while (sum >= 0) {
			System.out.println("Introduce un número: ");
			num = sc.nextInt();
			if (num<0) {continue;}
			else if (num == 0) {break;}
			else {sum += num;}
		}
		System.out.println("La suma total de los números introducidos es: "+sum);
		sc.close();
	}
	
	public static void apartado21() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime un número: ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num / 2; i++) {
			if(num % i == 0) {
				System.out.println("Divisor: " + i);
			}
		}
		sc.close();
	}
	
	public static void apartado22() {
		for(int i = 0; i < 5; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.print(j);
			}
		}
	}
	
	public static void apartado23() {
		for(int i = 9; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public static void apartado24() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			
			for(int j=1;j<=num;j++) {
				System.out.print(" * ");
				
			}
			System.out.println();
		}
		sc.close();
		
	}
	
	public static void apartado25() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime un número: ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
	
	public static void apartado26() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime un número: ");
		int num = sc.nextInt();
		
		for(int i = num; i >= 1; i--) {
			for(int j = 1; j <= num; j++) {
				
				if(j<i) {
					System.out.print(" ");
				} else {System.out.print("*");}
				
			}
			System.out.println();
		}
		sc.close();
	}
	
	public static void apartado27() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime el ancho: ");
		int width = sc.nextInt();
		System.out.print("Dime el alto: ");
		int high = sc.nextInt();
		
		for(int i = 1; i <= high; i++) {
			
			for(int j = 1; j <= width; j++) {
			
				if(i==1 || i==high || j==1 || j==width ) {
					System.out.print("*");
				} else {System.out.print(" ");}
				
			}
			System.out.println();
		}
		sc.close();
	}
	
	public static void apartado28() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime la altura de la pirámide: ");
		int high = sc.nextInt();
		int n1 = high;
		int n2 = high;
		
		for(int i = 1; i <= high; i++) {
			
			for(int j = 1; j <= (2*high -1); j++) {
			
				if( j>=n1 && j<=n2 ) {
					System.out.print("*");
				} else {System.out.print(" ");}
			}
			System.out.println();
			n1--;
			n2++;
		}
		sc.close();
	}
	
	public static void apartado29() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime la altura de la pirámide: ");
		int high = sc.nextInt();
		int n1 = high;
		int n2 = high;
		
		for(int i = 1; i <= high; i++) {
			
			for(int j = 1; j <= (2*high -1); j++) {
			
				if( j==n1 || j==n2 || i==high) {
					System.out.print("*");
				} else {System.out.print(" ");}
			}
			System.out.println();
			n1--;
			n2++;
		}
		sc.close();
	}

	public static void apartado30() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime la altura de la pirámide: ");
		int high = sc.nextInt();
		int n1 = 1;
		int n2 = 2*high-1;
		
		for(int i = 1; i <= high; i++) {
			
			for(int j = 1; j <= (2*high -1); j++) {
			
				if(j>=n1 && j<=n2) {
					System.out.print("*");
				} else {System.out.print(" ");}
			}
			System.out.println();
			n1++;
			n2--;
		}
		sc.close();
	}
	
	public static void apartado31() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime la base del rombo: ");
		int base;
		do {
			base = Integer.parseInt(sc.nextLine());
			if(base % 2 == 0) System.out.println("Introduce otro número: ");
			} while (base % 2==0);
		
		int high = (base+1)/2;
		int n1 = high;
		int n2 = high;
		
		for(int i = 1; i <= high; i++) {
			
			for(int j = 1; j <= (2*high -1); j++) {
			
				if( j>=n1 && j<=n2 ) {
					System.out.print("*");
				} else {System.out.print(" ");}
			}
			System.out.println();
			n1--;
			n2++;
		}
		
		n1 = 2;
		n2 = 2*high-2;
		
		for(int i = 1; i <= high; i++) {
			
			for(int j = 1; j <= (2*high -1); j++) {
			
				if(j>=n1 && j<=n2) {
					System.out.print("*");
				} else {System.out.print(" ");}
			}
			System.out.println();
			n1++;
			n2--;
		}
		sc.close();
		
	}
	
	public static void main(String[] args) throws IOException {
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
//		apartado16();
//		apartado17();
//		apartado18();
//		apartado19();
//		apartado20();
//		apartado21();
//		apartado22();
//		apartado23();
//		apartado24();
//		apartado25();
//		apartado26();
//		apartado27();
//		apartado28();
//		apartado29();
//		apartado30();
//		apartado31();
	}

}
