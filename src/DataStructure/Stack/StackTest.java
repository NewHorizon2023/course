package DataStructure.Stack;

public class StackTest {
    public static void main(String[] args) {
        StackByArray<Integer> stackByArray = new StackByArray<>();
        stackByArray.push(1);
        stackByArray.push(2);
        stackByArray.push(3);
        stackByArray.push(4);
        System.out.println("The size of stackByArray is: " + stackByArray.size());
        System.out.println("The first pop is: " + stackByArray.pop());
        System.out.println("The second pop is: " + stackByArray.pop());
        System.out.println("The third pop is: " + stackByArray.pop());

        //---------------------------------------------------------------

        StackByArrayList<Integer> stackByArrayList = new StackByArrayList<>();
        stackByArrayList.push(1);
        stackByArrayList.push(2);
        stackByArrayList.push(3);
        stackByArrayList.push(4);
        System.out.println("The size of stackByArrayList is:  " + stackByArrayList.size());
        System.out.println("The first pop is: " + stackByArrayList.pop());
        System.out.println("The second pop is: " + stackByArrayList.pop());
        System.out.println("The third pop is: " + stackByArrayList.pop());
    }
}
