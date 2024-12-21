package ma.xproce.carproj.mapper;


import ma.xproce.carproj.dao.entities.Car;

import ma.xproce.carproj.dto.CarDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CarMapper {
    private final ModelMapper mapper= new ModelMapper();


    public Car fromCarDtoToCar(CarDTO carDTO){
        return  mapper.map(carDTO,Car.class);
    }
    public CarDTO fromCarToCarDto(Car car){
        return  mapper.map(car,CarDTO.class);
    }
}
