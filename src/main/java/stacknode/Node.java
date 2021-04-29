package stacknode;

public class Node {

    private String data;
    private Node ptr;


    ////// COSTRUTTORI //////

    /**
     * Costruttore con parametri
     * @param data Dati da inserire nello stack
     * @param ptr Puntatore dello stack
     */
    public Node(String data, Node ptr){
        this.data = data;
        this.ptr = ptr;
    }


    /**
     * Copy constructor
     * @param node Oggetto di tipo node
     */
    public Node(Node node){
        this.data = node.data;
        this.ptr = node.ptr;
    }  //Copy constructor



    ///// GETTER /////

    /**
     * Getter data
     * @return Ritorna il valore data
     */
    public String getData() {
        return data;
    }


    /**
     * Getter ptr
     * @return Ritorna valore puntatore ptr
     */
    public Node getPtr() {
        return ptr;
    }
}
