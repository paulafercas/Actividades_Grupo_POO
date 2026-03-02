/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_2_4;

/**
 *
 * @author paula
 */
public class Trapecio {
    //Definimos los atributos del trapecio
    int baseMayor;
    int baseMenor;
    int ladoTrapecio;
    int alturaTrapecio;
    
    /*
    Creamos el constructor para la clase Trapecio
    */
    Trapecio (int baseMayor, int baseMenor, int ladoTrapecio, int alturaTrapecio){
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.ladoTrapecio = ladoTrapecio;
        this.alturaTrapecio = alturaTrapecio;
    }
    
    /*
    Creamos el metodo para calcular el area del trapecio
    */
    double calcularAreaTrapecio (){
        return (baseMayor+baseMenor)*alturaTrapecio/2;
    }
    
    /*
    Creamos el metodo para calcular el perimetro del trapecio
    */
    double calcularPerimetroTrapecio(){
        return (2*ladoTrapecio)+ baseMayor + baseMenor;
    }
   
    
}
