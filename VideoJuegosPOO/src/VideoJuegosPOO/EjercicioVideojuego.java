package VideoJuegosPOO;

import java.util.List;
import java.util.ArrayList;

import ejerciciovideojuegos.logica.VideoJuego;

public class EjercicioVideojuego {

	public static void main(String[] args) {
		
		List <VideoJuego> listaVideoJuegos = new ArrayList<VideoJuego>();
		
		VideoJuego video1 = new VideoJuego (123, "Banjo Kazooie", "Nintendo 64", 4, "Plataforma");
		VideoJuego video2 = new VideoJuego (12, "Mario Party 4", "Nintendo 64", 4, "Plataforma");
		VideoJuego video3 = new VideoJuego (42, "Age of Empires", "PC", 1, "Estrategia");
		VideoJuego video4 = new VideoJuego (23, "Sims", "PC", 1, "Plataforma");
		VideoJuego video5 = new VideoJuego (543, "Mario Kart", "Nintendo 64", 2, "Plataforma");
		
		listaVideoJuegos.add(video1);
		listaVideoJuegos.add(video2);
		listaVideoJuegos.add(video3);
		listaVideoJuegos.add(video4);
		listaVideoJuegos.add(video5);
		
		for (VideoJuego video : listaVideoJuegos) {
			System.out.println("Titulo: " + video.getTitulo() + ". Consola: " + video.getConsola() + ". Cantidad de jugadores: " + video.getCantJugadores());
		}
		
		System.out.println("----------------");
		
		video1.setTitulo("Banjo Kazooie 2");
		video1.setCantJugadores(2);
		
		video2.setTitulo("Mario Party 2");
		video2.setCantJugadores(2);
		
		for (VideoJuego video : listaVideoJuegos) {
			if (video.getConsola().equals("Nintendo 64")) {
				
			System.out.println(video.toString());
			
			}
			
			
		}
		
		
	}

}
