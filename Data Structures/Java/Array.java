package Java;

public class Array {
    private int size; // Размер массива
    private int current_index;
    private int[] arr;

    public Array(int size) {
        this.arr = new int[size];
        this.current_index = 0;
    }

    public Array() {
        this.arr = new int[10]; // DEFAULT SIZE
        this.current_index = 0;
    }

    public int add(int num) { // возвращает индекс добавленного элемента
        arr[current_index] = num;
        return current_index;
    }

    public int get(int i) {
        return arr[i];
    }
}
