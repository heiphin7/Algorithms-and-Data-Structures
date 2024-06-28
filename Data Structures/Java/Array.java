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
        // TODO ������� ����� ����������� ����� �������
        // �� ����, ����� ������ ������������ ��� ����������

        arr[current_index] = num;
        current_index++;
    }

    // ���������� � ��������� ��������
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
