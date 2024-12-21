package ma.xproce.carproj.service;

import ma.xproce.carproj.dto.CarDTO;

import java.util.List;


public interface CarService {
    public CarDTO saveCar(CarDTO carDTO);

    public boolean deleteCar(Long id);

    public List<CarDTO> getCarByModel(String model);

    public List<CarDTO> getCarByModelAndPrice(String model, double price);

    public List<CarDTO> saveCars(List<CarDTO> carDTOs);

}
