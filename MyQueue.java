public class MyQueue {
    int size = 5;
    int[] queue = new int[size];
    int front = -1;
    int rear = -1;

    void enqueue(int data) {
        if (rear == size - 1) {
            System.out.println("OVERFLOW, NO MEMORY FOR THE DATA");
        } else {
            if (front == -1) front = 0;
            queue[++rear] = data;
            System.out.println("Inserted DATA IS: " + data);
        }
    }

    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("UNDERFLOW, SPACE IS AVAILABLE FOR ELEMENT");
        } else {
            System.out.println("REMOVED DATA: " + queue[front++]);
            if (front > rear) {
                front = -1;
                rear = -1;
            }
        }
    }

    void printLastElement() {
        if (rear == -1 || front > rear) {
            System.out.println("QUEUE, no last element.");
        } else {
            System.out.println("Last element in queue Is: " + queue[rear]);
        }
    }

    public static void main(String[] args) {
        MyQueue c = new MyQueue();
        c.enqueue(10);
        c.enqueue(20);
        c.enqueue(30);
        c.enqueue(40);
        c.enqueue(50);
        c.enqueue(60);  // Should trigger overflow
        c.dequeue();
        c.dequeue();
        c.dequeue();
        c.enqueue(60);  // This won’t work due to static size limit
        c.printLastElement();
    }
}
