package fibonacci;

import java.util.Scanner;

public class FibonacciRicorsivo {

    /**
     * Metodo ricorsivo per calcolare la successione di fibonacci
     * Prende come parametro il valore della posizione nella successione
     * Ritorna il valore della successione della posizione passata
     * @param n Numero di Posizione dell'elemento nella successione
     * @return
     */
    static int fibonacci(Integer n){
        if ( n==0 ) return 0;
        else if( n==1) return 1;
        else return fibonacci(n-1) + fibonacci(n-2);
    }

    /**
     * Metodo in main in cui implemento l'istanza scanner per l'input
     * Viene rihiamato il metodo fibonacci(n);
     * @param args
     */
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in); //implemento l'stanza scanner
        System.out.println("Inserisci un valore");

        Integer num = numero.nextInt(); //Legge il valore inserito

        System.out.println("Risultato: " + fibonacci(num)); //Stampa a video
    }
}
