package Poke;

public class Test {

	public static void main(String[] args) {
		
		Squirtle squirtle = new Squirtle();
		Charmander charmander = new Charmander();
		Bulbasaur bulba = new Bulbasaur();
		Pikachu pika = new Pikachu();
		
        //Ingresar los ataques de cada pokemon
		
		bulba.atacarAraniazo();
		charmander.atacarLanzallamas();
		pika.atacarImpactrueno();

        int puntajeCharma = charmander.getPuntaje();
        int puntajeBulba = bulba.getPuntaje();
        int puntajePika = pika.getPuntaje();
        int puntajeSquirtle = squirtle.getPuntaje();
        
        //Puntaje maximo al que deben llegar para ganar la competencia
        int puntajeGanador = 3;
		
        
		boolean empate = puntajeCharma == puntajeBulba || puntajeCharma == puntajePika || puntajeCharma == puntajeSquirtle || puntajeBulba == puntajePika 
		|| puntajeBulba == puntajeSquirtle || puntajePika == puntajeSquirtle;

		System.out.println("-----------");
		System.out.println("EL RESULTADO ES");
		System.out.println("-----------");

		if (puntajeCharma == puntajeGanador) {
			System.out.println("El ganador es charmander");
		} else if (puntajeBulba == puntajeGanador) {
			System.out.println("El ganador es bulbasaur");
		} else if (puntajePika == puntajeGanador) {
			System.out.println("El ganador es pikachu");	
		} else if (puntajeSquirtle == puntajeGanador) {
			System.out.println("El ganador es squirtle");	
		} else if (empate) {
			System.out.println("Empate");
		} else {
			System.out.println("Ninguno llego al puntaje necesario para ganar");
		}
		
		

	}

}
