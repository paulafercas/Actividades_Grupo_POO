/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_2_4;

/**
 *
 * @author paula
 */
public class Rombo {
    //creamoms las variables que definen un rombo
    int diagonalMayor;
    int diagonalMenor;
    int ladoRombo;
    
    /*
    Constructor de la clase Rombo
    */
    Rombo (int diagonalMayor, int diagonalMenor, int ladoRombo){
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
        this.ladoRombo = ladoRombo;                
    }
    
    /*
    Metodo para calcular el area del rombo
    */
    double calcularAreaRombo(){
        return (diagonalMayor*diagonalMenor)/2;
    }
    
    /*
    Metodo para calcular el perimetro del rombo
    */
    double calcularPerimetroRombo(){
        return (4*ladoRombo);
    }
}
