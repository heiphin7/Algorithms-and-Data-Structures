package Java;

import java.util.LinkedHashSet;
import java.util.Set;

/*
    by @heiphin7

    26 ������ �� leetcode.
    �������� ������������� ������ �����, ��������������� � ����������� �������,
    ������� ��������� �� ����� ���, ����� ������ ���������� ������� ���������
    ������ ���� ���. ������������� ������� ��������� ������ ���������� ����������.
    ����� ������� ���������� ���������� ��������� � ������.

    ��� ������� � ����������� LinkedHashSet - ��������� ������, ������� ���������
    Set. �� ������� ����������� ��� ��, ��� ��� ��� �������� ��������� �� ��� �
    ����������������� (�������������)
*/

public class Remove_Duplicates_from_Sorted_Array_26 {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>();

        for(int num: nums) {
            set.add(num);
        }

        int i = 0;
        for(int num: set) {
            nums[i++] = num;
        }

        return set.size();
    }
}
