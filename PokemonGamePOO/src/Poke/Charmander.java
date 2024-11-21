package Poke;

public class Charmander extends Pokemon implements IFuego{
	
	int puntaje = 0;

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	public Charmander() {
		super();
	}

	@Override
	protected void atacarPlacaje() {
		System.out.println("Hola soy charmander y este es mi ataque Placaje");
		puntaje += 1;
	}

	@Override
	protected void atacarAraniazo() {
		System.out.println("Hola soy charmander y este es mi ataque Arañazo");
		puntaje += 1;
	}

	@Override
	protected void atacarMordisco() {
		System.out.println("Hola soy charmander y este es mi ataque Mordisco");
		puntaje += 1;
	}

	@Override
	public void atacarPunioFuego() {
		System.out.println("Hola soy charmander y este es mi ataque Puño Fuego");
		puntaje += 1;
	}

	@Override
	public void atacarLanzallamas() {
		System.out.println("Hola soy charmander y este es mi ataque Lanzallamas");
		puntaje += 1;
	}

	@Override
	public void atacarAscuas() {
		System.out.println("Hola soy charmander y este es mi ataque Ascuas");
		puntaje += 1;
	}
	
	public int puntaje() {
		return puntaje;
	}

}
