import struct.TreeNode
import java.util.*

/**
 * 题目link: https://leetcode-cn.com/problems/zhong-jian-er-cha-shu-lcof/
 * 描述: 输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * <p>
 * 解法: 用栈去做
 */

class Offer07 {

    fun buildTree(preorder: IntArray, inorder: IntArray): TreeNode? {
        if (preorder.size != inorder.size || preorder.isEmpty() || inorder.isEmpty())
            return null
        var root = TreeNode(preorder[0])
        val stack = Stack<TreeNode>()
        stack.push(root)
        val length = preorder.size
        var inorderIndex = 0
        var preorderVal = 0
        for (i in 1 until length) {
            preorderVal = preorder[i]
            var tmpNode = stack.peek()
            if (tmpNode.`val` != inorder[inorderIndex]) {
                stack.push(tmpNode.left)
            } else {
                while (!stack.isEmpty() && stack.peek().`val` == inorder[inorderIndex]) {
                    tmpNode = stack.pop()
                    inorderIndex++
                }
                tmpNode.right = TreeNode(preorderVal)
                stack.push(tmpNode.right)
            }
        }
        return root
    }

}