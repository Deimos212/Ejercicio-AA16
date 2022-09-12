package spring;

import java.nio.file.Files;
import java.nio.file.Path;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aspectos {
	
	@Before("execution(* generarTxt())")
	public void log1() {
		System.out.println("\nSe va a generar un nuevo archivo a partir de los 4 suministrados");
	}
	
	@Before("execution(* generarTxt())")
	public void log2() {
		boolean exists = Files.exists(Path.of("Canciones 2020.txt"));
		if (exists) {
			System.out.println("\nEl archivo es válido");
		} else {
			System.out.println("\nEl archivo no es válido");
		}
	}
	
	@After("execution(* generarTxt())")
	public void log3() {
		System.out.println("\nSe ha terminado de generar el archivo");
	}
	
}
