package oogeometric.coniche;

public class Cerchio extends Ellisse{

    /**
     * Costruttore di default
     */
    public Cerchio(){}


    /**
     * Costruttore con parametro
     * @param raggio Raggio del cerchio
     */
    public Cerchio(double raggio){
        super(raggio, raggio);
    }
}
