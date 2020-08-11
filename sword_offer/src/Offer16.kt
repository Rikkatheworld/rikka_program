/**
 * 题目link: https://leetcode-cn.com/problems/shu-zhi-de-zheng-shu-ci-fang-lcof/
 * 描述: 实现函数double Power(double base, int exponent)，
 * 求base的exponent次方。不得使用库函数，同时不需要考虑大数问题。
 * <P>
 * 解法: 快速幂 注意SB边界
 */

//-2147483648
fun main() {
    print(myPow(-1.0, -2147483648))
}

fun myPow(x: Double, n: Int): Double {
    if (n == 0 || x == 1.0) return 1.0
    if (x == -1.0) return if (n % 2 == 0) 1.0 else -1.0
    var exponent = n
    val xFlag = n > 0
    var nFlag = false
    if (n < 0) {
        nFlag = true
        if (exponent == Integer.MIN_VALUE) {
            return 0.0
        }
        exponent *= -1
    }
    var res = 1.0
    var base = x
    while (exponent > 0) {
        if (exponent % 2 == 1) {
            res *= base
        }
        exponent /= 2
        base *= base
    }

    return if (nFlag) {
        1 / res * if (n % 2 == 1 && !xFlag) -1 else 1
    } else {
        res * if (n % 2 == 1 && !xFlag) -1 else 1
    }
}

class Offer16 {

}