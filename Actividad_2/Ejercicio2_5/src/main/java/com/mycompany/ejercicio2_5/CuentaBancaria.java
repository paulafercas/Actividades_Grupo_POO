/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2_5;

/**
 *
 * @author paula
 */
public class CuentaBancaria {
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
    /**
    * Constructor de la clase CuentaBancaria
    * /**
    * 
    */
    CuentaBancaria(String nombresTitular, String apellidosTitular, int numeroCuenta, tipo tipoCuenta, float tasaInteres) {
        /* Tener en cuenta que no se pasa como parámetro el saldo ya
        que inicialmente es cero. */
        this.nombresTitular = nombresTitular;
        this.apellidosTitular = apellidosTitular;
        this.númeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.tasaInteres = tasaInteres;
    }
    
    /**
    * Método que imprime en pantalla los datos de una cuenta bancaria
    */
    void imprimir() {
        System.out.println("Nombres del titular = " + nombresTitular);
        System.out.println("Apellidos del titular = " + apellidosTitular);
        System.out.println("Número de cuenta = " + númeroCuenta);
        System.out.println("Tipo de cuenta = " + tipoCuenta);
        System.out.println("Saldo = " + saldo);
    }
    /**
    * Método que imprime en pantalla el saldo actual de una cuenta
    * bancaria
    */
    void consultarSaldo() {
        System.out.println("El saldo actual es = " + saldo);
    }
    
    boolean consignar(int valor) {
        // El valor a consignar debe ser mayor que cero
        if (valor > 0) {
        saldo = saldo + valor; /* Se actualiza el saldo de la cuenta con
        el valor consignado */
        System.out.println("Se ha consignado $" + valor + " en la cuenta. El nuevo saldo es $" + saldo);
        return true;
        } else {
        System.out.println("El valor a consignar debe ser mayor que cero.");
            return false;
            }
    }
    
    boolean retirar(int valor) {
        /* El valor debe ser mayor que cero y no debe superar el saldo
        actual */
        if ((valor > 0) && (valor <= saldo)) {
        saldo = saldo - valor; /* Se actualiza el saldo de la cuenta con
        el valor retirado */
            System.out.println("Se ha retirado $" + valor + " en la cuenta. El nuevo saldo es $" + saldo);
            return true;
        } else {
        System.out.println("El valor a retirar debe ser menor que el saldo actual.");
            return false;
            }
    }
    
    //Metodo para actualizar el saldo con la nueva tasa de interes
    void aplicarTasaInteres (){
        float nuevoSaldo = saldo * (1+ tasaInteres/100);
        this.saldo = nuevoSaldo;
    }
}
