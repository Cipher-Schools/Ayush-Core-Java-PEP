public class Recursion {
    static int fact(int n){
        int res;
        if(n == 1 || n == 0){
            return 1;
        }
        res = fact(n - 1) * n;
        return res;
    }
    static void execute(int n){
        if(n<0){
            return;
        }
        System.out.println("hi");
        execute(n-1); //
    }

    // func1(){
    //     func2()
    // }
    // func2(){
    //     func1()
    // }

    // DELETE a linkedlist using recursion..
    static class Node{
        int data;
        Node next;
    }
    static void push(Node head, int data){
        Node new_Node = new Node();
        new_Node.data = data;
        new_Node.next = head;
        head = new_Node;
    }
    
    public static void main(String[] args) {
        Node head = new Node();
        push(head, 1);
        push(head, 4);
        push(head, 3);
        push(head, 2);
        delete(head);
    }
    static void delete(Node head){
        if(head == null){
            return;
        }
        delete(head.next);
        System.out.println("LL deleted");
        System.gc();
    }
}
