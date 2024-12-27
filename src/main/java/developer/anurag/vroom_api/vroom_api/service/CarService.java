package developer.anurag.vroom_api.vroom_api.service;

import developer.anurag.vroom_api.vroom_api.entities.Car;
import developer.anurag.vroom_api.vroom_api.exceptions.CarNotFoundException;
import developer.anurag.vroom_api.vroom_api.repository.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    @Autowired
    final private CarRepo carRepo;

    public CarService(CarRepo carRepo) {
        this.carRepo = carRepo;
    }

    public Car addNewCar(Car car) {
        return this.carRepo.save(car);
    }

    public List<Car> fetchAllCars() {
        return this.carRepo.findAll();
    }

    public Car fetchCar(Long id) {
        return this.carRepo.findById(id).orElseThrow(() -> new CarNotFoundException(id));
    }

    public String deleteCar(Long id){
        this.carRepo.deleteById(id);
        return "Car deleted successfully.";
    }

    public Car updateCar(Car car){
        return this.carRepo.save(car);
    }


}
