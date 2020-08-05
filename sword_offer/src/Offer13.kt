import java.util.*

/**
 * 题目link: https://leetcode-cn.com/problems/ji-qi-ren-de-yun-dong-fan-wei-lcof/
 * 描述: 地上有一个m行n列的方格，从坐标 [0,0] 到坐标 [m-1,n-1]
 * 一个机器人从坐标 [0, 0] 的格子开始移动，它每次可以向左、右、上、下移动一格（不能移动到方格外），也不能进入行坐标和列坐标的数位之和大于k的格子。
 * 例如，当k为18时，机器人能够进入方格 [35, 37] ，因为3+5+3+7=18。但它不能进入方格 [35, 38]，因为3+5+3+8=19。请问该机器人能够到达多少个格子？
 * <P>
 * 解法: BFS搜索咯
 */
class Offer13 {
    private val dx = arrayOf(0, 0, -1, 1)
    private val dy = arrayOf(-1, 1, 0, 0)
    private var currentIdx = 0
    var curX = 0
    var curY = 0
    var tmpX = 0
    var tmpY = 0
    var rawDigitSum = 0
    var colDigitSum = 0

    fun movingCount(m: Int, n: Int, k: Int): Int {
        val isVisited = Array(m) { BooleanArray(n) }
        val queue = LinkedList<Int>()
        queue.push(0)
        isVisited[curX][curY] = true
        var res = 1
        while (!queue.isEmpty()) {
            currentIdx = queue.poll()
            curX = currentIdx / n
            curY = currentIdx % n

            for (i in dx.indices) {
                tmpX = curX + dx[i]
                tmpY = curY + dy[i]
                if (tmpX < 0 || tmpX > m - 1 || tmpY < 0 || tmpY > n - 1) continue
                if (isVisited[tmpX][tmpY]) continue
                rawDigitSum = getDigitSum(tmpX)
                if (rawDigitSum > k) continue
                colDigitSum = getDigitSum(tmpY)
                if (colDigitSum > k) continue
                if (colDigitSum + rawDigitSum > k) continue

                res++
                isVisited[tmpX][tmpY] = true
                queue.push(tmpX * n + tmpY)
            }

        }
        return res
    }

    private fun getDigitSum(num: Int): Int {
        var res = 0
        var newNum = num
        while (newNum != 0){
            res += (newNum % 10)
            newNum /= 10
        }
        return res
    }

}
 