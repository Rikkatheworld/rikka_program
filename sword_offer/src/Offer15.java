/**
 * 题目link: https://leetcode-cn.com/problems/er-jin-zhi-zhong-1de-ge-shu-lcof/
 * 描述: 请实现一个函数，输入一个整数，输出该数二进制表示中 1 的个数。例如，把 9 表示成二进制是 1001，有 2 位是 1。因此，如果输入 9，则该函数输出 2。
 * <p>
 * 解法: >>带符号右移 高位如果是1，则移位完后，高位还是1
 * >>> 无符号右移 高位如果是1，则移位完后，高位是0
 * 使用 n & (n - 1) 可以快速定位到下一个1在哪里
 */
public class Offer15 {

    public static void main(String[] args) {
        System.out.println(hammingWeight(0));
    }

    public static int hammingWeight(int n) {
        int res = 0;
        while (n != 0) {
            res++;
            n = n & (n - 1);
        }
        return res;
    }
}
