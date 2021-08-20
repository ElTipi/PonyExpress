package ponyExpress;

public class PonyExpress {

	
	public PonyExpress() {
	}
	
	
	/**
	 * @param distancias es la distancia en millas de una estación hasta la otra
	 * @returns la cantidad de caballos necesarios para enviar el correo desde un
	 * extremo hasta el otro del recorrido
	 */ 
	
	public int caballos(int[] distancias) { 
		
		int distCaballo = 0; //contabiliza distancia recorrida por caballo
		int cantCaballos = 1; //caballos utilizados en cada recorrido
		
		for(int i = 0; i < distancias.length; i++) {
			distCaballo += distancias[i]; 
			if (distCaballo > 100) { 
				cantCaballos++;
				distCaballo = distancias[i];
			}
		}
		return cantCaballos;
	}
}
