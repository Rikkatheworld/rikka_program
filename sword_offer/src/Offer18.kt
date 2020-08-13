import struct.ListNode

/**
 * 题目link: https://leetcode-cn.com/problems/shan-chu-lian-biao-de-jie-dian-lcof/
 * 描述: 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
 * 返回删除后的链表的头节点。
 * <P>
 * 解法: @TODO
 */
class Offer18 {
    fun deleteNode(head: ListNode?, `val`: Int): ListNode? {
        if (head == null) return null
        var tmpHead = head
        var nextHead = ListNode(0)
        nextHead.next = tmpHead

        // 处理第一个就要删除的
        if (tmpHead.`val` == `val`) {
            return if (tmpHead.next == null) null else tmpHead.next
        }

        while (tmpHead != null) {
            if (tmpHead.next != null && tmpHead.next.`val` == `val`) {
                tmpHead.next = tmpHead.next.next
                return nextHead.next
            }
            tmpHead = tmpHead.next
        }
        return head
    }
}