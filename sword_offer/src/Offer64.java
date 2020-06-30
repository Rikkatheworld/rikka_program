/**
 * https://leetcode-cn.com/problems/qiu-12n-lcof/
 * 求 1+2+3+...+n 要求不用乘除法、if else while switch等流程判断以及 a?b:c 条件语句
 * <p>
 * 那么排除后，只能使用 赋值、位运算、逻辑判断符，而且要用递归
 * 根据 && 的特性，用来结束递归
 */
public class Offer64 {
    public static void main(String[] args) {
        System.out.println(sumNums(20));
    }

    public static int sumNums(int n) {
        boolean flag = (n > 0) && (n = sumNums(n - 1)) > 0;
        return n;
    }
}
