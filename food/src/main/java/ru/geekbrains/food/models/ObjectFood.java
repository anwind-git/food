package ru.geekbrains.food.models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ObjectFood {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int category;
    private String image;
    private String name;
    private String description;
    private String compound;
    private int weight;
    private int price;

    public ObjectFood() {
    }

    public ObjectFood(int category, String image, String name, String description, String compound, int weight, int price) {
        this.category = category;
        this.image = image;
        this.name = name;
        this.description = description;
        this.compound = compound;
        this.weight = weight;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public int getCategory() {
        return category;
    }

    public String getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getCompound() {
        return compound;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCompound(String compound) {
        this.compound = compound;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
