package com.example.salesianos.demo;

public record AlumnoDTO (
        String name,
        String apellido1,
        String apellido2,
        String telefono,
        String email

        ){

        public static AlumnoDTO of(Alumno alumno){

            if(alumno == null)
                return null;

            return new AlumnoDTO(
                    alumno.getName(),
                    alumno.getApellido1(),
                    alumno.getApellido2(),
                    alumno.getCurso(),
                    alumno.getTelefono()
            );


        }



}



