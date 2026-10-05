package com.example.salesianos.demo;

public record AlumnoDTO (
        String name,
                         String apellido1,
                         String apellido2,
                         String telefono
){

public static AlumnoDTO of(Alumno a){

    if(a == null){
        return null;
    }
    return new AlumnoDTO(
            a.getName(),
            a.getApellido1(),
            a.getApellido2(),
            a.getCurso()
    );
}


}
