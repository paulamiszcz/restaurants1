package pl.javastart.dobrex.ingredient;

import javax.persistence.*;

@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private double price;
    @Enumerated(EnumType.STRING)
    private Sensitizing isSensitizing;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Sensitizing getIsSensitizing() {
        return isSensitizing;
    }

    public void setIsSensitizing(Sensitizing isSensitizing) {
        this.isSensitizing = isSensitizing;
    }
}
