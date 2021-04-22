package divisibile;

import java.util.Scanner;

public class Divisibile {

    /**
     * Metodo che controlla se il parametro n è un multiplo di m
     * @param n preso in input nel main
     * @param m preso in input nel main
     * @return
     */
    static boolean multiplo(Integer n, Integer m){
        return (n % m == 0);
    }


    /**
     * Main in cui richiamo il metodo multiplo() e implementole istanze per l'input
     * @param args
     */
    public static void main(String[] args) {
        //divisibile(12);
        Scanner numero = new Scanner(System.in);
        System.out.println(" Inserisci il numero da controllare:");
        Integer num = numero.nextInt();

        Scanner multiplo = new Scanner(System.in);
        System.out.println("Inserisci il multiplo: ");
        Integer mult = multiplo.nextInt();

        for (int i = 1; i <= num ; i++) {
            if (multiplo(i, mult) == true){
                System.out.println(i + " è multiplo di " + mult);
            }
            else{
                System.out.println(i + " non è multiplo di " + mult);
            }
        }
    }
}