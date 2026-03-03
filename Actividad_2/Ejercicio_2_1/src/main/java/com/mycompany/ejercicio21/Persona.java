
package com.mycompany.ejercicio21;

public final class Persona {
    String nombre;
    String apellidos;
    String DocumentoIdentidad;
    int añoNacimiento;
    String Nacionalidad;
    char genero;
    
    
    Persona(String nombre, String apellidos, String DocumentoIdentidad, int añoNacimiento, String Nacionalidad, char genero) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DocumentoIdentidad = DocumentoIdentidad;
        this.añoNacimiento = añoNacimiento;
        this.Nacionalidad = Nacionalidad;
        setGenero(genero);
        
    }
    
    public void setGenero(char genero){
        char generoMayus = Character.toUpperCase(genero);
        
        if (generoMayus == 'H' || generoMayus == 'M'){
            this.genero = generoMayus;
        }
        else{
            throw new IllegalArgumentException("Genero no valido. Use 'H' o 'M'.");
        }
    }
    void imprimir(){
        System.out.println("Nombre = " + nombre);
        System.out.println("Apellidos = " + apellidos);
        System.out.println("Número de documento de identidad = " + DocumentoIdentidad);
        System.out.println("Año de nacimiento = " + añoNacimiento);
        System.out.println("Nacionalidad : " + Nacionalidad);
        System.out.println("Género : " + genero);
        System.out.println();
    
    }
}
