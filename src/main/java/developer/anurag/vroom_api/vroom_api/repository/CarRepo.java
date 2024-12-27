package developer.anurag.vroom_api.vroom_api.repository;

import developer.anurag.vroom_api.vroom_api.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepo extends JpaRepository<Car,Long> {
}
