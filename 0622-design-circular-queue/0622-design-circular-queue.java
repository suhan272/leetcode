class MyCircularQueue {
    int[] cq;
    int size;
    int front;
    int currsize;

    public MyCircularQueue(int k) {
        cq = new int[k];
        size = k;
        front = 0;
        currsize = 0;
    }

    public boolean enQueue(int value) {
        if(isFull())
            return false;

        int rear = (front + currsize) % size;
        cq[rear] = value;
        currsize++;

        return true;
    }

    public boolean deQueue() {
        if(isEmpty())
            return false;

        front = (front + 1) % size;
        currsize--;

        return true;
    }

    public int Front() {
        if(isEmpty())
            return -1;

        return cq[front];
    }

    public int Rear() {
        if(isEmpty())
            return -1;

        int rear = (front + currsize - 1) % size;
        return cq[rear];
    }

    public boolean isEmpty() {
        return currsize == 0;
    }

    public boolean isFull() {
        return currsize == size;
    }
}