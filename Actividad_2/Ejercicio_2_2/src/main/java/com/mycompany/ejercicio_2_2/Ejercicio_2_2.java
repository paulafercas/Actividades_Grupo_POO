/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_2_2;

/**
 *
 * @author paula
 */
import java.util.Scanner;
public class Ejercicio_2_2 {

    public static void main(String[] args) {
        String nombre;
        int cantidadSatelites;
        double masa;
        double volumen;
        int diametro;
        int distanciaSol;
        tipoPlaneta tipo;
        boolean esObservable;
        int periodoOrbital;
        int periodoRotacion;
        
        Scanner datos_entrada_teclado = new Scanner(System.in);
        
        System.out.println ("Ingrese el nombre : ");
        nombre = datos_entrada_teclado.next();
        
        System.out.println ("Ingrese cantidad de satelites : ");
        cantidadSatelites = datos_entrada_teclado.nextInt();
        
        System.out.println ("Ingrese la masa : ");
        masa = datos_entrada_teclado.nextDouble();
        
        System.out.println ("Ingrese el volumen : ");
        volumen = datos_entrada_teclado.nextDouble();
        
        System.out.println ("Ingrese el diametro : ");
        diametro = datos_entrada_teclado.nextInt();
        
        System.out.println ("Ingrese la distancia al sol : ");
        distanciaSol = datos_entrada_teclado.nextInt();
        
        System.out.println ("Ingrese el periodo orbital : ");
        periodoOrbital = datos_entrada_teclado.nextInt();
        
        System.out.println ("Ingrese el periodo rotacional : ");
        periodoRotacion = datos_entrada_teclado.nextInt();
        
        Planeta p1 = new Planeta(nombre,cantidadSatelites,masa,volumen,diametro,distanciaSol,tipoPlaneta.TERRESTRE,true, periodoOrbital, periodoRotacion);
        System.out.println ("************************************");
        p1.imprimir();
        System.out.println("Densidad del planeta = " + p1.calcularDensidad());
        System.out.println("Es planeta exterior = " + p1.esPlanetaExterior());
        System.out.println(); 
        
    }
}
