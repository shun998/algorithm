package practice.begin;

/**
 * @User: layman
 * @Date: 2022/1/5 16:07
 * @Description:
 */
public class Code14_SameTree {
    public static class Node {
        private Integer value;
        private Node left;
        private Node right;

        public Node(Integer value) {
            this.value = value;
        }
    }

    public static boolean isSame(Node head1, Node head2) {
        if (head1 == null ^ head2 == null) {
            return false;
        }
        if (head1 == null && head2 == null) {
            return true;
        }
        return head1.value == head2.value && isSame(head1.left, head2.left) && isSame(head1.right, head2.right);
    }

    public static void main(String[] args) {

    }
}
