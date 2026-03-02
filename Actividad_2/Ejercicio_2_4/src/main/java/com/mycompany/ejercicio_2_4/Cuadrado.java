/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_2_4;

/**
 *
 * @author paula
 */
public class Cuadrado {
    int lado; // Atributo que define el lado de un cuadrado
    /**
    * Constructor de la clase Cuadrado
    */
    public Cuadrado(int lado) {
        this.lado = lado;
    }
    /**
    * Método que calcula y devuelve el área de un cuadrado
    */
    double calcularArea() {
        return lado*lado;
    }
    /**
    * Método que calcula y devuelve el perímetro de un cuadrado
    */
    double calcularPerímetro() {
        return (4*lado);
    }
}
