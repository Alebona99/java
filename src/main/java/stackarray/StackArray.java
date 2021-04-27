package stackarray;

public class StackArray {

    public static void main(String[] args) {

        Stack stack = new Stack(10); //Creo uno stack con capacità 10

        stack.push("ciao");
        System.out.println(stack.peek() + " " + stack.getSize()); //visualizzo l'unico elemento inserito e la lunhgezza dello stack

        /*for (Integer i = 0; i < 8; i++){  //faccio un for per le push nello stack
            stack.push(i.toString());
            System.out.println(stack.getSize());
        }*/

        /*for (Integer i = 0; i < 8; i++){ //faccio un for per visualizzare i valori nello stack ceh poi vengono eliminati da pop()
        System.out.println(stack.peek());
        stack.pop();
        }*/

    }
}
