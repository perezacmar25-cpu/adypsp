package com.example.salesianos.demo;


import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Producto {

    @Id @GeneratedValue
    private Long id;
    private String nombre;

    private String desc;

    private Double pvp;


    @ManyToOne
    private Categoria categoria;

    @Builder.Default
    private List<String> imagenes = new ArrayList<>();



}