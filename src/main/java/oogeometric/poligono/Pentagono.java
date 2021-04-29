package oogeometric.poligono;

public class Pentagono extends Poligono{

    private double latoA = 0.0;


    /////// COSTRUTTORI //////


    /**
     * Costruttore di default
     */
    public Pentagono(){}


    /**
     * Costruttore con parametri
     * @param latoA Lato A del pentagono regolare
     */
    public Pentagono(double latoA){
        this.latoA = latoA;
    }


    ///// METODI //////


    /**
     * Metodo per il calcolo del perimetro di un pentagono regolare
     * @return Ritorna il valore del perimetro
     */
    public double getPerimetro(){
        return latoA * 5;
    }


    /**
     * Metodo per il calcolo dell'apotema di un pentagono regolare
     * @return Ritorna il valore dell'apotema del pentagono regolare
     */
    public double apotema(){
        return latoA * 0.688;
    }


    /**
     * Metodo per il calcolo dell'area di un pentagono regolare
     * @return
     */
    public double getArea(){
        return ( latoA * latoA ) * 1.72;
    }

}
