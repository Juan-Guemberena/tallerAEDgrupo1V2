public class Elemento {
	
	private char tipo;
	private int monto;
	
	public Elemento(char tipo, int monto) {
		this.tipo = tipo;
		this.monto = monto;
	}

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	public int getMonto() {
		return monto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}
}
