class MyCircularDeque {
    int[] dq;
    int size;
    int front;
    int currsize;

    public MyCircularDeque(int k) {
        dq = new int[k];
        size = k;
        front = 0;
        currsize = 0;
    }

    public boolean insertFront(int value) {
        if (isFull())
            return false;

        front = (front - 1 + size) % size;
        dq[front] = value;
        currsize++;

        return true;
    }

    public boolean insertLast(int value) {
        if (isFull())
            return false;

        int rear = (front + currsize) % size;
        dq[rear] = value;
        currsize++;

        return true;
    }

    public boolean deleteFront() {
        if (isEmpty())
            return false;

        front = (front + 1) % size;
        currsize--;

        return true;
    }

    public boolean deleteLast() {
        if (isEmpty())
            return false;

        currsize--;

        return true;
    }

    public int getFront() {
        if (isEmpty())
            return -1;

        return dq[front];
    }

    public int getRear() {
        if (isEmpty())
            return -1;

        int rear = (front + currsize - 1) % size;
        return dq[rear];
    }

    public boolean isEmpty() {
        return currsize == 0;
    }

    public boolean isFull() {
        return currsize == size;
    }
}