package Java;

public class Array {
    private int size; // Размер массива
    private int current_index;
    private int[] arr;

    // Способ инициализации с указанием размера
    public Array(int size) {
        this.arr = new int[size];
        this.current_index = 0;
    }

    public Array() {
        this.arr = new int[10]; // DEFAULT SIZE
        this.current_index = 0;
    }


    // Добавление в конец массива
    public void add(int num) {
        // TODO Сделать чтобы проверялась длина массива
        // То есть, чтобы массив увеличивался при надобности

        arr[current_index] = num;
        current_index++;
    }

    // Добавление с указанием элемента
    public void add(int num, int index) {
        if (i < 0 || i >= current_index) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        arr[index] = num;
    }

    public int size() {
        return current_index + 1;
    }

    public int get(int i) {
        if (i < 0 || i >= current_index) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        return arr[i];
    }

    public boolean isEmpty() {
        return current_index == 0;
    }
}
