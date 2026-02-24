package eugenestellar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;

@SpringBootApplication(exclude = {UserDetailsServiceAutoConfiguration.class}) // to shun a default password from SpringSecurity
public class BackendAuthQuizApplication {
  public static void main(String[] args) {
    SpringApplication.run(BackendAuthQuizApplication.class, args);
  }
}