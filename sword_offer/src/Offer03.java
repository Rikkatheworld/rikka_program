import java.util.HashSet;
import java.util.Set;

/**
 * 题目link: https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/
 * 描述: 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 *
 * <p>
 * 解法: [遍历]标记一下是否访问过
 */
public class Offer03 {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 1, 0, 2, 5, 3};
        System.out.println(findRepeatNumber(nums));
    }

    public static int findRepeatNumber(int[] nums) {
        boolean[] isVisited = new boolean[nums.length];
        for (int num : nums) {
            if (isVisited[num]) {
                return num;
            } else {
                isVisited[num] = true;
            }
        }
        return 0;
    }
}
