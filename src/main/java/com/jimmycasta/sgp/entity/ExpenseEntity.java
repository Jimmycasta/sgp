package com.jimmycasta.sgp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "expenses")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExpenseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_expense")
    private int idExpense;

    @Column(length = 100)
    private String description;

    @Column(columnDefinition = "DATE")
    private LocalDate date;

    @Column(columnDefinition = "DOUBLE")
    private Double amount;


    @ManyToOne
    @JoinColumn(name = "id_category", unique = false)
    private CategoryEntity category;
}
