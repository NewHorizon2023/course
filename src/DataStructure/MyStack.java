/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure;
import java.util.*;
/**
 *
 * @author cmuntean
 */
 public class MyStack implements stackapp.StackInterface {
    private ArrayList<String> theStack;

    /** Creates a new instance of Stack */
    public MyStack()
    {
        theStack = new ArrayList<String>();
    }

    public boolean isEmpty()
    {
        return theStack.isEmpty();
    }
   
    /** always false as there is no limit on the size of this ArrayList based stack */
    public boolean isFull()
    {
        return false;
    }

    /** removes the item  from the TOP (first position) of the stack and returns it */
    public Object pop()
    {
        if (!(theStack.isEmpty()))
        {
             return theStack.remove(0);
        }
        else
		return null;
    }


    /** puts/inserts an item onto the TOP (first position) of the stack */
    public void push(Object newItem)
    {
          theStack.add(0, (String)newItem);

    }
    
    public int size(){
        return theStack.size();
    }
    
}
