/**
 * 题目link: https://leetcode-cn.com/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof/
 * 描述: 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如，数组 [3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。  
 * <P>
 * 解法: 官方解答是用二分
 */
class Offer11 {
    fun minArray(numbers: IntArray): Int {
        if (numbers.isEmpty()) return 0

        var min = Integer.MAX_VALUE
        for (i in numbers.indices) {
            if (numbers[i] < min) {
                min = numbers[i]
            }
        }
        return min
    }
}