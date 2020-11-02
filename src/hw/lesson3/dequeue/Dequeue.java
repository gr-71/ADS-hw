package hw.lesson3.dequeue;

import hw.lesson3.queue.Queue;

public interface Dequeue<E> extends Queue<E> {

    boolean insertBack (E value);

    boolean insertFront (E value);

    E removeBack();

    E removeFront();

}
