/**
 * 题目link: https://leetcode-cn.com/problems/da-yin-cong-1dao-zui-da-de-nwei-shu-lcof/
 * 描述: 输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
 * 用返回一个整数列表来代替打印
 * n 为正整数
 * <P>
 * 解法: @TODO
 */

fun main() {
    print(printNumbers(3).toList().toString())
}

fun printNumbers(n: Int): IntArray {
    val size = fastPow(10, n)
    val res = IntArray(size - 1)
    for (i in res.indices) {
        res[i] = i + 1
    }
    return res
}

fun fastPow(x: Int, n: Int): Int {
    var exponent = n
    var res = 1
    var base = x
    while (exponent > 0) {
        if (exponent % 2 == 1) {
            res *= base
        }
        exponent /= 2
        base *= base
    }
    return res
}