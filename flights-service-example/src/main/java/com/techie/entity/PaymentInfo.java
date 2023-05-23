package com.techie.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.EntityGraph;

import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PaymentInfo {
    private Long pId;
    private String name;
    private String email;
    private String source;
    private String Destination;
    private Date travelDate;
    private String pickUpTime;
    private String arrivalTime;
    private double fare;
}
