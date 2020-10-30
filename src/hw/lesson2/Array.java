package hw.lesson2;

public interface Array {

    int getByIndex (int index);
    int getSize ();

    boolean find(int value);
    int findIndex (int value);
    int findBinary (int value);

    boolean add(int value);

    boolean delete(int value);
    boolean deleteByIndex(int index);

    String display();

    boolean isEmpty ();
    boolean isFull ();

    boolean sortBubble ();
    void sortSelection();
    void sortInsertion();

    void replaceElements(int indexA, int indexB);
}
