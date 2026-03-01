/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_2_4;

/**
 *
 * @author paula
 */
public class Circulo {
    int radio; // Atributo que define el radio de un círculo
    /**
    * Constructor de la clase Círculo
    */
    Circulo(int radio) {
        this.radio = radio;
    }
    /**
    * Método que calcula y devuelve el área de un círculo 
    */
    double calcularArea() {
        return Math.PI*Math.pow(radio,2);
    }
    /**
    * Método que calcula y devuelve el perímetro de un circulo
    */
    double calcularPerímetro() {
        return 2*Math.PI*radio;
    }
}
