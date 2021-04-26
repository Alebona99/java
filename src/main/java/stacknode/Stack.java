package stacknode;

public class Stack {

    private Node head;

    /**
     * Costruttore per Stack
     */
    public Stack(){
        head = null;
    }



    /**
     * Metodo per cntrollare se i lvalore dello stack è null
     * @return Ritorna true se il valore è null
     */
    private boolean isEmpty(){
        return head == null;
    }



    /**
     * Metodo push per aggiungere valore nello stack
     * @param data Valore da aggiungere nello stack
     */
    public void push(String data){
        Node node = new Node(data, head);
        head = node;
    }



    /**
     * Metodo pop per eliminare il valore a cui punta head
     */
    public void pop(){
        if(head != null){
            this.head = this.head.getPtr();
        }
        else {
            System.out.println("Stack vuoto");
        }
    }



    /**
     * Visualizza il valore a cui punta head nello stack
     * @return Ritorna il valore a cui punta head
     */
    public String peek(){
        if (isEmpty()){
            return "Stack vuoto";
        }

        return head.getData();
    }
}
