package hw.lesson4;

import java.util.Iterator;

public interface MyIterator<E> extends Iterator<E> {

    void insertionBefore(E value);

    void insertionAfter(E value);

    void resetting();

}