package Java;

import java.util.Arrays;

public class Problem66 {
    public static int[] plusOne(int[] nums) {
        for(int i = nums.length-1; i >= 0; i--) {
            if (nums[i] < 9) {
                nums[i]++;
                return nums;
            }
            nums[i] = 0;
        }


        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{1, 2, 3, 9})));
    }
}
