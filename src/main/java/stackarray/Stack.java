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
     * Metodo che fa il push nello stack
     * inserisce un valore nello stack
     * @param el Elemento da inserire
     */
    public void push(String el){

        elements[size++]  = el;
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

    public int getSize() {
        return size;
    }
}
