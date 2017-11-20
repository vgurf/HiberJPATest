package Entity;

import Entity.Baker;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "cakes")
@NamedQuery(name = "Cake.getAll", query = "SELECT c from Cake c")

public class Cake {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date bakedDate;
    @Column(name = "price")
    private float cost;
    @Column(name = "calories")
    private int calories;


    public Cake(){}

    public Cake(String name, Date bakedDate, float cost, int calories){
        this.name = name;
        this.bakedDate = bakedDate;
        this.cost = cost;
        this.calories = calories;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBakedDate() {
        return bakedDate;
    }

    public void setBakedDate(Date bakedDate) {
        this.bakedDate = bakedDate;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public String toString(){
        return "Cake: " + name +"\'"+ "baked: " + bakedDate
                + '\''+"price: " + cost + '\''
                +"calories: " + calories;
    }

    public long getId() {
        return id;
    }


}
