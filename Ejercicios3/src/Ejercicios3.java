import java.util.Arrays;
import java.util.Scanner;

public class Ejercicios3 {
	
	public static void apartado0() {
		int table [][] = {{5,7,9},{10,3,2},{7,6,6}};/*
		int notas;
		double media;
		for(int i=0;i<table.length;i++) {
			notas=0;
			media=0;
			
			for(int j=0;j<table[i].length;j++) {
				notas += table[i][j] ;
				
				
			}
			media = (double) notas/table[0].length;
			System.out.printf("La media del alumno %d es %.2f\n",i+1,media);
		}*/
		for(int[] alumno:table) {
			int suma = 0;
			for(int nota:alumno) {
				suma += nota;
			}
			System.out.println("Media: "+((double)suma/alumno.length));
		}
		
	}
	
	public static void apartado1() {
		String[] meses = { "Enero", "Febrero", "Marzo" , "Abril", "Mayo", "Junio", 
				"Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		int[] dias = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce número del mes");
		int n = sc.nextInt();
		System.out.println("El mes es: " + meses[n-1] + " y tiene " + dias[n-1] + " días");
		sc.close();
	}
	
	public static void apartado2() {
		
		Scanner sc = new Scanner(System.in);
		int x [] = new int [10];
		System.out.println("Introduce 10 números: ");
		
		for(int i = 0; i < x.length;i++) {
			x[i] = sc.nextInt();
		}
		System.out.println("Lista de números introducidos");
		Arrays.stream(x).forEach(n->System.out.print(n + " "));
		
		System.out.println("Suma de números introducidos: " + Arrays.stream(x).sum());
		
		System.out.println("Media de números introducidos: " + Arrays.stream(x).average());
		
		int max= x[0];
		int min = x[0];
		for(int num:x) {
			max = (max>=num) ? max : num;
			min = (min<=num) ? min : num;
		}
		
		System.out.printf("Máximo número introducido: %d \nMínimo número introducido: %d",max,min);
		sc.close();
		
		
		/*int[] numeros = new int[5];
		int total = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("Dime el n�mero " + (i+1) + ": ");
			numeros[i] = sc.nextInt();
		}
		
		int mayor = numeros[0];
		int menor = numeros[0];
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println(i + " -> " + numeros[i]);
			total += numeros[i];
			
			mayor = Math.max(numeros[i], mayor);
			menor = Math.min(numeros[i], mayor);
		}
		
		System.out.println("Suma de los n�meros: " + total);
		System.out.println("Media de los n�meros: " + total / (double)numeros.length);
		System.out.println("Mayor: " + mayor);
		System.out.println("Menor: " + menor);
		
		sc.close();*/
	}
	
	public static void apartado4() {
		int[] dias = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime el mes: ");
		int mes = sc.nextInt();
		System.out.print("Dime el dia: ");
		int dia = sc.nextInt();
		
		int total = 0;
		
		for(int i = 0; i < mes-1; i++) {
			total += dias[i];
		}
		
		total += dia;
		
		System.out.println("Total del d�as del a�o: " + total);
		sc.close();
	}
	
	public static void apartado5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�Cu�ntos alumnos hay en total?: ");
		int cantidad = sc.nextInt();

		double[] notas = new double[cantidad];
		String[] nombres = new String[cantidad];
		
		for(int i = 0; i < cantidad; i++) {
			System.out.print("Nombre y nota (separados por espacio): ");
			nombres[i] = sc.next();
			notas[i] = sc.nextDouble();
		}
		
