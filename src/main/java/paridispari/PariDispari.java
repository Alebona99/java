package paridispari;

/*Scrivere un programma che stampa tutti i numeri da 1 a N (N prefissato) e
 per ciascuno di questi stampa, a fianco del suo valore, se è pari o dispari */

public class PariDispari {
    // private static String HELLO = "Hello world"; // Per la prova Hello World
    private static Integer NUMERO = 10; //Dichiaro la variabile con il valore da controllare


    public static void main(String[] args) {

        //Ciclo for per controllo della variabile NUMERO
        for (Integer i = 1; i <= NUMERO ; i++) {

            //Se è Pari stampa
            if (i % 2 == 0) {
                System.out.println(i.toString() + " " + "Pari");
            }

            //Altrimenti stampa dispari
            else{
                System.out.println(i.toString() + " " +"Dispari");
            }
        }


        //System.out.println(HELLO); //Prova hello world
    }
}
