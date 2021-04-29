package oogeometric.poligono.rettangoli;

import oogeometric.poligono.Poligono;

public class Rettangolo extends Poligono {

    private double base = 0.0;
    private double altezza = 0.0;


    /**
     * Costruttore di default
     * Base e altezza di default a 0
     */
    public Rettangolo(){}


    /**
     * Costruttore con parametri
     * @param base Basi del rettangolo
     * @param altezza Altezze del rettangolo
     */
    public Rettangolo(double base, double altezza){
        this.base = base;
        this.altezza = altezza;
    }

    ////// METODI /////


    /**
     * Metodo per il calcolo del perimetro
     * @return Ritorna il valore del perimetro
     */
    public double getPerimetro(){
        return ( base * 2 ) + ( altezza * 2 );
    }


    /**
     * Metodo per il calcolo dell'area
     * @return Ritorna il valore dell'area
     */
    public double getArea(){
        return base * altezza;
    }



    /**
     * Metodo per il calcolo della diagonale
     * @return Ritorna il valore della diagonale
     */
    public double getDiagonale(){
        return Math.sqrt( (base * base) + (altezza * altezza) );
    }


    /**
     * Metodo che controlla se il rettangolo è valido
     * @return Ritorna true se base e altezza sono diversi
     */
    public boolean isRettangolo(){
        return base != altezza;
    }

    ////// GETTER /////

    /**
     * Getter per la base
     * @return Ritorna il valore della base
     */
    public double getBase() {
        return base;
    }


    /**
     * Getter per l'altezza
     * @return Ritorna il valore dell'altezza
     */
    public double getAltezza() {
        return altezza;
    }
}
