package stacknode;

public class StackNode {

    public static void main(String[] args) {

        Stack stack = new Stack(); //Creo uno stack

        for (Integer i = 0; i<10; i++){  //faccio un for per le push nello stack
            stack.push(i.toString());
        }

        for (Integer i = 0; i < 11; i++){ //faccio un for per visualizzare i valori nello stack ceh poi vengono eliminati da pop()
            System.out.println(stack.peek());
            stack.pop();
        }

    }
}
