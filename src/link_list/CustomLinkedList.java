package link_list;

public class CustomLinkedList {
    Node head;

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public CustomLinkedList insetList(CustomLinkedList customLinkedList, int data) {
        Node new_node = new Node(data);

        if (customLinkedList.head == null) {
            customLinkedList.head = new_node;
        } else {
            Node last = customLinkedList.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;

        }

        return customLinkedList;
    }

    public void printList(CustomLinkedList customLinkedList) {

        Node node = customLinkedList.head;
        System.out.print("LinkList: ");
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }

    }

    public CustomLinkedList deleteByKey(CustomLinkedList customLinkedList, int key) {
        Node currentNode = customLinkedList.head, prev = null;
        //If head node itself holds the key to be deleted
        if (currentNode != null && currentNode.data == key) {
            customLinkedList.head = currentNode.next;
            return customLinkedList;
        }

        // CASE 2:
        // If the key is somewhere other than at head
        //

        // Search for the key to be deleted,
        // keep track of the previous node
        // as it is needed to change currNode.next
        while (currentNode != null && currentNode.data != key) {
            // If currNode does not hold key
            // continue to next node
            prev = currentNode;
            currentNode = currentNode.next;
        }
        if (currentNode != null) {
            prev.next = currentNode.next;
            System.out.println(key + " found and deleted");
        }

        if (currentNode == null) {
            // Display the message
            System.out.println(key + " not found");
        }
        // return the List
        return customLinkedList;
    }

    // Method to delete a node in the LinkedList by POSITION
    public CustomLinkedList
    deleteAtPosition(CustomLinkedList list, int index) {
        // Store head node
        Node currNode = list.head, prev = null;

        //
        // CASE 1:
        // If index is 0, then head node itself is to be
        // deleted

        if (index == 0 && currNode != null) {
            list.head = currNode.next; // Changed head

            // Display the message
            System.out.println(
                    index + " position element deleted");

            // Return the updated List
            return list;
        }

        //
        // CASE 2:
        // If the index is greater than 0 but less than the
        // size of LinkedList
        //
        // The counter
        int counter = 0;

        // Count for the index to be deleted,
        // keep track of the previous node
        // as it is needed to change currNode.next
        while (currNode != null) {

            if (counter == index) {
                // Since the currNode is the required
                // position Unlink currNode from linked list
                prev.next = currNode.next;

                // Display the message
                System.out.println(
                        index + " position element deleted");
                break;
            } else {
                // If current position is not the index
                // continue to next node
                prev = currNode;
                currNode = currNode.next;
                counter++;
            }
        }

        // If the position element was found, it should be
        // at currNode Therefore the currNode shall not be
        // null
        //
        // CASE 3: The index is greater than the size of the
        // LinkedList
        //
        // In this case, the currNode should be null
        if (currNode == null) {
            // Display the message
            System.out.println(
                    index + " position element not found");
        }

        // return the List
        return list;
    }

    public static void main(String[] args) {
        CustomLinkedList customLinkedList = new CustomLinkedList();
        customLinkedList.insetList(customLinkedList, 1);
        customLinkedList.insetList(customLinkedList, 2);
        customLinkedList.insetList(customLinkedList, 3);
        customLinkedList.insetList(customLinkedList, 4);
        customLinkedList.insetList(customLinkedList, 5);
        customLinkedList.deleteByKey(customLinkedList, 6);
        customLinkedList.printList(customLinkedList);
        customLinkedList.deleteAtPosition(customLinkedList, 2);
        customLinkedList.printList(customLinkedList);
    }
}
