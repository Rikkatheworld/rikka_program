/**
 * 题目link: https://leetcode-cn.com/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/
 * 描述: 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
 * <p>
 * 解法: [遍历]优化代码，使用取余操作一次遍历过
 */
public class Offer58_2 {
    public static void main(String[] args) {
        System.out.println(reverseLeftWords("abcdefg", 2));
    }

//    public static String reverseLeftWords(String s, int n) {
//        char[] chars = s.toCharArray();
//        StringBuilder st = new StringBuilder();
//        for (int i = n; i < s.length(); i++) {
//            st.append(chars[i]);
//        }
//        for (int i = 0; i < n; i++) {
//            st.append(chars[i]);
//        }
//        return st.toString();
//    }

    public static String reverseLeftWords(String s, int n) {
        char[] chars = s.toCharArray();
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            st.append(chars[(i + n) % s.length()]);
        }
        return st.toString();
    }

}
