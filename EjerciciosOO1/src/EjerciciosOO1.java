
public class EjerciciosOO1 {

	public static void apartado1() {
		Persona p = new Persona("Pepito", 16);
		System.out.println(p.getNombre() + " -> " + p.getEdad());
		
		p.setEdad(-5);
		System.out.println(p.getNombre() + " -> " + p.getEdad());
	}
	
	public static void apartado2() {
		Persona p = new Persona("Pepito", 16);
		p.saluda();
	}
	
	public static void apartado3() {
		Persona p1 = new Persona("Pedro", 34);
		Persona p2 = new Persona(p1);
		
		p2.setNombre("María");
		p2.setEdad(25);
		
		p1.saluda();
		p2.saluda();
	}
	
	public static void apartado4() {
		Persona[] personas = {
			new Persona("Ana", 25),
			new Persona("Juan", 43),
			new Persona("Antonio", 64),
			new Persona("Marta", 18)
		};
		
//		for(int i = 0; i < personas.length; i++) {
//			personas[i].saluda();
//		}
		
		for(Persona p: personas) {
			p.saluda();
		}
	}
	
	public static void apartado5() {
		Persona[] personas = {
			new Persona("Ana", 25),
			new Persona("Juan", 43),
			new Persona("Antonio", 64),
			new Persona("Marta", 18)
		};
		
		Persona[] personasCopia = Persona.copiaArray(personas);
		
		personas[0].setNombre("Paco");
		System.out.println(personas[0].getNombre());
		System.out.println(personasCopia[0].getNombre());
	}
	
	public static void apartado6() {
		Persona[] personas = {
			new Persona("Ana", 25),
			new Persona("Juan", 43),
			null,
			new Persona("Marta", 18),
			null
		};
		
		Persona[] personasCopia = Persona.copiaArray(personas);
		personas[0].setNombre("Paco");
		
		System.out.println("----- ARRAY ORIGINAL ------");
		for(Persona p: personas) {
			if(p == null) {
				System.out.println("NULL");
			} else {
				p.saluda();
			}
		}
		System.out.println("----- ARRAY COPIA ------");
		for(Persona p: personasCopia) {
			if(p == null) {
				System.out.println("NULL");
			} else {
				p.saluda();
			}
		}
	}
	
	public static void apartado7() {
		Persona p1 = new Persona("Juan", 25);
		Persona p2 = new Persona("Marta", 36);
		Persona p3 = new Persona("Ana", 26);
		Persona p4 = new Persona("Alfredo", 17);
		
		Persona[] personas = {p1, p2, p3};
		
		System.out.println(p2.getNombre() + " está en el array: " + p2.estoyEnArray(personas));
		System.out.println(p4.getNombre() + " está en el array: " + p4.estoyEnArray(personas));
	}
	
	public static void apartado8() {
		Empresa emp = new Empresa("Informática Barata SL");
		System.out.println("He creado la empresa " + emp.getNombre());
	}
	
	public static void apartado9() {
		Empresa emp = new Empresa("Informática Barata SL");
		System.out.println("He creado la empresa " + emp.getNombre());
		
		Persona p1 = new Persona("Juan", 25);
		Persona p2 = new Persona("Marta", 36);
		Persona p3 = new Persona("Ana", 26);
		
		emp.contrataEmpleado(p1);
		emp.contrataEmpleado(p2);
		emp.contrataEmpleado(p3);
		
		emp.mostrarEmpleados();
	}
	
	public static void apartado10() {
		Empresa emp = new Empresa("Informática Barata SL");
		System.out.println("He creado la empresa " + emp.getNombre());
		
		Persona p1 = new Persona("Juan", 25);
		Persona p2 = new Persona("Marta", 36);
		Persona p3 = new Persona("Ana", 26);
		Persona p4 = new Persona("Alfredo", 17);
		Persona p5 = new Persona("Manolo", 38);
		
		emp.contrataEmpleado(p1);
		emp.contrataEmpleado(p2);
		emp.contrataEmpleado(p3);
		emp.contrataEmpleado(p4);
		emp.contrataEmpleado(p5);
		System.out.println("----- TODOS LOS EMPLEADOS CONTRATADOS -----");
		emp.mostrarEmpleados();
		
		emp.despideEmpleado(1);
		emp.despideEmpleado("Alfredo");
		System.out.println("----- DESPUÉS DE LOS RECORTES -----");
		emp.mostrarEmpleados();
	}
	
	public static void main(String[] args) {
//		apartado1();
//		apartado2();
//		apartado3();
//		apartado4();
//		apartado5();
//		apartado6();
//		apartado7();
//		apartado8();
//		apartado9();
		apartado10();
	}

}
