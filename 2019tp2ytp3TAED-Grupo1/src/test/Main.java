package test;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.*;
import vista.Menu;
import util.RandomUtils;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Box> cajas = new ArrayList<Box>();
		
		final int INDICE_CAJAS = 4;
		boolean bandera = true;
		
		Box caja1 = new Box();
		Box caja2 = new Box();
		Box caja3 = new Box();
		Box caja4 = new Box();
		cajas.add(caja1);
		cajas.add(caja2);
		cajas.add(caja3);
		cajas.add(caja4);
		
		for(int i = 0; i < INDICE_CAJAS; i++)
		cajas.set(i, RandomUtils.cargarColaRandom( cajas.get(i), RandomUtils.generarNumeroAleatorio() ) );
		
		Menu.mostrarMenu();
		
		int opcion = sc.nextInt();
		
		switch(opcion) {
		
		case 1:
			
			System.out.println("Estado inicial:");
			for(int i = 0; i < cajas.size(); i++) {
				System.out.print("\n[BOX" + " " + i + "]: ");
				cajas.get(i).listar();
			}
			
			System.out.println("\n\nComenzando Simulaci�n");
			do {
				Box aux = new Box();


				aux = cajas.get(RandomUtils.generarNumeroAleatorio(INDICE_CAJAS));
				while (aux.isEmpty()) {
					aux = cajas.get(RandomUtils.generarNumeroAleatorio(INDICE_CAJAS));
				}

				for (int i = 0; i < INDICE_CAJAS; i++)
					if ((cajas.get(i).equals(aux)) && (cajas.get(i).isEmpty())) {
						System.out.println("\n[BOX" + " " + i + "] Vacio");

					} else {
						for (i = 0; i < INDICE_CAJAS; i++) {
							if (cajas.get(i).equals(aux) && !(cajas.get(i).isEmpty()))
								System.out.printf("\n\n[BOX" + " " + i + "]: Se quito '%s'", aux.dequeue());

						}
					}


						if (cajas.get(0).isEmpty() && cajas.get(1).isEmpty() && cajas.get(2).isEmpty() && cajas.get(3).isEmpty())
							bandera = false;
					}
				while (bandera) ;

			
			break;
		case 2:
			System.out.println("Programa finalizado");
			System.exit(0);
			break;
		default:
			break;
		}
	}//Fin metodo main.

}//Fin clase main.
