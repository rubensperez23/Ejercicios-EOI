import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.StringJoiner;

public class Ejercicios5 {
	
	public static void apartado0() throws IOException {
		//C:\Users\ruben\Documents\documento.txt
		Files.readAllLines(Paths.get("c:\\Users\\ruben\\Documents" + File.separator + "documento.txt"))
		.forEach(l->System.out.println(l));
	}
	
	
	public static void apartado1() {
		Path ruta = Paths.get("numeros.txt");
		int total = 0;
		StringJoiner sj = new StringJoiner(" + ");
		
		try (BufferedReader buffer = new BufferedReader(new FileReader(ruta.toString()))) {
			 String line;
			 while((line = buffer.readLine()) != null) {
				 sj.add(line);
				 total += Integer.parseInt(line);
			 }
		} catch (FileNotFoundException e) {
			System.err.println("El archivo " + ruta + " no existe!");
		} catch (IOException e) {
			System.err.println("Error leyendo el archivo " + ruta);
		}
		
		System.out.println(sj + " = " + total);
	}
	
	public static void apartado1_2() {
		Path archivo = Paths.get("numeros.txt");
		int total = 0;
		List<String> lineas = null;
		
		try {
			 lineas = Files.readAllLines(archivo);
			 for(String num: lineas) {
				 total += Integer.parseInt(num);
			 }
		} catch (IOException e) {
			System.err.println("Error leyendo el archivo " + archivo);
		}
		
		System.out.println(String.join(" + ", lineas) + " = " + total);
	}
	
	// Todavía no hemos visto esto para que se entienda (es solo una demostración)
	public static void apartado1_3() {
		Path archivo = Paths.get("numeros.txt");
		List<String> lineas = null;
		
		try {
			 lineas = Files.readAllLines(archivo);
		} catch (IOException e) {
			System.err.println("Error leyendo el archivo " + archivo);
		}
		
		System.out.println(String.join(" + ", lineas) + " = " + lineas.stream().mapToInt(l -> Integer.parseInt(l)).sum());
	}
	
	public static void apartado2() {
		Path archivo = Paths.get("apartado2.txt");
		Scanner sc = new Scanner(System.in);
		String frase = "";
		
		try (PrintWriter print = new PrintWriter(archivo.toString())) {			
			while(!frase.equals("FIN")) {
				System.out.print("Escribe algo (FIN para terminar): ");
				frase = sc.nextLine();
				if(!frase.equals("FIN")) {
					print.println(frase);
				}
			}
		} catch (FileNotFoundException e) {
			System.err.println("ERROR: " + e.getMessage());
		}
		
	}
	
	public static void apartado3() {
		Path archivo = Paths.get("apartado3.txt");
		double total = 0;
		String alumAlta = "";
		String alumBaja = "";
		double notaAlta = 0;
		double notaBaja = 10;
		
		try {
			List<String> lineas = Files.readAllLines(archivo);
			for(String linea: lineas) {
				String[] datos = linea.split(";");
				String nombre = datos[0];
				Double nota = Double.parseDouble(datos[1]);
				
				total += nota;
				if(nota > notaAlta) {
					notaAlta = nota;
					alumAlta = nombre;
				}
				if(nota < notaBaja) {
					notaBaja = nota;
					alumBaja = nombre;
				}
			}
			
			System.out.printf("Media: %.2f\n", total / lineas.size());
			System.out.println("Nota más alta: " + alumAlta + " - " + notaAlta);
			System.out.println("Nota más baja: " + alumBaja + " - " + notaBaja);
			
		} catch (IOException e) {
			System.err.println("ERROR: " + e.getMessage());
		}
	}
	
	public static void anyadirProducto() {
		Path archivo = Paths.get("productos.txt");
		Scanner sc = new Scanner(System.in);
		System.out.print("Nombre: ");
		String nombre = sc.nextLine();
		System.out.print("Precio: ");
		double precio = Double.parseDouble(sc.nextLine());
		
		try (PrintWriter print = new PrintWriter(new FileWriter(archivo.toString(), true))) {
			print.println(nombre + ";" + precio);
		} catch (IOException e) {
			System.err.println("ERROR: " + e.getMessage());
		}
		
	}
	
