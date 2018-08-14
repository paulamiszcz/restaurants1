package pl.javastart.dobrex.courier;

import javax.persistence.*;

@Entity
public class Courier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String transportation;
    private double prizePerKm;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTransportation() {
        return transportation;
    }

    public void setTransportation(String transportation) {
        this.transportation = transportation;
    }

    public double getPrizePerKm() {
        return prizePerKm;
    }

    public void setPrizePerKm(double prizePerKm) {
        this.prizePerKm = prizePerKm;
    }


}
