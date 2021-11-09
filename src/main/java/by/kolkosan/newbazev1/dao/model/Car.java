package by.kolkosan.newbazev1.dao.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Blob;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "car")
public class Car extends Ent{

    private String stamp;
    private int code_car;
    private String body_type;
    private String transmission;
    private int numbSeats;
    private String color;
    private String number;
    private int yearRelease;
    @Column(name="foto",columnDefinition = "blob")
    private byte[] foto;
    private BigDecimal costDay;
    private BigDecimal deposit;
    private String comments;


    @OneToMany(mappedBy = "car",fetch = FetchType.EAGER)
    private List<Application> applications;

    @Override
    public String toString() {
        return "Car{" +
                "stamp='" + stamp + '\'' +
                ", code_car=" + code_car +
                ", body_type='" + body_type + '\'' +
                ", transmission='" + transmission + '\'' +
                ", numbSeats=" + numbSeats +
                ", color='" + color + '\'' +
                ", number='" + number + '\'' +
                ", yearRelease=" + yearRelease +
                ", foto=" + Arrays.toString(foto) +
                ", costday=" + costDay +
                ", deposit=" + deposit +
                ", comments='" + comments + '\'' +"\n"+
                '}';
    }
}
