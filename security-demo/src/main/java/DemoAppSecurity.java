import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.example.demo")
@Configuration
@SpringBootApplication
public class DemoAppSecurity {
    public static void main(String[] args) {
        SpringApplication.run(DemoAppSecurity.class,args);
    }
}
