package tutor.programacion.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class TutorSpring {
	
	@RequestMapping("/")
	String saludar(){
		return "Hola Spring Boot";
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(TutorSpring.class,args);

	}

}
