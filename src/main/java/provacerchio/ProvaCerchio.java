package provacerchio;

import java.util.Scanner;

public class ProvaCerchio {

    /**
     * Metodo main
     * @param args
     */
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in); //Creo un oggetto raggio per leggere il valore dall'utente
        System.out.println("Inserisci il valore del raggio: ");
        double raggio = num.nextDouble(); //Leggo il valore inserito dall'utente

        Cerchio cerchio1 = new Cerchio(raggio); //Creo nuovo oggetto Cerchio;
        System.out.println("Il diametro è: " + cerchio1.getDiametro());
        System.out.println("L'Area è: " + cerchio1.getArea());
        System.out.println("Il perimetro è: " + cerchio1.getPerimetro());
    }
}
