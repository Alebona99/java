package oogeometric.poligono.triangoli;

import oogeometric.poligono.Poligono;

public class Triangolo extends Poligono {

    private double base = 0.0;
    private double latoA = 0.0;
    private double latoB = 0.0;


    /**
     * Costruttore di default
     * Valori dei 3 lati settati a 0
     */
    public Triangolo(){}

    /**
     * Costruttore con parametri
     * @param base Valore della base del triangolo
     * @param latoA Valore del lato A
     * @param latoB Valore del lato B
     */
    public Triangolo(double base, double latoA, double latoB){
        super(base, latoA, latoB);
    }



    /////// METODI ///////


    /**
     * Metodo per il calcolo dell'Area di un Triangolo
     * Usando la formula di Erone
     * @return Ritrona il valore dell'Area
     */
    public double getArea(){
        return Math.sqrt( getPerimetro() * ( getPerimetro() - base ) * ( getPerimetro() - latoA ) * ( getPerimetro() - latoB ));
    }


    /**
     * Metodo per il calcolo dell'altezza della base
     * Conoscendo l'area
     * @return Ritorna il valore dell'altezza della base
     */
    public double getAltezzaBase(){
        return ( 2 * getArea() ) / base;
    }



    /**
     * Metodo per il calcolo dell'altezza del lato A
     * @return Ritorna il valore dell'altezza del lato A
     */
    public double getAltezzaLatoA(){
        return ( 2 * getArea() ) / latoA;
    }


    /**
     * Metodo per il calcolo dell'altezza del lato B
     * @return Ritorna il valore dell'altezza del lato B
     */
    public double getAltezzaLatoB(){
        return ( 2* getArea() ) / latoB;
    }



    /////// GETTER ///////

    /**
     * Getter per la base
     * @return Ritorna il valore della base
     */
    public double getBase() {
        return base;
    }


    /**
     * Getter per il lato A
     * @return Ritorna il valore del lato A
     */
    public double getLatoA() {
        return latoA;
    }


    /**
     * Getter per il lato B
     * @return Ritorna il valore del lato b
     */
    public double getLatoB() {
        return latoB;
    }
}
