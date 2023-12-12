package com.tobeto.pair6.rentACar.entities;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Table(name = "invoices")
@Entity
@Getter
@Setter
public class Invoice {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "create_date", columnDefinition = "DATE")
    private Date createDate;

    @ManyToOne
    @JoinColumn(name = "rental_id")
    private Rental rental;
}
