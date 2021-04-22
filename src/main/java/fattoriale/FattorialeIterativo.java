package fattoriale;

import java.util.Scanner;

public class FattorialeIterativo {

    /**
     * Metodo per il calcolo del fattoriale in modo iterativo di n
     * @param n Numero da calcolare il fattoriale
     * @return
     */
    static int fattoriale(Integer n){
        int ris = 1;
        for (int i = 1; i <= n ; i++) {
            ris = ris * i;
        }
        return ris;
    }


    /**
     * Metodo main in cui viene richiamato il metodo fattoriale(n)
     * @param args
     */
    public static void main(String[] args) {

        //Acquisizione del valore di n dall'utente
        Scanner numero = new Scanner(System.in);
        System.out.println("Inserisci il valore: ");

        Integer num = numero.nextInt(); //Lettura del valore acquisito

        System.out.println("Il fattoriale è: " + fattoriale(num));
    }
}
