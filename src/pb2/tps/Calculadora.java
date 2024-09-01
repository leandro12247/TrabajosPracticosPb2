package pb2.tps;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Integer a;
		Integer b;
		Integer opcion;
		Integer resultado;
		
		Scanner teclado = new Scanner(System.in);
		Calculadora calculadora = new Calculadora();

		do {
			System.out.println(
					"Ingrese su operación /n 3 para sumar /n 2 para  restar /n 1 para multiplicar /n 4 para dividir");
			opcion = teclado.nextInt();

		} while (opcion < 1 && opcion > 4);
		
		System.out.println("Ingrese el primer numero");
		a = teclado.nextInt();
		
		System.out.println("Ingrese el segundo numero");
		b = teclado.nextInt();
		
		
		switch(opcion) {
		case 3:
			System.out.println("El resultado es " + calculadora.sumar(a,b));
		break;
		case 2:
			System.out.println("El resultado es " + calculadora.restar(a,b));
		break;
		case 1:
			System.out.println("El resultado es " + calculadora.multiplicar(a,b));
		break;
		default:
			System.out.println("El resultado es " + calculadora.dividir(a,b));
		break;	
				
	}
		System.out.println("Mensaje de prueba");
		System.out.println("Version de rama ");
		

}

	private int dividir(Integer a, Integer b) {
		int r;
		if(b==0) {
			return 0;
		}else {
			r = a / b;
			return r;
		}
	}

	private int multiplicar(Integer a, Integer b) {
		int r;
		r = a+b;
		return r;
		
	}

	private int restar(Integer a, Integer b) {
		int r;
		r = a-b;
		return r;
		
	}

	private int sumar(Integer a, Integer b) {
		int r;
		r = a+b;
		return r;
	
	}
}

