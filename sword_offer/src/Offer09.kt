import java.util.*

/**
 * 题目link: https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/
 * 描述: 用两个栈实现一个队列。队列的声明如下，
 * 请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
 * <P>
 * 解法: 一个栈做栈，一个栈做队列，加元素里往栈里面加，出列时往队列里面塞
 */
class CQueue() {
    var stack = Stack<Int>()
    var queue = Stack<Int>()

    fun appendTail(value: Int) {
        stack.add(value)
    }

    fun deleteHead(): Int {
        if (stack.isEmpty() && queue.isEmpty())
            return -1

        if (!queue.isEmpty()) {
            return queue.pop()
        }

        while (!stack.isEmpty()) {
            queue.push(stack.pop())
        }
        return queue.pop();
    }

}