package oogeometric.coniche;

public class Ellisse {

    private double smajor = 0.0;
    private double sminor = 0.0;

    /**
     * Costruttore di default
     * Semiassi di default a 0
     */
    public Ellisse(){}


    /**
     * Costruttore con parametri
     * @param smajor Semi-asse maggiore
     * @param sminor Semi-asse minore
     */
    public Ellisse(double smajor, double sminor){
        this.smajor = smajor;
        this.sminor = sminor;
    }


    /////// METODI ///////

    /**
     * Metodo per il calcolo dell'area
     * @return Ritorna il valore dell'area
     */
    public double getArea(){
        return Math.PI * smajor * sminor;
    }


    /**
     * Metodo per il calcolo del perimetro
     * @return Ritorna il valore del perimetro
     */
    public double getPerimetro(){
        return 2 * Math.PI * Math.sqrt((( smajor * smajor ) + ( sminor * sminor )) /2 );
    }


    /**
     * Getter per Semi-asse maggiore
     * @return  Ritorna il valore del semi-asse maggiore
     */
    public double getSmajor() {
        return smajor;
    }


    /**
     * Getter per il Semi-asse minore
     * @return Ritrona il valore del semi-asse minore
     */
    public double getSminor() {
        return sminor;
    }
}
