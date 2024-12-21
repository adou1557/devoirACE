package ma.xproce.carproj.service;

import lombok.AllArgsConstructor;
import ma.xproce.carproj.dao.entities.Car;
import ma.xproce.carproj.dao.repositories.CarRepository;
import ma.xproce.carproj.dto.CarDTO;
import ma.xproce.carproj.mapper.CarMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class CarManager implements CarService {
    @Autowired
    private CarRepository carRepository;
    @Autowired
    private CarMapper carMapper;

    @Override
    public CarDTO saveCar(CarDTO carDTO) {
        Car car = carMapper.fromCarDtoToCar(carDTO);
        car = carRepository.save(car);
        CarDTO savedCarDTO = carMapper.fromCarToCarDto(car);
        return savedCarDTO;
    }

    @Override
    public boolean deleteCar(Long id) {
        try {
            carRepository.deleteById(id);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    @Override
    public List<CarDTO> getCarByModel(String model) {
        List<Car> cars = carRepository.findByModel(model);
        List<CarDTO> carDTOs = new ArrayList<>();
        for (Car car : cars) {
            carDTOs.add(carMapper.fromCarToCarDto(car));
        }
        return carDTOs;
    }

    @Override
    public List<CarDTO> getCarByModelAndPrice(String model, double price) {
        List<Car> cars = carRepository.findByModelAndPrice(model, price);
        List<CarDTO> carDTOs = new ArrayList<>();
        for (Car car : cars) {
            carDTOs.add(carMapper.fromCarToCarDto(car));
        }
        return carDTOs;
    }

    @Override
    public List<CarDTO> saveCars(List<CarDTO> carDTOs) {

        List<Car> cars = new ArrayList<>();
        for (CarDTO carDTO : carDTOs) {
            cars.add(carMapper.fromCarDtoToCar(carDTO));
        }

        cars = carRepository.saveAll(cars);

        carDTOs = new ArrayList<>();
        for (Car car : cars) {
            carDTOs.add(carMapper.fromCarToCarDto(car));
        }
        return carDTOs;
    }



}
