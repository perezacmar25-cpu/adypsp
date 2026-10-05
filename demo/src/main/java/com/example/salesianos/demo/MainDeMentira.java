package com.example.salesianos.demo;


import com.example.salesianos.demo.Alumno;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class MainDeMentira {

    @PostConstruct
    public void main(Alumno a) {

                Alumno.builder()
                .name(a.getName())
                .apellido1(a.getApellido1())
                .apellido2(a.getApellido2())
                        .email(a.getEmail())
                        .curso(a.getCurso())
                        .telefono(a.getTelefono())
                        .direccion(a.getDireccion())
                        .build();


    }

}
