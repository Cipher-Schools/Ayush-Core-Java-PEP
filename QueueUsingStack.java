import java.util.*;
public class QueueUsingStack {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    void enQueue(int x) {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        s1.push(x);
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    int deQueue() {
        if (s1.isEmpty()) {
            return -1;
        }
        int x = s1.peek();
        s1.pop();
        return x;
    }
    public static void main(String[] args) {
        QueueUsingStack q = new QueueUsingStack();
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.deQueue();
        q.deQueue();
    }

}