package oogeometric.poligono.rettangoli;

import oogeometric.poligono.rettangoli.Rettangolo;

public class Quadrato extends Rettangolo {

    /**
     * Costruttore di default
     */
    public Quadrato(){}

    /**
     * Costruttore con parametri
     * @param lato Un lato del quadrato
     */
    public Quadrato(double lato){
        super(lato, lato);
    }
}
