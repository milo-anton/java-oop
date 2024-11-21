package Poke;

// clase abstracta para atributos y metodos, las otras clases heredan esto. no se puede instanciar

public abstract class Pokemon {
	
	// atributos
	protected int numPokedex;
	protected String nombre;
	protected double peso;
	protected String sexo;
	protected int temporada;
	
	// metodos	
	protected abstract void atacarPlacaje();
	protected abstract void atacarAraniazo();
	protected abstract void atacarMordisco();


}
