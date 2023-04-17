package mx.com.qualitrain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("mx.com.qualitrain")
public class ServidorAjaxCursoAngularApplication {

	public static void main(String[] args) {
		System.out.println("ServidorAjaxCursoAngularApplication.main()");
		SpringApplication.run(ServidorAjaxCursoAngularApplication.class, args);
	}

}
