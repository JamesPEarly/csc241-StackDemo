package csc241;

public class IntStack {
    // Instance variables
    IntNode top;

    // Constructor
    public IntStack(){
        this.top = null;
    }

    // push -- push an item to the top
    public void push(int v){
        IntNode temp = new IntNode(v);
        temp.next = top;
        top = temp;
    }

    // pop -- remove top element
    public Integer pop(){
        if (top != null) {
            // stack is not empty
            IntNode temp = top;
            top = top.next;
            return temp.value;
        }
        // Stack was empty
        return null;
    }

    // isEmpty -- determine is stack is empty
    public boolean isEmpty(){
        return top == null;
    }

}
