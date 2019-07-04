/* Grupo 1 la mejor mitad
 * 
 * Bono, Ramiro.
 * Guemberena, Juan Cruz
 * 
 * Mails:
 * ramiro.cba@gmail.com
 * chinoguembe@gmail.com
 * */

import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char tipo = ' ';
		ListaEnlazada lista = new ListaEnlazada();
		
		System.out.println("Ingrese la cantidad de elementos que desea generar: ");
		
		int cantidad = sc.nextInt();
		
		for(int i=0 ; i < cantidad ; i++) {
			Random tipoElemento = new Random();
			char tipoDato = (char) (65 + tipoElemento.nextInt(3));
			int montoDato = tipoElemento.nextInt(100001);
			lista.insertarNodo(new Nodo(tipoDato,montoDato));
		}
		
		lista.imprimirLista();
		
		Menu.mostrarMenu1();
		
		int opcion = sc.nextInt();
		
		switch(opcion) {
		
		case 1:
			tipo = 'A';
			break;
			
		case 2:
			tipo = 'B';
			break;
			
		case 3:
			tipo = 'C';
			break;
			
		default:
			System.out.println("Opcion incorrecta");
			System.exit(0);
		}
		
		Menu.mostrarMenu2();
		
		int opcion2 = sc.nextInt();
		
		switch(opcion2) {
		
		case 1:
			System.out.println("Suma total de los elementos de tipo \""+tipo+"\": "+lista.sumarLista(tipo));
			break;
			
		case 2:
			if(lista.borrarNodoPorTipo(tipo))
				System.out.println("Se han borrado los nodos exitosamente");
			else
				System.out.println("No se han borrado nodos");
			
			System.out.println("Lista resultante:");
			lista.imprimirLista();
			break;
			
		case 3:
			System.exit(0);
		}
		sc.close();
	}
}