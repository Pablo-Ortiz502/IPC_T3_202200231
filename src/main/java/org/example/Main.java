package org.example;

public class Main {

    public static void main(String[] args) {
        ClaseAbstracta[] figuras = new ClaseAbstracta[3];
        Circulo circulo = new Circulo(2,1);
        Cuadrado cuadrado = new Cuadrado(4,4);
        Triangulo triangulo = new Triangulo(10,5,3);

        figuras[0]=circulo;
        figuras[1]=cuadrado;
        figuras[2]=triangulo;

        for (int i = 0; i<figuras.length;i++){
            System.out.println("El "+ figuras[i].toString()+" tiene un area de: "+figuras[i].calcArean());
        }



    }



}