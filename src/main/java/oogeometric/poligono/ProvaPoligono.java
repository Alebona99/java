package oogeometric.poligono;

import oogeometric.poligono.rettangoli.Quadrato;
import oogeometric.poligono.rettangoli.Rettangolo;
import oogeometric.poligono.triangoli.Triangolo;

public class ProvaPoligono {

    /**
     * Metodo per la stampa di area e perimetro per la Classe Poligono
     * @param p Oggetto di cui fare la stampa
     */
    private static void stampa(Poligono p){
        System.out.println("Area: " + p.getArea());
        System.out.println("Perimetro: " + p.getPerimetro());
    }

    public static void main(String[] args) {

        //Rettangolo
        Rettangolo rettangolo = new Rettangolo(2, 3);


        //Quadrato
        Quadrato quadrato = new Quadrato(2);


        //Triangolo
        Triangolo triangolo = new Triangolo(2, 3, 4);

        //Stampa
        stampa(rettangolo);
        stampa(quadrato);
        stampa(triangolo);
    }

}
