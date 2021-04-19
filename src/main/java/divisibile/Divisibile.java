package divisibile;

public class Divisibile {
    //Dichiaro la variabile per il controllo
    private static Integer NUMERO = 12;

    public static void main(String[] args) {

        for (Integer i = 1; i <= NUMERO ; i++) {

            //Se è multiplo di 2
            if (i % 2 == 0){
                System.out.println(i.toString() + " " + "Multiplo di 2");
            }

            //Se è multiplo di 3
            else if(i % 3 == 0){
                System.out.println(i.toString() + " " + "Multiplo di 3");
            }

            //Se è multiplo di 5
            else if(i % 5 == 0){
                System.out.println(i.toString() + " " + "Multiplo di 5");
            }

            //Se è multiplo di 7
            else if(i % 7 == 0){
                System.out.println(i.toString() + " " + "Multiplo di 7");
            }

            //Se non è multilplo di nessuno
            else{
                System.out.println(i.toString() + " " + "Multiplo di nessuno");
            }
        }
    }
}
