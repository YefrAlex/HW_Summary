package JavaPro.lesson13_Three.task2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeUtils {

    public static void breathFirstSearch(MyBinaryTree tree){
        if (tree == null || tree.isEmpty()){
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(tree.getRoot());
        while (!queue.isEmpty()){
            Node current = queue.poll();
            System.out.print(current.getValue() + " ");

            if (current.getLeft() != null){
                queue.add(current.getLeft());
            };
            if (current.getRight() != null){
                queue.add(current.getRight());
            };
        }
    }

    public static void depthInorder (MyBinaryTree tree) {
        if (tree == null || tree.isEmpty()) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        Node current = tree.getRoot();

        while (current != null || stack.isEmpty()){
            while (current != null){
                stack.push(current);
                current = current.getLeft();
            }
            current = stack.pop();
            System.out.print(current.getValue() + "  ");
            current = current.getRight();

        }
        System.out.println();
    }

}
