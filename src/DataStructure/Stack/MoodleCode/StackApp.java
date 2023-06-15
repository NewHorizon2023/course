/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure.Stack.MoodleCode;

/**
 * @author cmuntean
 */
public class StackApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        StackInterface si = new MyStack();

        System.out.println(" Is the Stack  empty? " + si.isEmpty());

        // push 3 items (String type)into the stack
        si.push("One String");
        si.push("Second String");
        si.push("Third String");
        System.out.println("Three items were added to the stack");

        // check if the stack is empty now
        System.out.println("Is the Stack empty? " + si.isEmpty());

        // check the size of the stack
        System.out.println("Stack size is " + si.size());

        // Pop/remove 2 items and print them out
        String out;
        out = (String) si.pop();
        System.out.println("popped item: " + out);
        out = (String) si.pop();
        System.out.println("popped item: " + out);

        // check if the stack is empty now, after popping out some items
        System.out.println("Is the Stack empty? " + si.isEmpty());

        // Empty the stack  (pop/remove the last item)
        out = (String) si.pop();
        System.out.println("popped: " + out);

        // Try to Pop/remove from an empty stack to see what happens
        out = (String) si.pop();
        System.out.println("popped: " + out);
    }
}
