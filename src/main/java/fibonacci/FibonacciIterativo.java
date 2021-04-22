package fibonacci;

import java.util.Scanner;

public class FibonacciIterativo {

    /**
     * Metodo iterativo per calcolare la successione di fibonacci
     * Prende come parametro il valore della posizione che si vuole sapere
     * Da come risultato il valore all'interno della successione della posizione richiesta
     * @param n Numero di Posizione dell'elemento nella successione
     * @return
     */
    static int fibonacci(Integer n){
        if( n==0 ) return 0;
        else if (n==1 ) return 1;
        else {
            int np = 0;
            int ns = 1;
            for (int i = 0; i <= n -1; i++) {
                int ris = np + ns;
                np = ns;
                ns = ris;
            }
            return np;
        }
    }


    /**
     * Metodo main in cui richiamo il motodo fibonacci()
     * Implemento l'istanza scanner per acquisire il valore dall'utente
     * @param args
     */
    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in); //istanza input del valore;
        System.out.println("Inserisci un valore");

        Integer num = numero.nextInt(); //Legge il valore immesso dall'utente

        System.out.println("Il risultato è: " + fibonacci(num));
    }
}
