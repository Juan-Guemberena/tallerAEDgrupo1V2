package util;

import java.util.Random;
import modelo.*;

public class RandomUtils {

	private static Random elementosAleatorios = new Random();
	
	//Metodo que genera un elemento del tipo char de forma aleatoria.
	public static char generarElemento() {
		
		return (char) (97 + elementosAleatorios.nextInt(26));
	}//Fin metodo generarElemento.
	
	//Metodo que genera un numero aleatorio.
	public static int generarNumeroAleatorio() {
		

		return (elementosAleatorios.nextInt(15)+1);
	}//Fin metodo generarNumeroAletorio.

	
	//Sobrecarga de generarNumerosAleatoriios, genera numeros dentro de un rango determinado.
	public static int generarNumeroAleatorio(int rango) {
		
		return elementosAleatorios.nextInt(rango);
	}//Fin metodo generarNumeroAleatorio.
	
	//Carga una cola con la cantidad de elementos del parametro cantElementos.
	public static Box cargarColaRandom(Box caja, int cantElementos) {
		caja = new Box();
		
		for(int i = 0; i < cantElementos; i++)
			caja.enqueue(generarElemento());
		return caja;
	}//Fin metodo cargarColaRandom
}//Fin clase RandomUtils.