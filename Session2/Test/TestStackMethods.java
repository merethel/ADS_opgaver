import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStackMethods {
    ADSStackADT<String> stack;
    ADSStackADT<String> emptyStack;

    @Before
    public void createStack() {
        stack = new ADSStack<String>();
        stack.push("0");
        stack.push("1");
        stack.push("2");

        emptyStack = new ADSStack<>();

    }

    @Test
    public void testPushAddsElementToTopOfStack() {
        //Arrange

        //Act
        stack.push("3");

        //Assert
        assertEquals("3", stack.pop());
    }

    @Test
    public void testNullNotAddElement() {
        stack.push(null);
        assertEquals("2", stack.pop());
    }

    @Test
    public void testPopReturnsTopElement()
    {
        //Arrange
        //Act

        //Assert
        assertEquals("2", stack.pop());
    }

    @Test
    public void testPopReturnsNullOnEmptyStack() {
        //Arrange
        //Act

        //Assert
        assertEquals(null, emptyStack.pop());
    }

    @Test
    public void testPopRemovesTopElement() {
        //Arrange
        //Act
        stack.pop();
        //Assert
        assertEquals("1", stack.peek());
    }

    @Test
    public void testIsEmptyReturnsTrueOnEmptyStack() {
        //Arrange
        //Act

        //Assert
        assertEquals(true, emptyStack.isEmpty());
    }

    @Test
    public void testIsEmptyReturnsFalseOnNotEmptyStack() {
        //Arrange
        //Act

        //Assert
        assertEquals(false, stack.isEmpty());
    }

    @Test
    public void testPeekReturnsValueOfTopElement() {
        //Arrange

        //Act

        //Assert
        assertEquals("2", stack.peek());
    }



}


