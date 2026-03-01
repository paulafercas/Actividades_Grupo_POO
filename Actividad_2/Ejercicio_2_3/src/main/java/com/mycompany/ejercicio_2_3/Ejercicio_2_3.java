/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_2_3;

/**
 *
 * @author paula
 */
import java.util.Scanner;
public class Ejercicio_2_3 {

    public static void main(String[] args) {
        //Creamos los atributos asociados al objeto automovil
        String marca;
        int modelo;
        int motor;
        tipoCom tipoCombustible;
        tipoAuto automovil;
        int numeroPuertas;
        int cantidadAsientos;
        int velocidadMaxima;
        tipoColor color;
        int velocidadActual = 0;
        boolean esAutomatico;
        int numeroMultas =0;
        boolean tieneMultas;
        
        //Pedimos al usuario que ingrese los valores iniciales de cada atributo
        Scanner datos_entrada_teclado = new Scanner(System.in);
        
        System.out.println ("Ingrese la marca : ");
        marca = datos_entrada_teclado.next();
        
        System.out.println ("Ingrese el modelo : ");
        modelo = datos_entrada_teclado.nextInt();
        
        System.out.println ("Ingrese el volumen en litros del cilindraje del motor : ");
        motor = datos_entrada_teclado.nextInt();
        
        System.out.println ("Ingrese el numero de puertas : ");
        numeroPuertas = datos_entrada_teclado.nextInt();
        
        System.out.println ("Ingrese la cantidad de asientos : ");
        cantidadAsientos = datos_entrada_teclado.nextInt();
        
        System.out.println ("Ingrese la velocidad maxima : ");
        velocidadMaxima = datos_entrada_teclado.nextInt();
        
        Automovil Auto1 = new Automovil (marca, modelo, motor, tipoCom.DIESEL, tipoAuto.EJECUTIVO, numeroPuertas, cantidadAsientos, velocidadMaxima, tipoColor.NEGRO, true,false);
        Auto1.imprimir();
        Auto1.setVelocidadActual(100);
        System.out.println("Velocidad actual = " + Auto1.velocidadActual);
        Auto1.acelerar(20);
        System.out.println("Velocidad actual = " + Auto1.velocidadActual);
        Auto1.desacelerar(50);
        System.out.println("Velocidad actual = " + Auto1.velocidadActual);
        Auto1.frenar();
        System.out.println("Velocidad actual = " + Auto1.velocidadActual);
        Auto1.desacelerar(20);
        
        //Para probar que sí se incrementa el numero de multas
        Auto1.acelerar(110);
        Auto1.acelerar(110);
        Auto1.acelerar(110);
        Auto1.acelerar(110);
        
        //Comprobamos si se modificó si tiene multas o no
        Auto1.setTienemultas();
        Auto1.imprimir();
    }
}
