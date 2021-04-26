package Intero;

public class Numero {
    private int n;
    private int m;

    /**
     * Costruttore
     * @param n
     */
    public Numero(int n, int m){
        this.n = n;
        this.m = m;
    }

    /**
     * Metodo per controllo se numero è pari;
     * Ci ritorna true se verificato;
     * @param n Numero da controllare
     * @return
     */
    boolean isPari(int n){
        return ( n % 2 == 0 );
    }

    /**
     * Metodo per controllare se un numero è multiplo di un altro;
     * Ci ritorna true se verificato;
     * @param n Numero da controllare
     * @param m Multiplo
     * @return
     */
    boolean isMultiplo(int n, int m){
        return ( n % m == 0);
    }

    /**
     * Metodo per il calcolo del fattoriale
     * @param n Numero da calolare
     * @return
     */
    int getFact(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        else {
            return n * getFact(n-1 );
        }
    }

    /**
     * Metodo per calcolo della successione di Fibonacci
     * Ritorna il valore nella successione della posizione passata
     * @param n Numero della posizione in cui trovare il valore nella successione
     * @return
     */
    int getFib(int n){
        if ( n==0 ) return 0;
        else if( n==1) return 1;
        else return getFib(n-1) + getFib(n-2);
    }


    public void setN(int n){
        this.n = n;
    }

    public void setM(int m){
        this.m = m;
    }
}
