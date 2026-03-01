/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_2_4;

/**
 *
 * @author paula
 */
public class Rectangulo {
    int base; // Atributo que define la base de un rectángulo
    int altura; // Atributo que define la altura de un rectángulo
    /**
    * Constructor de la clase Rectangulo
    */
    Rectangulo(int base, int altura) {
    this.base = base;
    this.altura = altura;
    }
    /**
    * Método que calcula y devuelve el área de un rectángulo
    */
    double calcularArea() {
        return base * altura;
    }
    /**
    * Método que calcula y devuelve el perímetro de un rectángulo
    */
    double calcularPerímetro() {
        return (2 * base) + (2 * altura);
    }
}
