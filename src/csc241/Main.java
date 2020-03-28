package csc241;

public class Main {

    public static void main(String[] args) {

        IntStack is1 = new IntStack();

        is1.push(25);
        is1.push(20);
        is1.push(10);
        is1.push(15);

//        System.out.println("First pop: " + is1.pop());
//        System.out.println("Second pop: " + is1.pop());
//        System.out.println("Third pop: " + is1.pop());

        // Pop all elements
        while (!is1.isEmpty()) {
            System.out.println("Pop: " + is1.pop());
        }


    }
}
