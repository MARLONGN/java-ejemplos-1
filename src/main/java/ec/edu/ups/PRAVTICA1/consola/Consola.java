package ec.edu.ups.PRAVTICA1.consola;

import java.util.Scanner;

import ec.edu.ups.PRAVTICA1.clases.Asignaturas;
import ec.edu.ups.PRAVTICA1.clases.Estudiante;
import ec.edu.ups.PRAVTICA1.clases.Profesor;

public class Consola {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int i=0;
		for(i=0;i<=1;i++) {
			Profesor profe=new Profesor();
			System.out.println("ingrese el nombre");
			String ingresarnombre=scanner.next();
			profe.setNombre(ingresarnombre);
			
			System.out.println("ingrese la edad");
			String ingresaredad=scanner.next();
			profe.setEdad(ingresaredad);
			
			System.out.println("ingrese el conocimiento magico");
			String ingresarconocimientomagico=scanner.next();
			profe.setConocimientoMagico(ingresarconocimientomagico);
			
			System.out.println("ingrese magia unica");
			String ingresarmagiaunica=scanner.next();
			profe.setMagiaUnica(ingresarmagiaunica);
			
			System.out.println("ingrese la especialidad");
			String ingresarespecialidad=scanner.next();
			profe.setEspecialidad(ingresarespecialidad);
			
			/*System.out.println(profe.getNombre()+","+profe.getEdad()+","+profe.getConocimientoMagico()+","+profe.getMagiaUnica()+","+profe.getEspecialidad());
			*/
			System.out.println(profe.toString());
			
			Estudiante estu=new Estudiante();
			System.out.println("ingrese nombre");
			String ingresarelnombre=scanner.next();
			estu.setNombre(ingresarelnombre);
			
			System.out.println("ingrese edad");
			String ingresaedad=scanner.next();
			estu.setEdad(ingresaedad);
			
			System.out.println("ingrese elemento magico");
			String ingreseelelementomagico=scanner.next();
			estu.setElementoMagico(ingreseelelementomagico);
			
			/*System.out.println(estu.getNombre()+","+estu.getEdad()+","+estu.getElementoMagico());
			*/
			System.out.println(estu.toString());
			
			Asignaturas asig=new Asignaturas();
			System.out.println("ingrese posion de estrellas");
			String ingresarlaposiondeestrellas=scanner.next();
			asig.setPocionEstrellas(ingresarlaposiondeestrellas);
			
			System.out.println("ingrese el hechizo antiguo");
			String ingresarhechizoantiguo=scanner.next();
			asig.setHechizoAntiguo(ingresarhechizoantiguo);
			
			System.out.println("ingrese uso magico");
			String ingresarusomagico=scanner.next();
			asig.setUsoMaigico(ingresarusomagico);
			
			System.out.println("ingrese el elemento");
			String ingresarelemento=scanner.next();
			asig.setElemento(ingresarelemento);
			
			/*System.out.println(asig.getPocionEstrellas()+","+asig.getHechizoAntiguo()+","+asig.getUsoMaigico()+","+asig.getElemento());
			*/
			System.out.println(asig.toString());
		}
	}
}
