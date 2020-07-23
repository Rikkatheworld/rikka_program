import struct.ListNode;

/**
 * 题目link: https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/
 * 描述: 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 * <p>
 * 解法: 反转列表
 */
public class Offer06 {
    public int[] reversePrint(ListNode head) {
        ListNode tmpHead;
        ListNode reversHead = null;
        int cnt = 0;
        while (head != null) {
            cnt++;
            tmpHead = head.next;
            head.next = reversHead;
            reversHead = head;
            head = tmpHead;
        }
        int[] res = new int[cnt];
        cnt = 0;
        while (reversHead != null) {
            res[cnt++] = reversHead.val;
            reversHead = reversHead.next;
        }
        return res;
    }
}
