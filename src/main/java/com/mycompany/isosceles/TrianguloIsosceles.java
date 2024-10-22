/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.isosceles;

/**
 *
 * @author Antonio Atienza Cano
 */
public class TrianguloIsosceles {
    // Variables de instancia
    private double ladoIgual1;
    private double ladoIgual2;
    private double base;

    // Constructor
    public TrianguloIsosceles(double ladoIgual1, double ladoIgual2, double base) 
    {
        this.ladoIgual1 = ladoIgual1;
        this.ladoIgual2 = ladoIgual2;
        this.base = base;
    }
        // Métodos de consulta
    
    public void setLadoIgual1(double ladoIgual1)
    {
        this.ladoIgual1 = ladoIgual1;
    }

    public void setLadoIgual2(double ladoIgual2)
    {
        this.ladoIgual2 = ladoIgual2;
    }


    public void setBase(double base) 
    {    
        this.base = base;
    }

    public double getLadoIgual1()
    {
        return ladoIgual1;
    }

    public double getLadoIgual2()
    {
        return ladoIgual2;
    }

    public double getBase() 
    {
        return base;
    }

    // Método para calcular el perímetro
    public double calcularPerimetro() 
    {
        return ladoIgual1 + ladoIgual2 + base;
    }

    // Método para calcular el área
    public double calcularArea() 
            
    {
        // Fórmula del área para triángulos isósceles
        double altura = Math.sqrt(ladoIgual1 * ladoIgual1 - (base * base / 4));
        return (base * altura) / 2;
    }
}