package Stack;
import java.util.Scanner;

// 1. Stack.java using array
public class Stack {
    private int[] stack;
    private int top;
    private int capacity;

    public Stack(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int element) {
        if (top == capacity - 1) {
            System.out.println("Stack is full");
            return;
        }
        stack[++top] = element;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }
}

// 2. CustomStack.java without using built-in libraries
class CustomStack {
    private int[] stack;
    private int top;
    private int capacity;

    public CustomStack(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int val) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        stack[++top] = val;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }
}

// 3. SupermarketQueue.java


class SupermarketQueue {
    private static final int MAX = 100;
    private static String[] queue = new String[MAX];
    private static int front = 0, rear = -1, count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add customer");
            System.out.println("2. Serve customer");
            System.out.println("3. Display queue");
            System.out.println("4. Number of customers");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter customer name: ");
                    String name = scanner.nextLine();
                    addCustomer(name);
                    break;
                case 2:
                    serveCustomer();
                    break;
                case 3:
                    displayQueue();
                    break;
                case 4:
                    System.out.println("Total customers: " + count);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);
    }

    public static void addCustomer(String name) {
        if (count == MAX) {
            System.out.println("Queue is full");
            return;
        }
        queue[++rear] = name;
        count++;
    }

    public static void serveCustomer() {
        if (count == 0) {
            System.out.println("No customers to serve");
            return;
        }
        System.out.println("Served: " + queue[front++]);
        count--;
    }

    public static void displayQueue() {
        if (count == 0) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Current queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}

// 4. CallCenterQueue.java


class CallCenterQueue {
    private static final int MAX = 100;
    private static String[] callQueue = new String[MAX];
    private static int front = 0, rear = -1, count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add incoming call");
            System.out.println("2. Serve next call");
            System.out.println("3. Display call queue");
            System.out.println("4. Display number of pending calls");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter caller name: ");
                    String name = scanner.nextLine();
                    addCall(name);
                    break;
                case 2:
                    serveCall();
                    break;
                case 3:
                    displayCalls();
                    break;
                case 4:
                    System.out.println("Pending calls: " + count);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);
    }

    public static void addCall(String name) {
        if (count == MAX) {
            System.out.println("Call queue is full");
            return;
        }
        callQueue[++rear] = name;
        count++;
    }

    public static void serveCall() {
        if (count == 0) {
            System.out.println("No calls to serve");
            return;
        }
        System.out.println("Handled call from: " + callQueue[front++]);
        count--;
    }

    public static void displayCalls() {
        if (count == 0) {
            System.out.println("Call queue is empty");
            return;
        }
        System.out.print("Current call queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(callQueue[i] + " ");
        }
        System.out.println();
    }
}

