package com.example.salesianos.demo;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Alumno {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String apellido1;
    private String apellido2;
    private String telefono;
    private String email;
    private String direccion;
    private String curso;



}
