package modelo;

public class Box {

	private Nodo primero;
	private Nodo ultimo;
	private int size;

	  public Box() {
	    ultimo = null;
	    size = 0;
	  }

	  public void enqueue(Object dato) {
		  
	    Nodo nodoNuevo = new Nodo(dato);
	    
	    if (primero == null) {
	      primero = nodoNuevo;
	      ultimo = nodoNuevo;
	    } else {
	      ultimo.setSig(nodoNuevo);
	      ultimo = nodoNuevo;
	    }
	    size++;
	  }; // inserts an object onto the queue

	  public Object dequeue() {
		  
	    if (primero == null)
	      return null;
	    
	    Object o = primero.getDato();
	    primero = primero.getSig();
	    size--;
	    return o;
	  } // gets the object from the queue

	  public boolean isEmpty() {
	    return (size == 0);
	  }

	  public int size() {
	    return size;
	  }

	  public Object primero() {
	    if (primero == null)
	      return null;
	    else
	      return primero.getDato();
	  }
	  
	  public void listar() {
		  Nodo aux = new Nodo();
		  aux = this.primero;
		  do{
		  System.out.print(aux.getDato());
		  aux = aux.getSig();
		  }while (aux != null);		  
	  }
}//Fin clase Box