	public static void mostrarProductos() {
		Path archivo = Paths.get("productos.txt");
		
		System.out.printf("%-20s%11s\n", "NOMBRE", "PRECIO");
		System.out.println("-------------------------------------------");
		try (BufferedReader buffer = new BufferedReader(new FileReader(archivo.toString()))) {
			String linea;
			while((linea = buffer.readLine()) != null) {
				String[] datos = linea.split(";");
				String nombre = datos[0];
				double precio = Double.parseDouble(datos[1]);
				System.out.printf("%-20s%10.2f€\n", nombre, precio);
			}
		}  catch (FileNotFoundException e) {
			System.err.println("El archivo " + archivo + " no existe!");
		} catch (IOException e) {
			System.err.println("Error leyendo el archivo " + archivo);
		}
	}
	
	public static void apartado4() {
		Scanner sc = new Scanner(System.in);
		String opcion;
		
		do {
			System.out.println("1) Mostrar productos");
			System.out.println("2) Añadir producto");
			System.out.println("0) Salir");
			System.out.print("Elige una opción: ");
			opcion = sc.nextLine();
			
			switch(opcion) {
			case "1":
				mostrarProductos();
				System.out.println("Presiona enter para continuar...");
				sc.nextLine();
				break;
			case "2":
				anyadirProducto();
				System.out.println("Presiona enter para continuar...");
				sc.nextLine();
			}
		} while(!opcion.equals("0"));
	}
	
	public static void apartado5() {
		Scanner sc = new Scanner(System.in);
		Path archivo = Paths.get("palabras.txt");
		
		try {
			List<String> lineas = Files.readAllLines(archivo);
			int pos = new Random().nextInt(lineas.size());
			String palabra = lineas.get(pos);
			String adivina;
			boolean adivinada = false;
			for(int i = 1; i <= 3 && !adivinada; i++) {
				System.out.print("Adivina la palabra (intento " + i + "): ");
				adivina = sc.nextLine();
				if(adivina.equals(palabra)) {
					adivinada = true;
				}
			}
			if(adivinada) {
				System.out.println("La has adivinado!");
			} else {
				System.out.println("Lo siento. La palabra era: " + palabra);
			}
		} catch (IOException e) {
			System.err.println("ERROR: " + e.getMessage());
		}
	}
	
	public static void apartado6() {
		Scanner sc = new Scanner(System.in);
		Path archivo = Paths.get("palabras.txt");
		
		try {
			List<String> lineas = Files.readAllLines(archivo);
			int pos = new Random().nextInt(lineas.size());
			String palabra = lineas.get(pos);
			boolean adivinada = false;
			int fallos = 0;
			char[] adivinar = new char[palabra.length()];
			Arrays.fill(adivinar, '*');
			
			while(!adivinada && fallos < 7) {
				System.out.println(new String(adivinar));
				System.out.print("Dime una letra (fallos " + fallos + "): ");
				char letra = sc.nextLine().charAt(0);
				
				boolean acierto = false;
				for(int i = 0; i < palabra.length(); i++) {
					if(letra == palabra.charAt(i)) {
						adivinar[i] = letra;
						acierto = true;
					}
				}
				
				if(!acierto) {
					fallos++;
				}
				
				String adivinarString = new String(adivinar);
				if(adivinarString.equals(palabra)) {
					adivinada = true;
				}
			}
			
			if(adivinada) {
				System.out.println("La has adivinado!");
			} else {
				System.out.println("Lo siento. La palabra era: " + palabra);
			}
		} catch (IOException e) {
			System.err.println("ERROR: " + e.getMessage());
		}
	}

	public static void main(String[] args) throws IOException {
		apartado0();
//		apartado1();
//		apartado1_2();
//		apartado1_3();
//		apartado2();
//		apartado3();
//		apartado4();
//		apartado5();
//		apartado6();
	}

}
