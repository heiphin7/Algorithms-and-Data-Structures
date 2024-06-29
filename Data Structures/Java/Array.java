package Java;

public class Array {
    private int index;
    private int[] array;
    private int size;

    public Array(int size) {
        this.size = size;
        this.array = new int[size];
        this.index = 0;
    }

    public Array() {
        this.array = new int[10]; // 10 - default size of array
        this.index = 0;
        this.size = 10;
    }

    public void add(int num) {
        // ≈сли нужно увеличить размер массива
        if (index >= array.length) {
            int[] newArray = new int[index + 1];

            for(int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }

            newArray[index] = num;
            index++;
            size++;

            this.array = newArray;
            return;
        }

        array[index] = num;
        index++;
        size++;
    }

    public void add(int num, int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index out of bound!");
        }

        array[index] = num;
        this.index++;
        size++;
    }

    public void printArray() {
        for(int num: array) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        Array arr = new Array(3);

        arr.add(1, 0);
        arr.add(2);
        arr.add(3);

        // “ут уже будеть больший размер и должно создаватьс€ новый массив
        arr.add(4);
        arr.add(5);

        arr.printArray();
    }

}
