import java.lang.StringBuilder

/**
 * 题目link: https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/
 * 描述: 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 * <P>
 * 解法:
 */
class Offer05 {
    fun replaceSpace(s: String): String {
        val newStr = StringBuilder()
        for (i in s.indices) {
            if (s[i] != ' ') {
                newStr.append(s[i])
            } else {
                newStr.append("%20")
            }
        }
        return newStr.toString()
    }
}