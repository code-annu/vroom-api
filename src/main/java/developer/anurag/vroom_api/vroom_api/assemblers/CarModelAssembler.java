package developer.anurag.vroom_api.vroom_api.assemblers;

import developer.anurag.vroom_api.vroom_api.controller.CarController;
import developer.anurag.vroom_api.vroom_api.entities.Car;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
public class CarModelAssembler implements RepresentationModelAssembler<Car, EntityModel<Car>> {
    @Override
    @NonNull
    public EntityModel<Car> toModel(@NonNull Car car) {
        return EntityModel.of(car,
                WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(CarController.class).getCarById(car.getId())).withSelfRel(),
                WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(CarController.class).getAllCars()).withRel("all")
        );
    }
}
