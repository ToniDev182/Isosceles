/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.isosceles;

/**
 *
 * @author Antonio Atienza Cano
 */
public class Isosceles 
{
    
public static void main(String[] args) 
{
        // Crear un triángulo isósceles con lados iguales de longitud 5, 5 y base de longitud 8
        TrianguloIsosceles miTriangulo = new TrianguloIsosceles(5, 5, 8);

        // Consultar información
        System.out.println("Lado igual 1: " + miTriangulo.getLadoIgual1());
        System.out.println("Lado igual 2: " + miTriangulo.getLadoIgual2());
        System.out.println("Base: " + miTriangulo.getBase());

        // Calcular y mostrar el perímetro
        System.out.println("Perímetro: " + miTriangulo.calcularPerimetro());

        // Calcular y mostrar el área
        System.out.println("Área: " + miTriangulo.calcularArea());
    }
}