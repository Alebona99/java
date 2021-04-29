package oogeometric.poligono;

public class Poligono {

    /**
     * 3 attributi che definiscono i minimi lati di un Poligono
     */
    private double latoA = 0.0;
    private double latoB = 0.0;
    private double latoC = 0.0;


    ///// COSTRUTTORI /////

    /**
     * Costruttore di default
     */
    public Poligono(){}

    /**
     * Costruttore con parametri
     * @param latoA Lato A del poligono
     * @param latoB Lato B del poligono
     * @param latoC Lato C del poligono
     */
    public Poligono(double latoA, double latoB, double latoC){
        this.latoA = latoA;
        this.latoB = latoB;
        this.latoC = latoC;
    }



    ////// METODI ///////

    /**
     * Metodo per il calcolo del perimetro di un poligono
     * @return Ritorna il valore del perimetro
     */
    public double getPerimetro(){
        return latoA + latoB + latoC;
    }


    /**
     * Metodo per il calcolo dell'area
     * @return Ritorna il valore dell'area di un poligono
     */
    public double getArea(){
        return latoA * latoB;
    }

    /////// GETTER //////


    /**
     * Getter per lato A
     * @return Ritorna valore del Lato A
     */
    public double getLatoA() {
        return latoA;
    }

    /**
     * Getter per Lato B
     * @return Ritorna valore del Lato B
     */
    public double getLatoB() {
        return latoB;
    }

    /**
     * Getter per il Lato C
     * @return Ritorna valore del Lato C
     */
    public double getLatoC() {
        return latoC;
    }
}
