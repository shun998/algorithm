package practice.begin;

/**
 * @User: layman
 * @Date: 2022/1/5 15:43
 * @Description:
 */
public class Code13_TravelSearch {
    public static class Node {
        private Integer value;
        private Node left;
        private Node right;

        public Node(Integer value) {
            this.value = value;
        }


    }

    public static void pre(Node head) {
        if (head == null) {
            return;
        }
        System.out.print(head.value + " ");
        pre(head.left);
        pre(head.right);
    }

    public static void in(Node head) {
        if (head == null) {
            return;
        }
        in(head.left);
        System.out.print(head.value + " ");
        in(head.right);
    }

    public static void post(Node head) {
        if (head == null) {
            return;
        }
        post(head.left);
        post(head.right);
        System.out.print(head.value + " ");
    }

    public static void f(Node head) {
        if (head == null) {
            return;
        }
        //1
        f(head.left);
        //2
        f(head.right);
        //3
        //System.out.print(head.value + " ");
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.right.left = new Node(6);
        node.right.right = new Node(7);
        pre(node);
        System.out.println();
        in(node);
        System.out.println();
        post(node);

    }
}
