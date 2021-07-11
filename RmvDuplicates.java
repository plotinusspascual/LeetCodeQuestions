import java.util.LinkedList;
import java.util.Scanner;

public class RmvDuplicates {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int valIn) {
            this.val = valIn;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode currentNode = head;

        while (currentNode != null && currentNode.next != null) {
            if (currentNode.next.val == currentNode.val) {
                currentNode.next = currentNode.next.next;
            } else {
                currentNode = currentNode.next;
            }
        }
        return head;
    }

    public static void getList() {
        LinkedList<String> l1 = new LinkedList<String>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements: ");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println("Add a number to list: ");
            String number = sc.next();
            l1.add(number);
        }
        sc.close();
        System.out.println("LinkedList: ");
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }
    }

    public static void main(String[] args) {
        RmvDuplicates test = new RmvDuplicates();
        ListNode output = test.deleteDuplicates(getList(output));
        System.out.println("output: " + getList);
    }
}
