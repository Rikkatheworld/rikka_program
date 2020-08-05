/**
 * 题目link: https://leetcode-cn.com/problems/qing-wa-tiao-tai-jie-wen-ti-lcof/
 * 描述: 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 *
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 * <p>
 * 解法:
 */
class Offer10_2 {
    object ConstantObject {
        const val MOD: Int = 1000000007
    }

    fun numWays(n: Int): Int {
        var a = 1
        var b = 1
        if (n == 0) return a
        if (n == 1) return b

        for (i in 2..n) {
            b += a
            a = b - a
            b %= ConstantObject.MOD
        }
        return b
    }
}