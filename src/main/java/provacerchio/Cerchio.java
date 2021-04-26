package provacerchio;

public class Cerchio {

    private double raggio; //Attributo raggio di Cerchio

    /**
     * Costruttore della classe
     */
    public Cerchio(double raggio){
        this.raggio = raggio;
    }

    /**
     * Metodo che ritorna il valore dell'area
     * @return
     */
    double getArea(){
        return 3.14 * raggio * raggio;
    }

    /**
     * Metodo che ritorna il valore del perimetro
     * @return
     */
    double getPerimetro(){
        return 2 * 3.14 * raggio;
    }

    /**
     * Metodo che ritorna il valore del diametro
     * @return
     */
    double getDiametro(){
        return raggio * 2;
    }

    /**
     * Metodo che cambia il valore del raggio
     * @param raggio Valore per cambiare l'attributo raggio;
     */
    public void setRaggio(double raggio){
        this.raggio = raggio;
    }

    public double getRaggio() {
        return raggio;
    }
}
