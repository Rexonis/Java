package lr9;

public class LinkedList2 {
    private Node head;
    private Node tail;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addAtTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList2 list = new LinkedList2();

        // Добавление элементов в конец списка
        list.addAtTail(1);
        System.out.println("Список после добавления 1: ");
        list.printList(); // Вывод: 1

        list.addAtTail(2);
        System.out.println("Список после добавления 2: ");
        list.printList(); // Вывод: 1 2

        list.addAtTail(3);
        System.out.println("Список после добавления 3: ");
        list.printList(); // Вывод: 1 2 3
    }
}
