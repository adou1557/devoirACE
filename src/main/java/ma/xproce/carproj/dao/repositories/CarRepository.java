package ma.xproce.carproj.dao.repositories;


import ma.xproce.carproj.dao.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findByModel(String model);

    List<Car> findByModelAndPrice(String model, double price);
}
