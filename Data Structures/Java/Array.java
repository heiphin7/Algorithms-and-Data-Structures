package Java;

public class Array {
    private int size; // ������ �������
    private int current_index;
    private int[] arr;

    // ������ ������������� � ��������� �������
    public Array(int size) {
        this.arr = new int[size];
        this.current_index = 0;
    }

    public Array() {
        this.arr = new int[10]; // DEFAULT SIZE
        this.current_index = 0;
    }


    // ���������� � ����� �������
    public void add(int num) {
        arr[current_index] = num;
        current_index++;
    }

    // ���������� � ��������� ��������
    public void add(int num, int index) {
        arr[index] = num;
    }

    public int size() {
        return current_index + 1;
    }

    public int get(int i) {
        return arr[i];
    }
}
