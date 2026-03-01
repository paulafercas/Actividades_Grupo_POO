/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_2_3;

/**
 *
 * @author paula
 */
public class Automovil{
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
    boolean esAutomatico = false;
    int numeroMultas =0;
    boolean tieneMultas;
    
    //Constructor del automovil
    Automovil (String marca, int modelo, int motor, tipoCom tipoCombustible, tipoAuto automovil, int numeroPuertas, int cantidadAsientos, int velocidadMaxima, tipoColor color, boolean esAutomatico,boolean tieneMultas){
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.automovil = automovil;
        this.numeroPuertas = numeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
        this.esAutomatico = esAutomatico;
        this.tieneMultas = tieneMultas;
    }
    
    /**
* Método que imprime en pantalla los valores de los atributos de un automóvil
*/
    void imprimir() {
        System.out.println("Marca = " + marca);
        System.out.println("Modelo = " + modelo);
        System.out.println("Motor = " + motor);
        System.out.println("Tipo de combustible = " + tipoCombustible);
        System.out.println("Tipo de automóvil = " + automovil);
        System.out.println("Número de puertas = " + numeroPuertas);
        System.out.println("Cantidad de asientos = " + cantidadAsientos);
        System.out.println("Velocida máxima = " + velocidadMaxima);
        System.out.println("Color = " + color);
        System.out.println("Automatico = " + esAutomatico);
        System.out.println("Multas " + tieneMultas);
        }
    
    //Metodos de get
    //Metodo para obtener la marca 
    String getMarca() {
        return marca;
    }
    
    //Metodo para obtener el modelo
    int getModelo() {
        return modelo;
    }
    
    //Metodo para obtener el volumen en litros del cilindraje
    int getMotor() {
        return motor;
    }

    //Metodo para obtener el tipo de combustible
    tipoCom getTipoCombustible() {
        return tipoCombustible;
    }

    //Metodo para obtener el tipo de automovil
    tipoAuto getTipoAutomovil() {
        return automovil;
    }
    //Metodo para obtener el numero de puertas
    int getNúmeroPuertas() {
        return numeroPuertas;
    }
    //Metodo para obtener la cantidad de asientos
    int getCantidadAsientos() {
        return cantidadAsientos;
    }
    //Metodo para obtener la velocidad maxima
    int getVelocidadMaxima() {
        return velocidadMaxima;
    }
    //Metodo para obtener el color
    tipoColor getColor() {
        return color;
    }
    //Metodo para obtener la velocidad actual
    int getVelocidadActual() {
        return velocidadActual;
    }
    
    //Metodo para obtener informacion si es automatico o no
    boolean getesAutomatico(){
        return esAutomatico;
    }
    
    //Metodos para set
    //Metodo que establece la marca del automovil
    void setMarca(String marca) {
        this.marca = marca;
    }
    
    /**
    * Método que establece el modelo de un automóvil
    */
    void setModelo(int modelo) {
        this.modelo = modelo;
    }
    /**
    * Método que establece el volumen en litros del motor de un automóvil
    */
    void setMotor(int motor) {
        this.motor = motor;
    }
    /**
    * Método que establece el tipo de combustible de un automóvil
    */
    void setTipoCombustible(tipoCom tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
    /**
    * Método que establece el tipo de automóvil
    */
    void setTipoAutomovil(tipoAuto automovil) {
        this.automovil = automovil;
    }
    /**
    * Método que establece el número de puertas de un automóvil
    */
    void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
    /**
    * Método que establece la cantidad de asientos de un automóvil
    */
    void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }
    /**
    * Método que establece la velocidad máxima de un automóvil
    */
    void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    /**
    * Método que establece el color de un automóvil
    */
    void setColor(tipoColor color) {
        this.color = color;
    }
    /**
    * Método que establece la velocidad de un automóvil
    */
    void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
    
    //Metodo para establecer si es automatico o no
    void setesAutomatico(boolean esAutomatico){
        this.esAutomatico = esAutomatico;
    }
    
    //Metodos de aceleracion
    
    /**
    * Método que incrementa la velocidad de un automóvil
    */
    void acelerar(int incrementoVelocidad) {
        if (velocidadActual + incrementoVelocidad < velocidadMaxima) {
        /* Si el incremento de velocidad no supera la velocidad
        máxima */
        velocidadActual = velocidadActual + incrementoVelocidad;
        } 
        else { /* De otra manera no se puede incrementar la velocidad y
        se genera mensaje */
            numeroMultas +=1;
            System.out.println("Usted tiene "+ numeroMultas + " multas.");
        }
    }
    
    /**
    * Método que decrementa la velocidad de un automóvil
    */
    void desacelerar(int decrementoVelocidad) {
        /* La velocidad actual no se puede decrementar alcanzando un
        valor negativo */
        if ((velocidadActual - decrementoVelocidad) > 0) {
        velocidadActual = velocidadActual - decrementoVelocidad;
        } else { /* De otra manera no se puede decrementar la velocidad y
        se genera mensaje */
        System.out.println("No se puede decrementar a una velocidad negativa.");
        }
    }
    /**
    * Método que coloca la velocidad actual de un automóvil en cero
    */
    void frenar() {
        velocidadActual = 0;
        }
    /**
    * Método que calcula el tiempo que tarda un automóvil en recorrer
    * cierta distancia
    * @param distancia Parámetro que define la distancia a recorrer por
    * el automóvil (en kilómetros)
    */
    double calcularTiempoLlegada(int distancia) {
        return distancia/velocidadActual;
    }
    
    //Metodo para determinar si el auto tiene multas
    //Ademas nos gustaria crear un metodo tipo set para cambiar el valor del atributo tieneMultas
    void setTienemultas (){
        this.tieneMultas = numeroMultas > 0;
    }
    
    //Metodo para determinar el valor total de las multas
    //Este metodo simplemente es un metodo get para saber cuantas multas tiene el automovil
    int getnumeroMultas (){
        return numeroMultas;
    }
}
