package developer.anurag.vroom_api.vroom_api.exceptions;

import org.springframework.stereotype.Component;


public class CarNotFoundException extends RuntimeException{
    public CarNotFoundException(Long id){
        super(String.format("Can't find a car with Id '%s'",id));
    }

    public CarNotFoundException(String name){
        super(String.format("There is no '%s' car.",name));
    }
}
