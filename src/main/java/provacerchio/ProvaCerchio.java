package provacerchio;

import java.util.Scanner;

public class ProvaCerchio {

    /**
     * Metodo per fare la copia di un oggetto di tipo Cerchio
     * Crea un oggetto che copia gli attributi dell'oggetto passato
     * @param in Oggetto di tipo Cerchio
     * @return Ritorna l'oggetto copiato con un raggio diverso
     */
    public static Cerchio copiaCerchio(Cerchio in){
        Cerchio c = new Cerchio(in.getRaggio());
        c.setRaggio(14);
        return c;
    }

    /**
     * Metodo che crea la copia di un intero e lo incrementa
     * Ci dimostra che il parametro in è una copia della varibile passata
     * @param in Variabile da copiare
     * @return Ritorna una copia dell'intero passato incrementato di 1
     */
    public static int copiaIntero(int in){
        in = in +1;
        return in;
    }

    /**
     * Metodo main
     * @param args
     */
    public static void main(String[] args) {

        int n = 100;
        int m = 200;
        System.out.println(" n: " + n + " m:" + m);
        m = copiaIntero(n);
        System.out.println(" n: " + n + " m:" + m);

        Cerchio c1 = new Cerchio(5);
        Cerchio c2 = copiaCerchio(c1);
        System.out.println( "c1 :" + c1.getRaggio() + " c2: " + c2.getRaggio() );
/*
        Scanner num = new Scanner(System.in); //Creo un oggetto raggio per leggere il valore dall'utente
        System.out.println("Inserisci il valore del raggio: ");
        double raggio = num.nextDouble(); //Leggo il valore inserito dall'utente

        Cerchio cerchio1 = new Cerchio(raggio); //Creo nuovo oggetto Cerchio;
        System.out.println("Il diametro è: " + cerchio1.getDiametro());
        System.out.println("L'Area è: " + cerchio1.getArea());
        System.out.println("Il perimetro è: " + cerchio1.getPerimetro());
*/
    }
}
