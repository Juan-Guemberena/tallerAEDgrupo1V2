/* Grupo 1
 * 
 * Bono, Ramiro.
 * Moreno Rodriguez, Federico R.
 * Guemberena, Juan Cruz
 * Firbeda, Tomas
 * 
 * Mails:
 * ramiro.cba@gmail.com
 * morenorfederico21@gmail.com
 * chinoguembe@gmail.com
 * firbedatomasf@gmail.com
 * */

package test;

import java.util.ArrayList;
import java.util.Scanner;
import modelo.*;
import vista.Menu;
import util.RandomUtils;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Box> cajas = new ArrayList<Box>(); //Array de cajas
		
		final int INDICE_CAJAS = 4;
		boolean bandera = true;
		
		//Creacion de las cajas y carga de las cagas en el ArrayList.
		Box caja1 = new Box();
		Box caja2 = new Box();
		Box caja3 = new Box();
		Box caja4 = new Box();
		cajas.add(caja1);
		cajas.add(caja2);
		cajas.add(caja3);
		cajas.add(caja4);
		
		//Carga las colas dentro del array con una cantidad de elementos random y con un dato random.
		for(int i = 0; i < INDICE_CAJAS; i++)
		cajas.set(i, RandomUtils.cargarColaRandom( cajas.get(i), RandomUtils.generarNumeroAleatorio() ) );
		
		Menu.mostrarMenu();
		
		int opcion = sc.nextInt();
		
		switch(opcion) {
		
		case 1:
			//Muestra el estado inicial de los boxes.
			System.out.println("Estado inicial:");
			for(int i = 0; i < cajas.size(); i++) {
				System.out.print("\n[BOX" + " " + i + "]: ");
				cajas.get(i).listar();
			}
			
			System.out.println("\n\nComenzando Simulacion:\n");
			do {
				Box aux = new Box();
				
				//Obtiene una caja de forma aleatoria.
				aux = cajas.get(RandomUtils.generarNumeroAleatorio(INDICE_CAJAS));
				
				while (aux.isEmpty()) {
					aux = cajas.get(RandomUtils.generarNumeroAleatorio(INDICE_CAJAS));
				}//Fin while interno.
				
				//Si la caja no esta vacia y es igual a la caja del indice i; quita 1 elemento de la cola
				//y devuelve el elemento extraido. Si la cola esta vacia, solo imprime un mensaje con el estado.
				for (int i = 0; i < INDICE_CAJAS; i++) {
					if (cajas.get(i).equals(aux) && !(cajas.get(i).isEmpty()))
						System.out.printf("[BOX" + " " + i + "]: Se quito '%s'\n", aux.dequeue());
						if (aux.size()== 0){
							System.out.println("[BOX" + " " + i + "]: Vacio");
							break;
						}//Fin if interno.
				}//Fin for.
						
						//determina la bandera para la salida del do-while.
						if (cajas.get(0).isEmpty() && cajas.get(1).isEmpty() &&
							cajas.get(2).isEmpty() && cajas.get(3).isEmpty())
							bandera = false;
					}//Fin Bloque do.
				while (bandera);
				System.out.println("\nPrograma finalizado");
			break;
		case 2:
			System.out.println("\nPrograma finalizado");
			System.exit(0);
			break;
		default:
			break;
		}//Fin switch
		sc.close();
	}//Fin método main.

}//Fin clase main.

/* 

A) Nosotros creemos que, a los fines practicos, la solucion planteada en la presente implementacion de codigo sirve como un modelo valido para
   explicar el comportamiento de una linea de boxes de atencion al cliente. Consideramos que, desde el punto de vista del funcionamiento, dicho
   modelo lo implementa correctamente, salvando la pseudoaleatoriedad que prima en la presente solucion y que dista de una situacion de la vida real.

B) A la hora de comparar 2 implementaciones distintas, ya sea cola unica o colas independientes, creemos que es necesario poder realizar una medicion
   del tiempo que demora en procesar N elementos una y otra, a los fines de comparar y determinar que implementacion es la mas optima.
   Sin dudas, el modelo actual prescinde de una variable tiempo que permita realizar dicha simulacion y medicion de ambas implementaciones.
   Dicha variable deberia estar definida a nivel de Nodo como un atributo de clase.
   
C) Sin duda, agregarle prioridad a la solucion propuesta supone un cambio en el modelo actual. Es posible implementarla mediante la
   estructura de datos llamada "Cola con prioridad". Clases que representen la estructura de datos "Cola con prioridad" deberian ser añadidas.
  
D) Ademas de java.util.Random, otra alternativa disponible es java.Math.random o java.security.SecureRandom, la cual provee un generador de numeros
   aleatorios criptograficamente mas robusto. Utilizamos java.util.Random ya que fue la mas sencilla de implementar, a diferencia de SecureRandom
   que requeria de mayor complejidad para su implementacion. Ademas, este modelo no justifica el uso de un generador tan potente.
    
 */