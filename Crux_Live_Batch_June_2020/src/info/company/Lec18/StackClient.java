package info.company.Lec18;

public class StackClient {

    public static void main(String[] args) {

//        Stack<Integer> stack = new Stack<>();

        Stack stack = new Stack();
        stack.push(1);
        stack.push(5);
        stack.push(7);


        stack.pop();
        stack.push(7);

        stack.display();

    }
}
