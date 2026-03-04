/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio21;
import java.util.Scanner;
public class Ejercicio21 { 
    public static void main(String[] args) {
        String nombre;
        String apellidos;
        String DocumentoIdentidad;
        int añoNacimiento;
        String Nacionalidad;
        char genero;
        
        //Pedimos al usuario que ingrese los valores iniciales de cada atributo
        Scanner datos_entrada_teclado = new Scanner(System.in);
        
        System.out.println ("Ingrese el nombre de la persona 1 : ");
        nombre = datos_entrada_teclado.next();
        
        System.out.println ("Ingrese los apellidos de la persona 1 : ");
        apellidos = datos_entrada_teclado.next();
        
        System.out.println ("Ingrese el documento de identidad de la persona 1 : ");
        DocumentoIdentidad = datos_entrada_teclado.next();
        
        System.out.println ("Ingrese el año de nacimiento de la persona 1 : ");
        añoNacimiento = datos_entrada_teclado.nextInt();
        
        System.out.println ("Ingrese La nacionalidad de la persona 1 : ");
        Nacionalidad = datos_entrada_teclado.next();
        
        System.out.println ("Ingrese el genero de la persona 1 : ");
        genero = datos_entrada_teclado.next().charAt(0);
        
        Persona p1 = new Persona(nombre, apellidos, DocumentoIdentidad, añoNacimiento, Nacionalidad, genero);
        
        System.out.println ("******************************");
        
        System.out.println ("Ingrese el nombre de la persona 2 : ");
        nombre = datos_entrada_teclado.next();
        
        System.out.println ("Ingrese los apellidos de la persona 2 : ");
        apellidos = datos_entrada_teclado.next();
        
        System.out.println ("Ingrese el documento de identidad de la persona 2 : ");
        DocumentoIdentidad = datos_entrada_teclado.next();
        
        System.out.println ("Ingrese el año de nacimiento de la persona 2 : ");
        añoNacimiento = datos_entrada_teclado.nextInt();
        
        System.out.println ("Ingrese La nacionalidad de la persona 2 : ");
        Nacionalidad = datos_entrada_teclado.next();
        
        System.out.println ("Ingrese el genero de la persona 2 : ");
        genero = datos_entrada_teclado.next().charAt(0);
        
        Persona p2 = new Persona(nombre, apellidos, DocumentoIdentidad, añoNacimiento, Nacionalidad, genero);
        p1.imprimir();
        p2.imprimir();
    }
}
