package com.jimmycasta.sgp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "earnings")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EarningsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEarnings;

    @Column(length = 100)
    private String description;

    @Column(columnDefinition = "DATE")
    private LocalDate date;

    @Column(columnDefinition = "DOUBLE")
    private Double earnings;
}
