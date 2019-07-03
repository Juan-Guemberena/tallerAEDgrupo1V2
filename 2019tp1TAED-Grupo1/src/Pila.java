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

public class Pila {
	
	private Nodo tope;
	
	public Pila() {
		tope = null;
	}
	
	public boolean push(Nodo dato) {
		if(estaVacia()) {
			tope = dato;
			return true;
		}
		else
		{
			dato.setSiguiente(tope);
			tope = dato;
			return true;
		}
	}
	
	public boolean pop() {
		if(!estaVacia()) {
			tope = tope.getSiguiente();
			return true;
		}
		else
			return false;
	}
	
	public char top() {
		if(!estaVacia())
			return tope.getDato();
		else
			return ' ';
	}
	
	public boolean estaVacia() {
		if(tope == null)
			return true;
		else
			return false;
	}
	
	public void vaciarPila() {
		tope = null;
	}
	
}