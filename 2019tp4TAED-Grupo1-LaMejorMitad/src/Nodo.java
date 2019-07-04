public class Nodo {

	private Elemento elemento;
	private Nodo sig; 
	
	//Constructor con 2 argumentos.
	public Nodo(char tipo, int monto) {
		elemento = new Elemento(tipo, monto);
		this.sig = null;
	}//Fin constructor.
	
	public Nodo() {
		elemento = new Elemento(' ', 0);
		this.sig = null;
	}

	public Elemento getElemento() {
		return elemento;
	}
	
	public void setElemento(Elemento elemento) {
		this.elemento = elemento;
	}
	
	//Obtiene el nodo siguiente.
	public Nodo getSig() {
		return sig;
	}//Fin metodo getSig.
	
	//Establece el nodo siguiente.
	public void setSig(Nodo sig) {
		this.sig = sig;
	}//Fin metodo setSig.
	
}//Fin clase Nodo.
