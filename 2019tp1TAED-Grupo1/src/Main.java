import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args ) {
		Stack<String> stack = new Stack<String>();
		Scanner sc = new Scanner(System.in);
		Pila pila = new Pila();
		String expresion;
		int opcion;
		boolean expresionValida;
		
		do {
			Menu.mostrarMenu();
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 1:
				expresionValida = true;
				System.out.println("Ingrese la cadena de caracteres: ");
				//Skipping the previous line
				sc.nextLine();
				expresion = sc.nextLine();
				if(expresion.length() != 0) {
					for(char a : expresion.toCharArray()) {
						if(a == '[' || a == '(') {
							pila.push(new Nodo(a));
							System.out.println("Se agrego '" + a + "'");
						}
						else if(a == ']' || a == ')'){
							if(!pila.estaVacia()) {
								if((a == ']' && pila.top() == '[') || (a == ')' && pila.top() == '(')) {
									pila.pop();
									System.out.println("Se quito '" + a + "'");
								}
								else {
									expresionValida = false;
									break;
								}
							}
							else {
								expresionValida = false;
								break;
							}
						}
						else {
							expresionValida = false;
							break;
						}
					}
					if(pila.estaVacia() && expresionValida)
						System.out.println("La expresion ingresada ES correcta\n");
					else
						System.out.println("La expresion ingresada no es correcta\n");
					}
				else {
					System.out.println("No se ingreso ninguna expresion\n");
				}
				pila.vaciarPila();
				break;
				
			case 2:
				sc.close();
				System.exit(0);
				break;
			}
		} while(opcion != 2);
	}
}