		for(int i = 0; i < cantidad; i++) {
			System.out.printf("%15s: %5.2f\n", nombres[i], notas[i]);
		}
		sc.close();
	}
	
	public static void apartado7() {
		int[] numeros1 = {7, 12, 3, 8, 3, 9, 5, 11, 20, 9};
		int[] numeros2 = {8, 5, 3, 12, 25, 1, 6, 13, 7, 4};
		int[] numeros3 = new int[numeros1.length];
		
		for(int i = 0; i < numeros1.length; i++) {
			numeros3[i] = numeros1[i] + numeros2[i];
		}
		
		for(int i = 0; i < numeros3.length; i++) {
			System.out.println(numeros3[i]);
		}
	}
	
	public static void apartado8() {
		Scanner sc = new Scanner(System.in);
		// Crear un array de 10 posiciones
		String[] nombres = new String[10];
		boolean repetido;
		String nombre;
		
//		for(int i = 0; i < nombres.length; i++) {
//			do {
//				System.out.print("Dime el nombre " + (i+1) + ": ");
//				nombre = sc.nextLine();
//				repetido = false;
//				for(int j = 0; j < i && repetido == false; j++) {
//					if(nombres[j].equals(nombre)) {
//						repetido = true;
//					}
//				}
//				if(repetido == true) {
//					System.out.println("El nombre est� repetido!");
//				}
//			} while(repetido == true);
//			nombres[i] = nombre;
//		}
		
		// Recorrer el array e ir pidiendo nombres: i -> 0 - (array.length-1)
		// Recorremos las posiciones anteriores buscando el nombre a ver si est� repetido: j -> 0 - (i-1)
	    // Si el nombre est� repetido, mostr�is un error y ped�s otra vez ese nombre: i--
		
		for(int i = 0; i < nombres.length; i++) {
			System.out.print("Dime el nombre " + (i+1) + ": ");
			nombre = sc.nextLine();
			repetido = false;
			
			for(int j = 0; j < i && repetido == false; j++) {
				if(nombres[j].equals(nombre)) {
					repetido = true;
				}
			}
			
			if(repetido == true) {
				System.out.println("El nombre est� repetido!");
				i--;
			} else {
				nombres[i] = nombre;
			}
		}
			
		System.out.println(Arrays.toString(nombres));
		sc.close();
	}
	
	public static void apartado9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime un nombre: ");
		String nombre = sc.nextLine().toLowerCase();
				
		for(int i = 0; i < nombre.length(); i++) {
			char letra = nombre.charAt(i);
			switch(letra) {
				case 'a':
				case 'á':
				case 'e':
				case 'é':
				case 'i':
				case 'í':
				case 'o':
				case 'ó':
				case 'u':
				case 'ú':
					System.out.print(letra + " ");
			}
		}
		sc.close();
	}
	
	public static void apartado10() {
		String args[] = new String[5];
		if(args.length == 2) {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			int resultado = num1 + num2;
			System.out.println("Resultado: " + resultado);
		} else {
			System.err.println("Debes pasar 2 números por parámetro");
		}

		int total = 0;
		for(int i = 0; i < args.length; i++) {
			total += Integer.parseInt(args[i]);
		}
		System.out.println("Suma de los parámetros: " + total);
	}
	
	public static void apartado11() {
		String[] nombres = {"Juan", "Antonio", "Luis", "Tania"};
		int[][] notas = {
				{4, 7, 8, 2},
				{8, 7, 7, 9},
				{5, 3, 9, 2},
				{9, 3, 7, 9}
		};
		
		for(int i = 0; i < nombres.length; i++) {
			int total = 0;
			for(int j = 0; j < notas[i].length; j++) {
				total += notas[i][j];
			}
			double media = (double)total / notas[i].length;
			System.out.printf("Nombre: %s, media: %.2f\n", nombres[i], media);
		}
	}
	
	public static void apartado12() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�Cu�ntos alumnos quieres almacenar?: ");
		int numAlum = Integer.parseInt(sc.nextLine());
		
		String[] nombres = new String[numAlum];
		int[][] notas = new int[numAlum][];
		
		for(int i = 0; i < numAlum; i++) {
			notas[i] = new int[4];
		}
		
		for(int i = 0; i < numAlum; i++) {
			System.out.println("ALUMNO " + (i+1));
			System.out.print("Nombre del alumno: ");
			nombres[i] = sc.nextLine();
			for(int j = 0; j < notas[i].length; j++) {
				System.out.print("Nota " + (j + 1) + ": ");
				notas[i][j] = Integer.parseInt(sc.nextLine());
			}
			System.out.println("--------------------------");
		}
		
		for(int i = 0; i < numAlum; i++) {
			int total = 0;
			for(int j = 0; j < notas[i].length; j++) {
				total += notas[i][j];
			}
			double media = (double)total / notas[i].length;
			System.out.printf("Nombre: %s, media: %.2f\n", nombres[i], media);
		}
		sc.close();
	}
	
	public static void apartado13() {
		String[][] productos = {
				{"Silla", "44.95", "6"},
				{"Teclado", "15.50", "12"},
				{"Mesa", "104.60", "3"}
		};
		
		System.out.printf("%-14s%10s%8s%12s\n", "NOMBRE", "PRECIO", "CANT", "TOTAL");
		System.out.println("----------------------------------------------------------");
		for(int i = 0; i < productos.length; i++) {
			double precio = Double.parseDouble(productos[i][1]);
			int cantidad = Integer.parseInt(productos[i][2]);
			double total = precio * cantidad;
			System.out.printf("%-14s%9.2f�%8d%11.2f�\n", productos[i][0], precio, cantidad, total);
		}
	}
	
	public static void main(String[] args) {
		
//		apartado0();
//		apartado1();
//		apartado1();
//		apartado2();
//		apartado4();
//		apartado5();
//		apartado7();
//		apartado8();
//		apartado9();
//		apartado11();
//		apartado12();
//		apartado13();
		
		
	}

}
