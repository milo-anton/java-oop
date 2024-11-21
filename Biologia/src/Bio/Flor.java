package Bio;

public class Flor extends Planta{

	
	private String colorPetalos;
	private int cantPetalos;
	private String colorPistilo;
	private String estacion;
	
	
	
	public String getColorPetalos() {
		return colorPetalos;
	}



	public void setColorPetalos(String colorPetalos) {
		this.colorPetalos = colorPetalos;
	}



	public int getCantPetalos() {
		return cantPetalos;
	}



	public void setCantPetalos(int cantPetalos) {
		this.cantPetalos = cantPetalos;
	}



	public String getColorPistilo() {
		return colorPistilo;
	}



	public void setColorPistilo(String colorPistilo) {
		this.colorPistilo = colorPistilo;
	}



	public String getEstacion() {
		return estacion;
	}



	public void setEstacion(String estacion) {
		this.estacion = estacion;
	}



	@Override
	public void decirLoQueSoy() {
		System.out.println("Hola soy una flor");
		
	}
	
	

}
