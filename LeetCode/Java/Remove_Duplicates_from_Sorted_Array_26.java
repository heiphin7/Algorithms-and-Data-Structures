package Java;

import java.util.LinkedHashSet;
import java.util.Set;

/*
    by @heiphin7

    26 Задача из leetcode.
    Учитывая целочисленный массив чисел, отсортированный в неубывающем порядке,
    удалите дубликаты на месте так, чтобы каждый уникальный элемент появлялся
    только один раз. Относительный порядок элементов должен оставаться неизменным.
    Затем верните количество уникальных элементов в числах.

    Для решения я использовал LinkedHashSet - структура данных, которая реализует
    Set. Ее главная особенность это то, что все его элементы уникальны но еще и
    структурированные (упорядоченные)
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
