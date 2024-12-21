package ma.xproce.carproj;

import ma.xproce.carproj.dto.CarDTO;
import ma.xproce.carproj.service.CarService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CarProjApplication {
    public static void main(String[] args) {
        SpringApplication.run(CarProjApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CarService carService) {
        final CommandLineRunner commandLineRunner = args -> carService.saveCars(
                List.of(
                        new CarDTO("Toyotan Camry", "Silvner", "ABnC123", 25000.0),
                        new CarDTO("model2", "green", "ef56e+6", 656189.0),
                        new CarDTO("model3", "yellow", "ef64wfe8", 89789.2),
                        new CarDTO("model4", "black", "wrdqw6qw", 67489.1)
                )
        );
        return commandLineRunner;
    }
}
