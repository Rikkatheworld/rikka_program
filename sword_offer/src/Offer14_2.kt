/**
 * 题目link: https://leetcode-cn.com/problems/jian-sheng-zi-ii-lcof/
 * 描述: 给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1），每段绳子的长度记为 k[0],k[1]...k[m - 1] 。
 * 请问 k[0]*k[1]*...*k[m - 1] 可能的最大乘积是多少？
 * 例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 * <P>
 * 解法: 贪心+快速幂
 */
class Offer14_2 {

    companion object{
        const val MOD = 1000000007
    }

    fun cuttingRope(n: Int): Int {
        if (n <= 3) {
            return n - 1
        }
        val a = n / 3
        val b = n % 3
        return if (b == 2) {
            (quickPow(3, a.toLong()) * b % 1000000007).toInt()
        } else {
            (quickPow(3, a - 1L) * (b + 3) % 1000000007).toInt()
        }
    }

    private fun quickPow(x: Int, n: Long): Long {
        var n = n
        var res: Long = 1
        var tt = x.toLong()
        while (n != 0L) {
            if (n and 1 == 1L) {
                res *= tt
                res %= 1000000007
            }
            tt *= tt
            tt %= 1000000007
            n /= 2
        }
        return res
    }
}