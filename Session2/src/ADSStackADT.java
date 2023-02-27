import java.util.ArrayList;
import java.util.Map;

public interface ADSStackADT<T> {

    //Returns the value of the top element on the stack
    public T peek();

    //Removes the top element of the stack and returns the removed element.
    //If Stack is empty, returns null
    public T pop();

    //Adds an element ot the top of the stack
    //Element cannot be null
    public void push(T elm);

    //Returns true if stack is empty and false if it is not empty
    public boolean isEmpty();

}
