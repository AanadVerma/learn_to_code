package link_list;

public class LinkList {
    Node head;

    public static LinkList insert(LinkList list, int data) {

        Node new_node = new Node(data);

        if (list.head == null) {
            list.head = new_node;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }

        return list;
    }

    public static void printList(LinkList list) {
        Node currNode = list.head;

        System.out.print("LinkList: ");

        while (currNode != null) {
            System.out.print(currNode.data + " ");
            // Go to next node
            currNode = currNode.next;
        }
    }

    public static void main(String[] args) {
        LinkList list = new LinkList();

        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);

        // Print the LinkedList
        printList(list);
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }
}
