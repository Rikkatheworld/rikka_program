/**
 * 题目link: https://leetcode-cn.com/problems/is-unique-lcci/
 * 描述: 实现一个算法，确定一个字符串 s 的所有字符是否全都不同。
 * <p>
 * 解法: [位运算]使用位运算，每个数为1<<n，如果目标位已经为1，则说明之前已经遇到过
 * 不过改解法应该是没有考虑到字符为1、2、3及特殊字符
 */
public class Offer01_1 {
    public boolean isUnique(String astr) {
        int sum = 0;
        int tmp;
        for (int i = 0; i < astr.length(); i++) {
            tmp = astr.charAt(i) - 'a';
            if ((sum & (1 << tmp)) != 0) return false;
            sum |= (1 << tmp);
        }
        return true;
    }
}
