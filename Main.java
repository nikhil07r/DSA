class CircularQueue {
    private int[] queue;
    private int head;
    private int tail;
    private int length;
    private int size;
    
    public CircularQueue(int capacity) {
        this.length = capacity;
        this.queue = new int[length];
        this.head = 0;
        this.tail = 0;
        this.size = 0;
    }
    
    public void enqueue(int x) {
        if (size == length) {
            System.out.println("Queue Overflow!");
            return;
        }
        
        queue[tail] = x;
        tail = (tail == length - 1) ? 0 : tail + 1;
        size++;
    }
    
    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue Underflow!");
            return -1;
        }
        
        int x = queue[head];
        head = (head == length - 1) ? 0 : head + 1;
        size--;
        return x;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == length;
    }
}

public class Main {
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(5);
        
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        
        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Dequeued: " + q.dequeue());
        
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.enqueue(70);
    }
}