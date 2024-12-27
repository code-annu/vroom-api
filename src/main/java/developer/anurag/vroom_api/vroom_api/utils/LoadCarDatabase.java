package developer.anurag.vroom_api.vroom_api.utils;

import developer.anurag.vroom_api.vroom_api.entities.Car;
import developer.anurag.vroom_api.vroom_api.repository.CarRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class LoadCarDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadCarDatabase.class);

    @Bean
    CommandLineRunner initCarDatabase(CarRepo carRepo) {
        return args -> {
            log.info("Preloading: " + carRepo.save(new Car("Audi RS5", "Audi", "₹ 1.13 Cr", "https://stimg.cardekho.com/images/carexteriorimages/930x620/Audi/RS5/10563/1708936100481/front-left-side-47.jpg")));
            log.info("Preloading: " + carRepo.save(new Car("Audi e-tron GT", "Audi", "₹ 1.72 Cr", "https://stimg.cardekho.com/images/carexteriorimages/930x620/Audi/e-tron-GT/8340/1678098767884/front-left-side-47.jpg")));
            log.info("Preloading: " + carRepo.save(new Car("Audi RS e-tron GT", "Audi", "₹ 1.95 Cr", "https://stimg.cardekho.com/images/carexteriorimages/930x620/Audi/RS-e-tron-GT/8607/1632310533051/front-left-side-47.jpg")));
            log.info("Preloading: " + carRepo.save(new Car("Bentley Continental", "Bentley", "₹ 5.23 Cr", "https://stimg.cardekho.com/images/carexteriorimages/930x620/Bentley/Continental/7771/1708637147871/front-left-side-47.jpg")));
            log.info("Preloading: " + carRepo.save(new Car("Bentley Flying Spur", "Bentley", "₹ 5.25 Cr", "https://stimg.cardekho.com/images/carexteriorimages/930x620/Bentley/Flying-Spur/11205/1695731100809/front-left-side-47.jpg")));
            log.info("Preloading: " + carRepo.save(new Car("Rolls-Royce Ghost", "Rolls-Royce", "₹ 6.95 Cr", "https://stimg.cardekho.com/images/carexteriorimages/930x620/Rolls-Royce/Ghost/8051/1601280317407/front-left-side-47.jpg")));
            log.info("Preloading: " + carRepo.save(new Car("Rolls-Royce Phantom", "Rolls-Royce", "₹ 8.99 Cr", "https://stimg.cardekho.com/images/carexteriorimages/930x620/Rolls-Royce/Rolls-Royce-Phantom/7783/1587206758888/front-left-side-47.jpg")));
        };
    }

}
