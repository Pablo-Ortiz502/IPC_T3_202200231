package org.example;

public class Cuadrado extends ClaseAbstracta {
    int lado;
    public Cuadrado(int lado, int nLaods){
        super(nLaods);
        this.lado = lado;

    }



    public String toString() {
        return "Cuadrado";
    }

    @Override
    public double calcArean() {

        return lado*lado ;
    }
}
