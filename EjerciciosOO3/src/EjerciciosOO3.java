import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class EjerciciosOO3 {
	
	
	public static void apartado1() {
		List<Integer> numbers = new ArrayList <Integer>(Arrays.asList(10,20,30,40));
		numbers.add(50);
		numbers.add(60);
//		numbers.removeIf(n -> n == 20);
		numbers.remove(numbers.indexOf(20));
		numbers.add(1,25);
		numbers.add(2,26);
		numbers.sort(Collections.reverseOrder());
		System.out.println(numbers);
		
	}

	public static void apartado2() {
		Empresa emp = new Empresa("Mi empresa", new Direccion("Reyes Católicos", 15), 5);
	    emp.addEmpleado(new Empleado("Pepe", 20000));
	    emp.addEmpleado(new Empleado("Ana", 18000));
	    emp.addEmpleado(new Empleado("Juan", 35000));
	    
	    Empresa copiaEmp = new Empresa(emp);
	    copiaEmp.getEmpleado(0).setNombre("María");
	    copiaEmp.getDireccion().setNumero(99);
	    copiaEmp.addEmpleado(new Empleado("Paco", 100000));
	    
	    System.out.println(emp);
	    System.out.println("----------------------");
	    System.out.println(copiaEmp);
	}
	
	public static void apartado3() {
		Map<String, Persona> personas = new HashMap<String, Persona>();
		personas.put("59245512R", new Persona("23564784Y", "Juan", 28));
		personas.put("23564784Y", new Persona("23564784Y", "Pepe", 35));
		personas.put("54373825O", new Persona("23564784Y", "María", 36));
		
		personas.forEach((dni, persona) -> System.out.println(dni + " => " + persona));
	}
	
	public static void apartado4() {
		List<Integer> numeros = new ArrayList<>(Arrays.asList(2, 14, 20, 34, 27, 567, 1264, 586, 34, 63));
//		for(int i = 0; i < numeros.size(); i++) {
//			numeros.set(i, numeros.get(i) / 2);
//		}
		
		numeros.replaceAll(n -> n / 2);
		System.out.println(numeros);
		
//		List<Integer> pares = new ArrayList<>();
//		for(int i = 0; i < numeros.size(); i++) {
//			if(numeros.get(i) % 2 == 0) {
//				pares.add(numeros.get(i));
//			}
//		}
//		numeros = pares;
		
		numeros.removeIf(n -> n % 2 == 1);
		System.out.println(numeros);
	}
	
	public static void apartado5() {
		Scanner sc = new Scanner(System.in);
		Set<String> palabras = new HashSet<>();
		String palabra = null;
		
		do {
			System.out.print("Introduce palabra (salir para terminar): ");
			palabra = sc.nextLine();
			if(!palabra.toLowerCase().equals("salir")) {
				if(palabras.contains(palabra)) {
					System.out.println("La palabra introducida está repetida....");
				} else {
					palabras.add(palabra);
				}
			}
		} while(!palabra.toLowerCase().equals("salir"));
		
		System.out.println("Palabras introducidas: ");
		palabras.forEach(p -> System.out.println(p));
		sc.close();
	}

	
	
	public static void main(String[] args) {

//		apartado1();
//		apartado2();
//		apartado3();
//		apartado4();
//		apartado5();

		
	}

}
