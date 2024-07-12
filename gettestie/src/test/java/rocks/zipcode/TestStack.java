package rocks.zipcode;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    @org.junit.Test
    public void TestStack2() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        stack.pop();
        assertEquals(true, stack.isEmpty()); // true
    }

    @org.junit.Test
    public void TestStack3() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        stack.push("Hi");
        stack.push("bye");
        stack.peek();

        String expectedString = "bye";
        assertEquals(expectedString, stack.peek()); // true
    }

    @org.junit.Test
    public void TestStack4() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        stack.push("Hi");
        stack.push("bye");

        int expected = 3;
        assertEquals(expected, stack.size());
    }




    // Make a bigger test exercising more Stack methods.....
}
