package lr9;

public class LinkedList {
    private Node head;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
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
        LinkedList list = new LinkedList();

        // Добавление элементов в начало списка
        list.addAtHead(3);
        System.out.println("Список после добавления 3: ");
        list.printList(); // Вывод: 3

        list.addAtHead(2);
        System.out.println("Список после добавления 2: ");
        list.printList(); // Вывод: 2 3

        list.addAtHead(1);
        System.out.println("Список после добавления 1: ");
        list.printList(); // Вывод: 1 2 3
    }
}
