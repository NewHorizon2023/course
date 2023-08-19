package TABA.Question4;

/**
 * Test
 *
 * @Author: Xiangnan Liu
 * @CreateTime: 2023-08-19
 */
public class Test {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.add(new FoodProduct("Hamburger", 5, 5));
        tree.add(new FoodProduct("Pizza", 8, 4));
        tree.add(new FoodProduct("Fried Chicken", 3, 9));
        tree.add(new FoodProduct("Fish & Chips", 4, 7));
        tree.add(new FoodProduct("Pasta", 5, 2));
        tree.add(new FoodProduct("Salmon", 10, 3));
        tree.add(new FoodProduct("Salad", 2, 0));
        tree.add(new FoodProduct("Toast", 1, 1));
        tree.add(new FoodProduct("Hot Dog", 6, 6));
        tree.add(new FoodProduct("Instant Noodles", 3, 8));

        System.out.println("Is the tree empty: " + tree.isEmpty());
        System.out.println("The size of tree is: " + tree.count());
        System.out.println("The best food product is: " + tree.min());
        System.out.println("The worst food product is: " + tree.max());
    }
}
