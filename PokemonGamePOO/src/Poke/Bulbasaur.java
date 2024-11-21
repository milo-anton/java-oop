package Poke;

public class Bulbasaur extends Pokemon implements IPlanta{
	
	int puntaje = 0;

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	public Bulbasaur() {
		super();
	}

	@Override
	protected void atacarPlacaje() {
	System.out.println("Hola soy bulbasaur y este es mi ataque Placaje");
	puntaje += 1;
	}

	@Override
	protected void atacarAraniazo() {
		System.out.println("Hola soy bulbasaur y este es mi ataque Arañazo");
		puntaje += 1;
	}

	@Override
	protected void atacarMordisco() {
		System.out.println("Hola soy bulbasaur y este es mi ataque Mordisco");
		puntaje += 1;
	}

	@Override
	public void atacarDrenaje() {
		System.out.println("Hola soy bulbasaur y este es mi ataque Drenaje");
		puntaje += 1;
	}

	@Override
	public void atacarParalizar() {
		System.out.println("Hola soy bulbasaur y este es mi ataque Paralizar");
		puntaje += 1;
	}
	
	public int puntaje() {
		return puntaje;
	}

}
