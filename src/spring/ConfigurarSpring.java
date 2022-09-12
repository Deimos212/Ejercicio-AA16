package spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("spring") //Le indica en que paquete esta la configuracion (case insensitive?)
@EnableAspectJAutoProxy // Connecta el AOP con el programa
public class ConfigurarSpring {
	
	
	
}
