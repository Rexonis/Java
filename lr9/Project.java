package lr9;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList4 {
    private Node head;

    // Методы с использованием циклов
    public void createHead() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Введите элемент " + (i + 1) + ": ");
            int data = scanner.nextInt();
            addFirst(data);
        }
    }

    public void createTail() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Введите элемент " + (i + 1) + ": ");
            int data = scanner.nextInt();
            addLast(data);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current.data).append(" ");
            current = current.next;
        }
        return sb.toString().trim();
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    public void insert(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node current = head;
        for (int i = 0; i < index - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Индекс вне диапазона");
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    public void removeFirst() {
        if (head == null) {
            return;
        }
        head = head.next;
    }

    public void removeLast() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    public void remove(int index) {
        if (index == 0) {
            removeFirst();
            return;
        }
        Node current = head;
        for (int i = 0; i < index - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            System.out.println("Индекс вне диапазона");
            return;
        }
        current.next = current.next.next;
    }
    private void createHeadRecHelper(int n, Scanner scanner) {
        if (n == 0) {
            return;
        }
        System.out.print("Введите элемент " + n + ": ");
        int data = scanner.nextInt();
        addFirst(data);
        createHeadRecHelper(n - 1, scanner);
    }

    public void createTailRec() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов: ");
        int n = scanner.nextInt();
        createTailRecHelper(n, scanner);
    }

    private void createTailRecHelper(int n, Scanner scanner) {
        if (n == 0) {
            return;
        }
        System.out.print("Введите элемент " + n + ": ");
        int data = scanner.nextInt();
        addLast(data);
        createTailRecHelper(n - 1, scanner);
    }

    public String toStringRec() {
        return toStringRecHelper(head);
    }

    private String toStringRecHelper(Node current) {
        if (current == null) {
            return "";
        }
        return current.data + " " + toStringRecHelper(current.next);
    }

    public void createHeadRec() {
    }
}

public class Project {
    public static void main(String[] args) {
        LinkedList4 list = new LinkedList4();

        // Использование методов с циклами
        list.createHead();
        System.out.println("Список (с головы): " + list.toString());

        list.createTail();
        System.out.println("Список (с хвоста): " + list.toString());

        list.addFirst(0);
        System.out.println("Список после добавления элемента в начало: " + list.toString());

        list.addLast(99);
        System.out.println("Список после добавления элемента в конец: " + list.toString());

        list.insert(2, 50);
        System.out.println("Список после вставки элемента: " + list.toString());

        list.removeFirst();
        System.out.println("Список после удаления первого элемента: " + list.toString());

        list.removeLast();
        System.out.println("Список после удаления последнего элемента: " + list.toString());

        list.remove(2);
        System.out.println("Список после удаления элемента по индексу: " + list.toString());

        // Использование методов с рекурсией
        LinkedList4 listRec = new LinkedList4();
        listRec.createHeadRec();
        System.out.println("Список (с головы, рекурсия): " + listRec.toStringRec());

        LinkedList4 listRec2 = new LinkedList4();
        listRec2.createTailRec();
        System.out.println("Список (с хвоста, рекурсия): " + listRec2.toStringRec());
    }
}
