package stackarray;

public class StackArray {

    public static void main(String[] args) {

        Stack stack = new Stack(10); //Creo uno stack con capacità 10

        for (Integer i = 0; i<10; i++){  //faccio un for per le push nello stack
            stack.push(i.toString());
        }

        for (Integer i = 0; i < 11; i++){ //faccio un for per visualizzare i valori nello stack ceh poi vengono eliminati da pop()
        System.out.println(stack.peek());
        stack.pop();
        }
    }
}
