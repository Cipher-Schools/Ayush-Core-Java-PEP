public class Main1 {
    private int[] heap;
    private int size;
    private int maxSize;
    
    private static final int FRONT = 1;
    
    public Main1(int[] array ) {
    this.maxSize = array.length;
    this.maxSize = maxSize;
    this.size = 0;
    heap = new int[maxSize + 1];
    heap[0] = Integer.MAX_VALUE;
    }
    
    private int parent(int pos) {
    return pos / 2;
    }
    
    private int leftChild(int pos) {
    return (2 * pos);
    }
    
    private int rightChild(int pos) {
    return (2 * pos) + 1;
    }
    
    private boolean isLeaf(int pos) {
    return pos >= (size / 2) && pos <= size;
    }
    
    private void swap(int fpos, int spos) {
    int tmp;
    tmp = heap[fpos];
    heap[fpos] = heap[spos];
    heap[spos] = tmp;
    }
    
    private void maxHeapify(int pos) {
    if (!isLeaf(pos)) {
    if (heap[pos] < heap[leftChild(pos)] || heap[pos] < heap[rightChild(pos)]) {
    if (heap[leftChild(pos)] > heap[rightChild(pos)]) {
    swap(pos, leftChild(pos));
    maxHeapify(leftChild(pos));
    } else {
    swap(pos, rightChild(pos));
    maxHeapify(rightChild(pos));
    }
    }
    }
    }
    
    public void insert(int element) {
    if (size >= maxSize) {
    return;
    }
    heap[++size] = element;
    int current = size;
    while (heap[current] > heap[parent(current)]) {
    swap(current, parent(current));
    current = parent(current);
    }
    }
    
    public void maxHeap() {
    for (int pos = (size / 2); pos >= 1; pos--) {
    maxHeapify(pos);
    }
    }
    
    public void print() {
    for (int i = 1; i <= size / 2; i++) {
    System.out.print(" PARENT : " + heap[i] + " LEFT CHILD : " + heap[2 * i] + " RIGHT CHILD :" + heap[2 * i + 1]);
    System.out.println();
    }
    }
    
    
    public static void main(String[] args) {
    
    int [] array = {34, 45, 1, 89, 84};
    Main1 heap = new Main1(array);
    System.out.println("The Max Heap is ");
    heap.print();
    
    }
    } 
