package org.example;

public class Triangulo extends ClaseAbstracta {

    int base;
    int altura;
    public Triangulo(int base, int altura, int nLados){
        super(nLados);
        this.altura = altura;
        this.base = base;

    }
    public String toString() {
        return "Triangulo";
    }

    @Override
    public double calcArean() {
        return (double) (base * altura) /2;
    }
}
