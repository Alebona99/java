package fattoriale;

import java.util.Scanner;

public class FattorialeRicorsivo {

    /**
     * Metodo che in modo ricorsivo calcola il fattoriale di n
     * Controlla se il numero passato è valido
     * @param n Numero da calcolare il fattoriale
     * @return
     */
    static int fattoriale(Integer n){
        if (n == 0 || n == 1){
            return 1;
        }
        else {
            return n * fattoriale(n-1 );
        }
    }

    /**
     * Metodo main in cui viene richiamato il metodo  fattoriale
     * Implementate le istanze per l'input
     * @param args
     */
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);  //Istanza scanner per l'acquisizione del valore n
        System.out.println("Inserisci il valore da calcolare");

        Integer num = numero.nextInt();   //Legge l'input dell'utente

        System.out.println("Il risultato è: " + fattoriale(num));  //Stampa a video il risultato del fattoriale
    }
}
