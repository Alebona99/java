package oogeometric.coniche;

public class Coniche {

    /**
     * Metodo per la stampa dell'area e perimetro
     * @param e Oggetto di cui stampare area e perimetro
     */
    private static void stampa(Ellisse e){
        System.out.println("Area: " + e.getArea());
        System.out.println("Perimetro: " + e.getPerimetro());
    }

    public static void main(String[] args) {

        //Ellisse
        Ellisse ellisse = new Ellisse(4,5);

        //Cerchio
        Cerchio cerchio = new Cerchio(10);


        //Stampa dei valori
        stampa(ellisse);
        stampa(cerchio);

    }
}
