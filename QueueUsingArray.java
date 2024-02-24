import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingArray {
    private int maxSize;
    private int[] queueArray;
    private int front, rear;
    private int currentSize;

    public QueueUsingArray(int size) {
        this.maxSize = size;
        this.queueArray = new int [size];
        front = 0;
        rear = -1;
        currentSize = 0;
    }

    public void insert(int item){
        if(maxSize == currentSize){
            System.out.println("Queue is full");
            return;
        }
        if(rear == maxSize-1){
            rear = -1;
        }
        queueArray[++rear] = item;
        currentSize++;
        System.out.println("item added");
    }
    public int delete(){
        if(currentSize == 0){
            throw new RuntimeException("Queue is empty");
        }
        int temp = queueArray[front++];
        if(front == maxSize){
            front = 0;
        }
        currentSize-- ;
        return temp;
    }

    public int peek(){
        return queueArray[front];
    }
    public static void main(String[] args) {
        // QueueUsingArray q = new QueueUsingArray(10);
        // q.insert(2);
        // q.insert(4);
        // System.out.println(q.delete());
        // System.out.println(q.delete());
        // q.insert(1);
        // System.out.println(q.delete());
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q);
        int item = q.remove();
        System.out.println(item);
        System.out.println(q);
        System.out.println(q.peek());
    }
}
