package paridispari;

/*Scrivere un programma che stampa tutti i numeri da 1 a N (N prefissato) e
 per ciascuno di questi stampa, a fianco del suo valore, se è pari o dispari */

import java.util.Scanner;

public class PariDispari {
    // private static String HELLO = "Hello world"; // Per la prova Hello World
    //private static Integer NUMERO = 10; //Dichiaro la variabile con il valore da controllare

    /**
     * Controllo se il parametro n è pari
     * @param n
     * @return
     */

    static boolean pari(Integer n){
        return ( n % 2== 0);
    }

    /*public static void paridispari(Integer N){

        //Ciclo for per controllo della variabile NUMERO
        for (Integer i = 1; i <= N ; i++) {

            //Se è Pari stampa
            if (i % 2 == 0) {
                System.out.println(i.toString() + " " + "Pari");
            }

            //Altrimenti stampa dispari
            else{
                System.out.println(i.toString() + " " +"Dispari");
            }
        }
    }*/


    /**
     * Main in cui c'è l'input per l'inserimento del numero da controllare e viene chiamato il metodo pari()
     * @param args
     */
    public static void main(String[] args) {
        //paridispari(10);

        Scanner numero = new Scanner(System.in);
        System.out.println("Inserisci il valore da controllare:");
        Integer input = numero.nextInt();

        for (Integer i = 1; i<= input; i++){
            if (pari(i) == true){
                System.out.println(i + " è pari");
            }

            else{
                System.out.println(i + " è dispari");
            }
        }
    }
}
