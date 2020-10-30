package hw.lesson2;

import java.util.Arrays;

public class ArrayImpl implements Array {

    private int[] arr;
    private int size = 0;

    public ArrayImpl(int maxLength){
        this.arr = new int [maxLength];
        this.size = 0;
    }

    @Override
    public int getByIndex(int index) {
        return arr[index];
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean find(int value) {
        return findIndex(value)!= -1;
    }

    @Override
    public int findIndex(int value) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == value){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int findBinary(int value) {
        int index = -1;
        int low = 0;
        int high = size - 1;
        int mid;
        if (isEmpty()){
            return -1;
        }
        while (low <= high) {
            mid = (high + low)/2;
            if (arr[mid] == value){
                index = mid;
                break;
            }
            if (arr[mid] > value){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return index;
    }

    @Override
    public boolean add(int value) {
        if (isFull()){
            return false;
        }
        arr[size] = value;
        size++;
        return true ;
    }

    @Override
    public boolean delete(int value) {
        int index = findIndex(value);
        return deleteByIndex(index);
    }

    @Override
    public boolean deleteByIndex(int index) {
        if (index < 0 || index >= size) {
            return false;
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
        return true;
    }

    @Override
    public String display() {
        return "{" + Arrays.toString(arr) +
                ", size=" + size +
                '}';
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return arr.length == size;
    }

    @Override
    public boolean sortBubble() {
        if (isEmpty()){
            return false;
        }
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]){
                    replaceElements(i, j);
                }
            }
        }
    return true;
    }

    @Override
    public void sortSelection() {
        for (int i = 0; i < size - 1; i++) {
            int minElement = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[minElement]){
                    minElement = j;
                }
            }
            if (i != minElement){
                replaceElements(i, minElement);
            }
        }
    }

    @Override
    public void sortInsertion() {
        int in, out;
        for (out = 1; out < size; out++) {
            int temp = arr[out];
            in = out;
            while (in > 0 && arr[in - 1] >= temp){
                arr[in] = arr[in - 1];
                --in;
            }
            arr[in] = temp;
        }
    }

    @Override
    public void replaceElements(int indexA, int indexB) {
        arr[indexA] = arr[indexA] + arr[indexB];
        arr[indexB] = arr[indexA] - arr[indexB];
        arr[indexA] = arr[indexA] - arr[indexB];
    }
}