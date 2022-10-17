import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicios4 {

	public static void apartado2(String cadena, int min, int max) {
		if(cadena.length() >= min && cadena.length() <= max) {
			System.out.println("La cadena " + cadena + " está entre " + min + " y " + max + " caracteres");
		} else {
			System.out.println("ERROR: La cadena se sale de rango");
		}
	}
	
	public static void apartado3(char c, int lado) {
		for(int fila = 0; fila < lado; fila++) {
			for(int col = 0; col < lado; col++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
	
	public static void apartado4(String nombre, String ...trabajos) {
		if(trabajos.length == 0) {
			System.out.println(nombre + ": No ha trabajado nunca");
		} else {
			System.out.println(nombre + ": " + String.join(", ", trabajos));
		}
	}
	
	public static boolean apartado5(int num) {
		boolean primo = true;
		
		for(int i = 2; i <= num / 2 && primo; i++) {
			if(num % i == 0) {
				primo = false;
			}
		}
		
		return primo;
	}
	
	public static double apartado6(int[] nums) {
		double total = 0;
		
		for(int i = 0; i < nums.length; i++) {
			total += nums[i];
		}
		
		return total / nums.length;
	}
	
	public static String apartado7(String[] palabras) {
		int pos = new Random().nextInt(palabras.length);
		return palabras[pos];
	}
	
	public static int apartado9(String cadena, String trozo) {
		int veces = 0;
		int pos = 0;
		
		do {
			pos = cadena.indexOf(trozo, pos);
			if(pos != -1) {
				veces++;
				pos++;
			}
		} while(pos != -1);
		
		return veces;
	}
	
	public static double apartado11(String numCad) {
		String[] numsStr = numCad.split(";");
		double total = 0;
		
		for(int i = 0; i < numsStr.length; i++) {
			total += Integer.parseInt(numsStr[i]);
		}
		
		return total / numsStr.length;
	}
	
	public static void apartado15(String fechaStr) {
//		int dia = Integer.parseInt(fechaStr.substring(0, 2));
//		int mes = Integer.parseInt(fechaStr.substring(3, 5));
//		int anyo = Integer.parseInt(fechaStr.substring(6));
//		LocalDate fecha = LocalDate.of(anyo, mes, dia);
		
		LocalDate fecha = LocalDate.parse(fechaStr, DateTimeFormatter.ofPattern("dd-MM-y"));
		
		LocalDate fecha2 = fecha.plusYears(2).plusMonths(3).plusDays(5);
		System.out.println(fecha2.format(DateTimeFormatter.ofPattern("dd/MM/y")));
	}
	
	public static String[] apartado12(String[] cadenas) {
		Arrays.parallelSort(cadenas, (c1, c2) -> c2.compareTo(c1));
		return cadenas;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		apartado2("cocina", 3, 8);
//		apartado2("cocina", 8, 15);
		
//		apartado3('g', 5);
//		apartado3('+', 7);
		
//		apartado4("Pepe");
//		apartado4("Juan", "Albañil", "Panadero", "Astronauta");
		
//		System.out.println("17 es primo?: " + apartado5(17));
//		System.out.println("25 es primo?: " + apartado5(25));
		
//		int[] numeros = {4, 5, 12, 9, 21, 6};
//		System.out.println("Media: " + apartado6(numeros));ç
		
//		String[] palabras = {"casa", "gato", "mano", "cara", "silla"};
//		String palabraAdivinar = apartado7(palabras);
//		
//		boolean adivinada = false;
//		int intentos = 0;
//		while(!adivinada && intentos < 3) {
//			System.out.print("Adivina la palabra (intento " + (intentos + 1) + "): ");
//			String palabra = sc.nextLine();
//			if(palabra.equals(palabraAdivinar)) {
//				adivinada = true;
//			}
//			intentos++;
//		}
//		
//		if(adivinada) {
//			System.out.println("Enhorabuena, has acertado!");
//		} else {
//			System.out.println("La palabra correcta era " + palabraAdivinar);
//		}
		
//		String frase = "cocinando cocos con chocolate";
//		String trozo = "co";
//		int veces = apartado9(frase, trozo);
//		System.out.println("El trozo '" + trozo + "' aparece " + veces + " veces en '" + frase + "'");
		
//		double media = apartado11("3;23;6;17;9;11");
//		System.out.println(media);
		
//		String[] palabras2 = {"pato", "azucena", "elefante", "margarita", "gato", "liebre"}; 
//		String[] palabrasOrdenadas = apartado12(palabras2);
//		System.out.println(String.join(", ", palabrasOrdenadas));
		
		apartado15("03-06-2020");
	}

}
