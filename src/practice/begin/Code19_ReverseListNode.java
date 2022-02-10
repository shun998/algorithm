package practice.begin;

import java.util.LinkedList;

/**
 * @User: layman
 * @Date: 2022/1/23 11:33
 * @Description:
 */
public class Code19_ReverseListNode {
    public static class ListNode {
        private int value;
        private ListNode next;

        public ListNode(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "" +
                    "value=" + value + "";
        }
    }

    public static ListNode reverse(ListNode head) {
        ListNode next = null;
        ListNode pre = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        printList(node1);
        ListNode reverse = reverse(node1);
        printList(reverse);
        LinkedList list = new LinkedList();

    }
}
