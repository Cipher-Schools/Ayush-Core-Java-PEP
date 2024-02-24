import java.util.PriorityQueue;

public class MinHeap {
    public int[] Heap;
    public int size;
    public int maxsize;


    public static int front =1;
    
    public MinHeap(int maxsize) {
        this.maxsize = maxsize;
        this.size = 0;
        Heap = new int[this.maxsize + 1];
        Heap[0] =Integer.MIN_VALUE;
    }
    

    public int parent(int pos){
        return pos/2;
    }
    public int leftChild(int pos){
        return pos * 2;
    }
    public int rightChild(int pos){
        return (pos * 2) +1;
    }

    public boolean isLeafNode(int pos){
        if(pos > (size/2)){
            return true;
        }
        return false;
    }

    public void swap(int fpos, int spos){
        int temp;
        temp = Heap[fpos];
        Heap[fpos] = Heap[spos];
        Heap[spos] = temp;
    }

    public void minHeapify(int pos){
        if(!isLeafNode(pos)){
            int swapPos = pos;
            if(rightChild(pos)<=size){
                swapPos = Heap[leftChild(pos)]<Heap[rightChild(pos)] ? leftChild(pos) : rightChild(pos);
            }
            else{
                swapPos =leftChild(pos);
            }
            if(Heap[pos]> Heap[leftChild(pos)] || Heap[pos]> Heap[rightChild(pos)]){
                swap(pos, swapPos);
                minHeapify(swapPos);
            }
        }
    }

    public void insert(int element){
        if(size >= maxsize){
            return;
        }
        Heap[++size] = element;
        int current  =size;
        while(Heap[current]< Heap[parent(current)]){
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public int  remove(){
        int popped = Heap[front];
        Heap[front] = Heap[size--];
        minHeapify(front);

        return popped;
    }

    public void print(){
        for (int i = 1; i < size/2; i++) {
                System.out.print(
                    "PARENT : "+ Heap[i]
                    + " LEFT CHILD : "+ Heap[2*i]
                    + " RIGHT CHILD : "+ Heap[2*i + 1]
                );
                System.out.println();
        }
    }

    public static void main(String[] args) {
        MinHeap mh = new MinHeap(10);
        mh.insert(5);
        mh.insert(3);
        mh.insert(17);
        mh.insert(10);
        mh.insert(84);
        mh.insert(19);
        mh.insert(6);
        mh.insert(22);
        mh.insert(9);

        mh.print();

        mh.remove();
        System.out.println();
        System.out.println("Removal DONE !!");
        System.out.println();
        mh.print();

        // PriorityQueue
    }

}
