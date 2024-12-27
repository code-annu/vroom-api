package developer.anurag.vroom_api.vroom_api.controller;

import developer.anurag.vroom_api.vroom_api.assemblers.CarModelAssembler;
import developer.anurag.vroom_api.vroom_api.entities.Car;
import developer.anurag.vroom_api.vroom_api.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {
    @Autowired
    private final CarService carService;
    @Autowired
    private final CarModelAssembler carModelAssembler;

    public CarController(CarService carService, CarModelAssembler carModelAssembler) {
        this.carService = carService;
        this.carModelAssembler = carModelAssembler;
    }

    @GetMapping("/all")
    public CollectionModel<EntityModel<Car>> getAllCars(){
        List<EntityModel<Car>> carModels = this.carService.fetchAllCars().stream().map(this.carModelAssembler::toModel).toList();
        return CollectionModel.of(
                carModels,
                WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(CarController.class).getAllCars()).withRel("all")
        );
    }

    @GetMapping("find/{id}")
    public EntityModel<Car> getCarById(@PathVariable(value = "id") Long id){
        Car car = this.carService.fetchCar(id);
        return this.carModelAssembler.toModel(car);
    }

    @PostMapping("/add")
    public EntityModel<Car> addNewCar(@RequestBody Car car){
        return this.carModelAssembler.toModel(this.carService.addNewCar(car));
    }

    @PutMapping("/update")
    public EntityModel<Car> updateCar(@RequestBody Car car){
        return this.carModelAssembler.toModel(this.carService.updateCar(car));
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCar(@PathVariable(value = "id") Long id){
        return this.carService.deleteCar(id);
    }


}
