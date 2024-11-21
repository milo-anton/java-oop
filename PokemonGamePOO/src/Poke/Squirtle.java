package Poke;

public class Squirtle extends Pokemon implements IAgua{
	
	int puntaje = 0;

	public Squirtle() {
		super();
	}
	

	public int getPuntaje() {
		return puntaje;
	}


	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}



	@Override
	protected void atacarPlacaje() {
		System.out.println("Hola soy squirtle y este es mi ataque Placaje");
		
	}

	@Override
	protected void atacarAraniazo() {
		System.out.println("Hola soy squirtle y este es mi ataque Arañazo");
		
	}

	@Override
	protected void atacarMordisco() {
		System.out.println("Hola soy squirtle y este es mi ataque Mordisco");
		
	}

	@Override
	public void atacarHidrobomba() {
		System.out.println("Hola soy squirtle y este es mi ataque Hidrobomba");
		
	}

	@Override
	public void atacarBurbuja() {
		System.out.println("Hola soy squirtle y este es mi ataque Burbuja");
		
	}

	@Override
	public void atacarPistolaAgua() {
		System.out.println("Hola soy squirtle y este es mi ataque PistolaAgua");
		
	}
	
	public int puntaje() {
		return puntaje;
	}

}
