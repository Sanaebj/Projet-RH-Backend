package com.example.projetrh.Entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
public class Pointage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Employe employe;

    private LocalDate date;

    private LocalTime heureEntree;
    private LocalTime heureSortie;

    private boolean enRetard;


}