package docker.demo.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ContainerizingSpringBootApplication {

    @GetMapping("/message")
    public String getMessage() {
        return "test message from containerized docker spring boot application";
    }

    public static void main(String[] args) {
        SpringApplication.run(ContainerizingSpringBootApplication.class, args);
    }

}
