package Poke;

public class Pikachu extends Pokemon implements IElectrico{
	
	int puntaje = 0;

	public Pikachu() {
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
		System.out.println("Hola soy pikachu y este es mi ataque Placaje");
		
	}

	@Override
	protected void atacarAraniazo() {
		System.out.println("Hola soy pikachu y este es mi ataque Arañazo");
		
	}

	@Override
	protected void atacarMordisco() {
		System.out.println("Hola soy pikachu y este es mi ataque Mordisco");
		
	}

	@Override
	public void atacarImpactrueno() {
		System.out.println("Hola soy pikachu y este es mi ataque ImpacTrueno");
		
	}

	@Override
	public void atacarPunioTrueno() {
		System.out.println("Hola soy pikachu y este es mi ataque Puño Trueno");
		
	}
	
	public int puntaje() {
		return puntaje;
	}

}
