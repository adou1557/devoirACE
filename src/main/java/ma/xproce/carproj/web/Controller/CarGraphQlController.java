package ma.xproce.carproj.web.Controller;

import lombok.AllArgsConstructor;
import ma.xproce.carproj.dto.CarDTO;
import ma.xproce.carproj.service.CarService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class CarGraphQlController {
    private CarService carService ;

    @MutationMapping
    public CarDTO saveCar(@Argument CarDTO car){
        return carService.saveCar(car);
    }

    @MutationMapping
    public Boolean deleteCar(@Argument Long id){
        return carService.deleteCar(id);
    }


    @QueryMapping
    public List<CarDTO> getCarByModel(@Argument String model){
        return carService.getCarByModel(model);
    }

    @QueryMapping
    public List<CarDTO> getCarByModelAndPrice(@Argument String model, @Argument double price){
        return carService.getCarByModelAndPrice(model, price);
    }
}
