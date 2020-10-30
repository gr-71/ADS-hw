package hw.lesson2;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class MainClass {
    public static void main(String[] args) {

        int number;

        Random random = new Random();

        ArrayImpl arrayImpl = new ArrayImpl(1_000); // first array with 1 000 elements

        for (int i = 0; i < 1_000; i++) {
            arrayImpl.add(random.nextInt(1_000));
        }
        System.out.println(arrayImpl.display()); // before sorting

        System.out.println("Show arrayImpl element with index 177: " + arrayImpl.getByIndex(177));
        System.out.println("Show if there is element 555 in arrayImpl: " + arrayImpl.findIndex(555));

        arrayImpl.sortBubble(); // Bubble sorting

        System.out.println("Our arrayImpl after bubble sorting: " + arrayImpl.display()); // after bubble sorting
        System.out.println("Search for index of elemenet 284: " + arrayImpl.findBinary(284));

  // Создаем три массива (для трех сортировок) с одинаковым случайным набором элементов:
        ArrayImpl arrayBubble = new ArrayImpl(100_000);
        ArrayImpl arraySelect = new ArrayImpl(100_000);
        ArrayImpl arrayInsert = new ArrayImpl(100_000);

        for (int i = 0; i < 100_000; i++) {
            number = random.nextInt(100_000);
            arrayBubble.add(number);
            arrayInsert.add(number);
            arraySelect.add(number);
        }
// Созданные и заполненные массивы перед сортировками:
        System.out.println("Our massives: ");
        System.out.println(arrayBubble.display());
        System.out.println(arraySelect.display());
        System.out.println(arrayInsert.display());

        System.out.println("Now we are sorting our massives ... ");
// Bubble
        long start = System.nanoTime();
        arrayBubble.sortBubble();
        long finish = System.nanoTime();
        System.out.println("Bubble sorting time: "
                + TimeUnit.NANOSECONDS.toMillis(finish - start) + " ms");
// Selection
        start = System.nanoTime();
        arraySelect.sortSelection();
        finish = System.nanoTime();
        System.out.println("Selection sorting time: "
                + TimeUnit.NANOSECONDS.toMillis(finish - start) + " ms");
// Insertion
        start = System.nanoTime();
        arrayInsert.sortInsertion();
        finish = System.nanoTime();
        System.out.println("Insertion sorting time: "
                + TimeUnit.NANOSECONDS.toMillis(finish - start) + " ms");

        System.out.println("Bubble sorted massive: " + arrayBubble.display());
        System.out.println("Selection sorted massive: " + arraySelect.display());
        System.out.println("Insertion sorted massive: " + arrayInsert.display());
    }
}
