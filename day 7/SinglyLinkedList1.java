import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    Node head;

    // Insert at the end
    void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Display the linked list
    void display() {
        if (head == null) {
            System.out.println("Linked List is Empty.");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}

public class SinglyLinkedList1{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SinglyLinkedList list = new SinglyLinkedList();

        System.out.print("Enter the number of nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            list.insert(data);
        }

        System.out.println("Linked List:");
        list.display();

        sc.close();
    }
}