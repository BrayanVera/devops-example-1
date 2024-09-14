package es.upm.miw.iwvg_devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class}) // Not API: /error
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);// mvnw clean spring-boot:run
    }

    private String pruebas1(String prueba){
        return prueba;
    }
    private String pruebas2(String prueba){
        return prueba;
    }
    private String prueba3(String prueba){
        return prueba;
    }
}
