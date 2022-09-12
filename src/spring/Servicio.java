package spring;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;
import org.springframework.stereotype.Service;

@Service
public class Servicio{

	public void generarTxt() {
		
		// Registro
		System.out.println("\n\tRegistro");
		Scanner inicio = new Scanner(System.in);
		System.out.print("Nombre: ");
		String username = inicio.nextLine();
		System.out.print("Email: ");
		String useremail = inicio.nextLine();
		Usuario user = new Usuario(username, useremail);
		inicio.close();
		System.out.println("Identificado correctamente como " + username +", Email: " + user.getEmail() + ", ID: "+user.getId());


		StringBuilder sb = new StringBuilder("\nTop canciones 2020\nNombre\t|\tVisitas\t|\tRecaudación");
		try {
			Scanner sc = new Scanner(new File("Canciones 2020.txt"),"UTF-8");
			while (sc.hasNext()) {
				String linea = sc.nextLine();
				String [] split = linea.split("%%");
				Cancion cd = new Cancion(split[0].trim(), Integer.parseInt(split[1].replace(".", "")));
				sb.append("\n" + cd.getNombre() + "\t|\t" + cd.getVisitas() + "\t|\t" + cd.getRecaudacion());
			}

			sb.append("\n\nTop canciones 2021\nNombre\t\t\t\tVisitas\t\t\t\tRecaudación");
			Scanner sc2 = new Scanner(new File("Canciones 2021.txt"),"UTF-8");
			while (sc2.hasNext()) {
				String linea = sc2.nextLine();
				String [] split = linea.split("%%");
				Cancion cd = new Cancion(split[0].trim(), Integer.parseInt(split[1].replace(".", "")));
				sb.append("\n" + cd.getNombre() + "\t|\t" + cd.getVisitas() + "\t|\t" + cd.getRecaudacion());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			sb.append("\n\nTop artistas 2020");
			sb.append("\n\nNombre Pila\t\tNombre Artista");
			Scanner sc3 = new Scanner(new File("Artistas 2020.txt"),"UTF-8");
			while (sc3.hasNext()) {
				String linea = sc3.nextLine();
				// El nombre de pila es el mismo que el de artista porque no fueron complimentados y yo no los conozco
				Artista art = new Artista(linea, linea);
				sb.append("\n"+art.getNombrePersona()+"\t\t" + art.getNombreArtista());
			}
			sb.append("\n\nTop artistas 2021");
			Scanner sc4 = new Scanner(new File("Artistas 2021.txt"),"UTF-8");
			while (sc4.hasNext()) {
				String linea = sc4.nextLine();
				// El nombre de pila es el mismo que el de artista porque no fueron complimentados y yo no los conozco
				Artista art = new Artista(linea, linea);
				sb.append("\n"+art.getNombrePersona()+"\t\t" + art.getNombreArtista());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("\nGenerando txt...");
		System.out.println(sb.toString());
		sb.append("\n\nInformacion obtenida para el usuario " + user.getNombre() + ", con email:"+user.getEmail()+" y con ID " + user.getId() + " el " + user.getFechaLogin());

		try {
			Files.write(Paths.get("Resumen 2020-2021.txt"), Arrays.asList(sb.toString()), StandardCharsets.UTF_8);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}
	
}
