import Offer10_1.ConstantObject.MOD

/**
 * 题目link: https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof/
 * 描述: 写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项。斐波那契数列的定义如下：
 * F(0) = 0,   F(1) = 1
 * F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
 * 斐波那契数列由 0 和 1 开始，之后的斐波那契数就是由之前的两数相加而得出。
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 * <P>
 * 解法: DP
 */
class Offer10_1 {
    object ConstantObject {
        const val MOD: Int = 1000000007
    }

    fun fib(n: Int): Int {
        var a = 0
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