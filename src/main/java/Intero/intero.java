package Intero;

import java.util.Scanner;

public class intero {

    /**
     * Metodo main
     * @param args
     */
    public static void main(String[] args) {

        //Acquisisco il numero
        Scanner num = new Scanner(System.in); //Creo oggetto scanner per acquisire valore n dall'utente
        System.out.println("Inserisci il numero da calcolare: ");
        int numero = num.nextInt(); //Legge il valore inserito

        //Acquisisco il multiplo
        Scanner mult = new Scanner(System.in); //creo oggetto scanner per acquisire valore m dall'utente
        System.out.println("Inserisci il multiplo da verificare:");
        int multiplo = mult.nextInt(); //Legge il valore inserito

        Numero numero1 = new Numero( numero,multiplo ); //Creo l'oggetto numero1 passandogli i valori acquisiti
        System.out.println("Il valore del fattoriale: " + numero1.getFact(numero)); //Calcolo il fattoriale
        System.out.println("Il valore della posizione in Fibonacci :" + numero1.getFib(numero)); //Calcolo la successione Fibonacci

        //Controllo del numero se è pari o dispari
        if ( numero1.getPari(numero) ){
            System.out.println("Il numero è pari");
        }
        else {
            System.out.println("Il numero è dispari");
        }

        //Controllo se il numero è multiplo o no del valore passato
        if ( numero1.getMultiplo(numero, multiplo) ){
            System.out.println( numero + " è multiplo di " + multiplo );
        }
        else{
            System.out.println(numero + " non è multiplo di " + multiplo);
        }


    }
}
