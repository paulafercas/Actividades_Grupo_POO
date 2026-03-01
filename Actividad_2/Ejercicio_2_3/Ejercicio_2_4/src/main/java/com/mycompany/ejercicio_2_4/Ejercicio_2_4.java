/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_2_4;

/**
 *
 * @author paula
 */
//Importamos la librería para poder tener una entrada de teclado
import java.util.Scanner;

public class Ejercicio_2_4 {

    public static void main(String[] args) {
        //Creamos los atributos de cada objeto
        //Para el circulo
        int radio;
        
        //Para el rectangulo
        int baseRectangulo;
        int alturaRectangulo;
        
        //Para el cuadrado
        int ladoCuadrado;
        
        //Para el trianguloRectangulo
        int baseTriangulo;
        int alturaTriangulo;
        
        //Para el rombo
        int diagonalMayor;
        int diagonalMenor;
        int ladoRombo;
        
        //Para el trapecio
        int baseMayor;
        int baseMenor;
        int ladoTrapecio;
        int alturaTrapecio;
        
        //Solicitamos al usuario los valores para los atributos
        //Pedimos al usuario que ingrese los valores iniciales de cada atributo
        Scanner datos_entrada_teclado = new Scanner(System.in);
        
        System.out.println ("Ingrese el radio del circulo en cm : ");
        radio = datos_entrada_teclado.nextInt();
        
        System.out.println ("Ingrese la base del rectangulo en cm  : ");
        baseRectangulo = datos_entrada_teclado.nextInt();
        
        System.out.println ("Ingrese la altura del rectangulo en cm : ");
        alturaRectangulo = datos_entrada_teclado.nextInt();
        
        System.out.println ("Ingrese el lado del cuadrado en cm : ");
        ladoCuadrado = datos_entrada_teclado.nextInt();
        
        System.out.println ("Ingrese la base del triangulo en cm : ");
        baseTriangulo = datos_entrada_teclado.nextInt();
        
        System.out.println ("Ingrese la altura del triangulo en cm : ");
        alturaTriangulo = datos_entrada_teclado.nextInt();
        
        System.out.println ("Ingrese la diagonal mayor del rombo en cm : ");
        diagonalMayor = datos_entrada_teclado.nextInt();
        
        System.out.println ("Ingrese la diagonal menor del rombo en cm : ");
        diagonalMenor = datos_entrada_teclado.nextInt();
        
        System.out.println ("Ingrese el lado del rombo en cm : ");
        ladoRombo = datos_entrada_teclado.nextInt();
        
        System.out.println ("Ingrese la base mayor del trapecio en cm : ");
        baseMayor = datos_entrada_teclado.nextInt();
        
        System.out.println ("Ingrese la base menor del trapecio en cm : ");
        baseMenor = datos_entrada_teclado.nextInt();
        
        System.out.println ("Ingrese el lado del trapecio en cm : ");
        ladoTrapecio = datos_entrada_teclado.nextInt();
        
        System.out.println ("Ingrese la altura del trapecio en cm : ");
        alturaTrapecio = datos_entrada_teclado.nextInt();
        
        Circulo figura1 = new Circulo(radio);
        Rectangulo figura2 = new Rectangulo(baseRectangulo,alturaRectangulo);
        Cuadrado figura3 = new Cuadrado(ladoCuadrado);
        TrianguloRectangulo figura4 = new TrianguloRectangulo(baseTriangulo,alturaTriangulo);
        Rombo figura5 = new Rombo(diagonalMayor, diagonalMenor, ladoRombo);
        Trapecio figura6 = new Trapecio (baseMayor, baseMenor, ladoTrapecio, alturaTrapecio);
        
        System.out.println("El área del círculo es = " + figura1.calcularArea()+ " cm^2");
        System.out.println("El perímetro del círculo es = " + figura1.calcularPerímetro()+ " cm");
        System.out.println();
        
        System.out.println("El área del rectángulo es = " + figura2.calcularArea()+ " cm^2");
        System.out.println("El perímetro del rectángulo es = " + figura2.calcularPerímetro()+ " cm");
        System.out.println();
        
        System.out.println("El área del cuadrado es = " + figura3.calcularArea()+ " cm^2");
        System.out.println("El perímetro del cuadrado es = " + figura3.calcularPerímetro()+ " cm");
        System.out.println();
        
        System.out.println("El área del triángulo es = " + figura4.calcularArea()+ " cm^2");
        System.out.println("El perímetro del triángulo es = " + figura4.calcularPerímetro()+ " cm");
        System.out.println();
        
        
        figura4.determinarTipoTriangulo();
        System.out.println();
        
        System.out.println("El area del rombo es = "+ figura5.calcularAreaRombo()+ " cm^2");
        System.out.println("El perimetro del rombo es = "+ figura5.calcularPerimetroRombo()+ " cm");
        System.out.println();
        
        System.out.println("El area del trapecio es = "+ figura6.calcularAreaTrapecio()+ " cm^2");
        System.out.println("El perimetro del trapecio es = "+ figura6.calcularPerimetroTrapecio()+ " cm");
        System.out.println();
        
    }
}
