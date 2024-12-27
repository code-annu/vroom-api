package developer.anurag.vroom_api.vroom_api.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CarDetails")
public class Car {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String brand;
    private String price;
    private String imageUri;

    public Car() {
    }

    public Car(String name, String brand, String price, String imageUri) {
        this.imageUri = imageUri;
        this.price = price;
        this.brand = brand;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String  getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImageUri() {
        return imageUri;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }
}
