/**
 * 题目link: https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/
 * 描述: 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * <P>
 * 解法: 从左下角或者右上角开始往小的找，这样能从一开始就排除一部分的数,充分利用给定数组的有序性
 */
class Offer04 {
    fun findNumberIn2DArray(matrix: Array<IntArray>, target: Int): Boolean {
        if (matrix.isEmpty() || matrix[0].isEmpty()) return false

        val n = matrix.size
        val m = matrix[0].size
        var curX = 0
        var curY = m - 1
        var tmpVal: Int
        while (curX < n && curY >= 0) {
            tmpVal = matrix[curX][curY]
            if (tmpVal == target) return true

            if (tmpVal < target) {
                curX++
            } else {
                curY--
            }
        }

        return false
    }
}