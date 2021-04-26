package stacknode;

public class Node {

    private String data;
    private Node ptr;

    /**
     * Costruttore
     * @param data Dati da inserire nello stack
     * @param ptr Puntatore dello stack
     */
    public Node(String data, Node ptr){
        this.data = data;
        this.ptr = ptr;
    }

    public String getData() {
        return data;
    }

    public Node getPtr() {
        return ptr;
    }
}
