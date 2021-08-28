package ponyExpress;

public class PonyExpress {

	private final static int DISTANCIA_MAXIMA = 100;
	
	/**
	 * @param distancias es la distancia en millas de una estación hasta la otra
	 * @returns la cantidad de caballos necesarios para enviar el correo desde un
	 * extremo hasta el otro del recorrido
	 */ 
	
	public int caballos(int[] distancias) { 
		
		int distRecCaballo = 0; //contabiliza distancia recorrida por caballo
		int cantCaballos = 1; //caballos utilizados en cada recorrido
		
		for(int i = 0; i < distancias.length; i++) {
			distRecCaballo += distancias[i]; 
			if (distRecCaballo > DISTANCIA_MAXIMA) { 
				distRecCaballo = distancias[i];
				cantCaballos++;
				
			}
		}
		return cantCaballos;
		
	}
}
