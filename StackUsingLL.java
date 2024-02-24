import java.util.Scanner;
import java.util.*;

public class StackUsingLL {
    private class Node{
        int data;
        Node Link;
    }
    Node top;
    public StackUsingLL() {
        this.top = null;
    }
    public void push(int x){
        Node temp = new Node();
        temp.data = x;
        temp.Link = top;
        top = temp;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public int peek(){
        if(!isEmpty()){
            return top.data;
        }
        else{
            System.out.println("Stack is empty!!");
            return -1;
        }
    }

    public void pop(){
        if(top == null){
            System.out.println("Stack Underflow!!");
            return;
        }
        top = top.Link;
    }

    public void display(){
        if(top == null){
            System.out.println("Stack Underflow!!");
            return;
        }
        else{
            Node temp = top;
            while(temp != null){
                System.out.printf("%d -> ",temp.data);
                temp = temp.Link;
            }
        }
    }
    public static void main(String[] args) {
        // Stack<Integer> s = new Stack<>();
        // Scanner sc = new Scanner(System.in);
        // int ele =0;
        // while(true){
        //     System.out.println("Enter your choice");
        //     System.out.println("1: Push\n2: Pop\n3: Display\n4: Exit\n ");
        //     int choice = sc.nextInt();
        //     switch (choice) {
        //         case 1:
        //             System.out.println("Enter the element: ");
        //             ele = sc.nextInt();
        //             s.push(ele);
        //             break;
        //         case 2:
        //             s.pop();
        //             System.out.println("top element popped");
        //             break;
        //         case 3:
        //             System.out.println(s);
        //             break;
        //         case 4:
        //             System.exit(0);
        //             break;
            
        //         default:
        //             break;
        //     }
        //     sc.close();
        // }

        StackUsingLL stack = new StackUsingLL();
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.push(0);

        stack.display();

        System.out.println("Top element is : "+ stack.peek());
        stack.pop();
        stack.pop();
        System.out.println("Stack after 2 POP operations : " );
        stack.display();

    }
}
