/**
 * 题目link: https://leetcode-cn.com/problems/jian-sheng-zi-lcof/
 * 描述: 给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1），每段绳子的长度记为 k[0],k[1]...k[m-1] 。
 * 请问 k[0]*k[1]*...*k[m-1] 可能的最大乘积是多少？
 * 例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18
 * <P>
 * 解法: 当一个数能被分成n份，且每份等于3，其乘积是最大的， <=4例外，因为 1*3 < 2*2
 */
class Offer14_1 {

    fun cuttingRope(n: Int): Int {
        var res = 1
        if (n == 2) return 1
        if (n == 3) return 2
        if (n == 4) return 4
        var tmpN = n

        while (tmpN > 4) {
            tmpN -= 3
            res *= 3
        }
        res *= tmpN
        return res
    }
}
