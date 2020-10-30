package hw.lesson3.dequeue;

import hw.lesson3.queue.QueueImpl;

public class DequeueImpl<E> extends QueueImpl<E> implements Dequeue<E> {

    public DequeueImpl(int maxSize) {
        super(maxSize);
    }

    @Override
    public boolean insertBack(E value) {
        return super.insert(value);
    }

    @Override
    public boolean insertFront(E value) {
        if (isFull()) {
            return false;
        }
        if (head - 1 < 0) {
            head = data.length;
        }
        data[--head] = value;
        size++;
        return true;
    }

    @Override
    public E removeBack() {
        return super.remove();
    }

    @Override
    public E removeFront() {
        if (isEmpty()) {
            return null;
        }
        if (tail < 0) {
            tail = data.length - 1;
        }
        size--;
        return data[tail--];
    }
}
