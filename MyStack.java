public class MyStack {
    int[] stack = new int[5];
    int top = -1;

    void push(int n) {
        if (top == 4) {
            System.out.println("STACK IS FULL");
        } else {
            top++;
            stack[top] = n;
            System.out.println("Pushed: " + stack[top]);
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("STACK IS EMPTY");
        } else {
            System.out.println("POPPED: " + stack[top]);
            top--;
        }
    }

    void peek() {
        if (top == -1) {
            System.out.println("STACK IS EMPTY, NO ELEMENT TO PEEK");
        } else {
            System.out.println("Peeked element is: " + stack[top]);
        }
    }

    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.push(50);
        s.push(60);
        s.push(70);
        s.push(80);
        s.pop();
        s.pop();
        s.pop();
        s.peek();
    }
}
