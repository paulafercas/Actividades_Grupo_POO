/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2_5;

/**
 *
 * @author paula
 */
import java.util.Scanner;
public class Ejercicio2_5 {

    public static void main(String[] args) {
        // Atributo que define los nombres del titular de la cuenta bancaria
        String nombresTitular;
        // Atributo que define los apellidos del titular de la cuenta bancaria
        String apellidosTitular;
        // Atributo que define el número de la cuenta bancaria
        int númeroCuenta;
        // Atributo que define el tipo de cuenta bancaria
        tipo tipoCuenta;
        /* Atributo que define el saldo de la cuenta bancaria con valor inicial
        cero */
        float saldo = 0;
        //Atributo que define la tasa de interes
        float tasaInteres;
        
        //Pedimos al usuario que ingrese los valores iniciales de cada atributo
        Scanner datos_entrada_teclado = new Scanner(System.in);
        
        System.out.println ("Ingrese los nombres del titular : ");
        nombresTitular = datos_entrada_teclado.next();
        
        System.out.println ("Ingrese los apellidos del titular : ");
        apellidosTitular = datos_entrada_teclado.next();
        
        System.out.println ("Ingrese el numero de cuenta : ");
        númeroCuenta = datos_entrada_teclado.nextInt();
        
        System.out.println ("Ingrese la tasa de interes en porcentaje: ");
        tasaInteres = datos_entrada_teclado.nextFloat();
      
        
        //Llamamos al constructor
        CuentaBancaria cuenta = new CuentaBancaria(nombresTitular,apellidosTitular, númeroCuenta,tipo.AHORROS,tasaInteres);
        cuenta.imprimir();
        cuenta.consignar(200000);
        cuenta.consignar(300000);
        cuenta.retirar(400000);
        //Probamos el metodo de la tasa de interes
        cuenta.aplicarTasaInteres();
        //Imprimimos nuevamente
        cuenta.imprimir();
    }
    
}
