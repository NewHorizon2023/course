/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure.LinkedList;

/**
 *
 * @author eugene
 */
public interface LinearListInterface {
    boolean isEmpty();
	int size();
	Object get(int index);
	void remove(int index);
	void add(int index, Object theElement);
    void add(Object element);
	void printList();


}