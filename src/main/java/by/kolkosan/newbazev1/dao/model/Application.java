package by.kolkosan.newbazev1.dao.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "application")
public class Application extends Ent{

    @Override
    public String toString() {
        return "Application{" +
                "beginningRental=" + beginningRental +
                ", numberOfRentalDays=" + numberOfRentalDays +
                ", comments='" + comments + '\'' +
                '}';
    }

    @Column (name = "the_beginning_rental")
    private Date beginningRental;
    private LocalDate numberOfRentalDays;
    private String comments;

    @ManyToOne
    @JoinColumn(name = "administrator_id")
    private Administrator administrator;

    @ManyToOne
    @JoinColumn(name = "id_car")
    private Car car;

    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client client;

    @Override
    public List<Car> getCar() {
        return null;
    }

}
