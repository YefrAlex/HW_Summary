package JavaPro.lesson13_Three.task2;

public class Main {
    public static void main(String[] args) {
        MyBinaryTree tree = new MyBinaryTree();
        System.out.println("пустое ли дерево? - " + tree.isEmpty());

        tree.add(10, "Node 10");
        tree.add(2, "Node 2");
        tree.add(13, "Node 13");
        tree.add(1, "Node 1");
        tree.add(6, "Node 6");
        tree.add(12, "Node 12");
        tree.add(81, "Node 81");
        tree.add(5, "Node 5");

        System.out.println("пустое ли дерево? - " + tree.isEmpty());

        //TreeUtils.breathFirstSearch(tree);

        TreeUtils.depthInorder(tree);
    }
    /*
     public static void depthInorder(MyBinaryTree tree) {

        if (tree == null || tree.isEmpty()) {
            return;
        }

        Stack<Node> stack = new Stack<>();
        Node current = tree.getRoot();

        while (current != null || !stack.isEmpty()) {

            while (current != null) {
                stack.push(current);
                current = current.getLeft();
            }

            current = stack.pop();

            System.out.print(current.getValue() + " ");

            current = current.getRight();
        }
        System.out.println();
    }
     */

}
