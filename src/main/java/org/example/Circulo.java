package org.example;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circulo extends ClaseAbstracta {

    int radio;
    public Circulo(int radio, int nlados){
        super(nlados);
        this.radio = radio;
    }

    public String toString() {
        return "Circulo";
    }
    @Override
    public double calcArean() {
        return pow(radio,2)*PI;
    }
}
