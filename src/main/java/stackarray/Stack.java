package stackarray;

public class Stack {

    private int size;
    private String[] elements;
    private static final int DEFAULT_SIZE = 20;


    /**
     * Costruttore senza parametro che setta la capacità dello stack array a 30
     */
    public Stack(){
        elements = new String[DEFAULT_SIZE];
    }


    /**
     * Costruttore con parametro che setta la capacità dello stack
     * @param maxSize Parametro per capacità stack
     */
    public Stack(int maxSize){
        elements = new String[maxSize];
    }



    /**
     * Metodo che fa il push nello stack dinamico
     * Ha un controllo per rendere la grandezza dello stack dinamico
     * inserisce un valore nello stack
     * @param el Elemento da inserire
     */
    public void push(String el){

        if ( isFull() ){
            String[] temp = new String[elements.length +1];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }

        elements[size++] = el;

        if ( isHalfEmpty() ) {
            while( isHalfEmpty() ) {
                String[] temp = new String[elements.length - 1];
                System.arraycopy(elements, 0, temp, 0, temp.length);
                elements = temp;
            }
        }
    }




    /**
     * Metodo che fa il peek dello stack
     * @return Ritorna l'elemento al top dello Stack
     */
    public String peek(){
        if (isEmpty()){
            return "Lo Stack è vuoto";
        }
        return elements[size - 1];
    }



    /**
     * Rimuove l'elemento dal top dello stack
     * @return  Ritorna il top dello stack
     */
    public String pop(){
        if (isEmpty()){
            return "Lo Stack è vuoto";
        }
        return elements[--size];
    }



    /**
     * Controllo per lo stack se è vuoto
     * @return Ritorna true se è vuoto
     */
    private boolean isEmpty(){
        return size == 0;}



    /**
     * Controllo se lo stack è pieno
     * @return Ritorna true se la capacità supera o è uguale alla lunghezza dell'array
     */
    private boolean isFull(){
        return size >= elements.length;
    }



    /**
     * Controllo se lo stack non è totalmentw usato
     * @return Ritorna true se la capacità è minore della lunghezza dell'array, cioè se ci sono indici null;
     */
    private boolean isHalfEmpty(){
        return size < elements.length;
    }


    /**
     * Getter per vedere le capacità dell'array
     * @return Ritorna il valore della capacità
     */
    public int getSize() {
        return size;
    }
}
