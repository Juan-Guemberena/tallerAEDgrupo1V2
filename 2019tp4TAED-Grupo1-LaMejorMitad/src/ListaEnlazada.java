
public class ListaEnlazada { 
		  
	  	private Nodo cabeza; 
	       
	    public void insertarNodo(Nodo dato) 
	    { 
	        if (cabeza == null) { 
	            cabeza = dato; 
	        } 
	        else {
	            Nodo aux = cabeza; 
	            while (aux.getSig() != null) { 
	                aux = aux.getSig(); 
	            } 
	            
	            aux.setSig(dato); 
	        } 

	    } 
	       
	    public void imprimirLista() 
	    { 
	        Nodo aux = cabeza; 
	        System.out.println("Elementos lista enlazada: "); 
	        
	        while (aux != null) { 
	            System.out.println("Tipo: "+aux.getElemento().getTipo()+"\tMonto: "+aux.getElemento().getMonto());  
	            aux = aux.getSig(); 
	        }  
	    } 
	  
	    public boolean borrarNodoPorTipo(char tipo) 
	    {  
	    	boolean hasBorrado = false;
	    	Nodo aux = cabeza;
	        Nodo prev = null;
	    	if(aux == null)
	        	return hasBorrado;
	        else while(aux != null && aux.getElemento().getTipo() == tipo){
	        	cabeza = aux.getSig();
	        	aux = cabeza;
	        	hasBorrado = true;
	        }
	    	prev = cabeza;
	    	aux = prev.getSig();
	        while (aux != null) {  
	            if(aux.getElemento().getTipo() == tipo) {
	            	prev.setSig(aux.getSig());
	            	aux = prev.getSig();
	            	hasBorrado = true;
	            }
	            else {
	            	prev = aux;
	            	aux = aux.getSig();
	            }
	        }
	        
	        return hasBorrado;
	    }
	    
	    public long sumarLista(char tipo) 
	    { 
	        Nodo aux = cabeza;
	        long suma = 0;
	        
	        while (aux != null) { 
	            if(aux.getElemento().getTipo() == tipo)
	            	suma += aux.getElemento().getMonto();
	            aux = aux.getSig();
	        }
	        return suma;
	    }
}
