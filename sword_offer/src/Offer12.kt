import com.sun.org.apache.xpath.internal.operations.Bool

/**
 * 题目link: https://leetcode-cn.com/problems/ju-zhen-zhong-de-lu-jing-lcof/
 * 描述: 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。路径可以从矩阵中的任意一格开始，
 * 每一步可以在矩阵中向左、右、上、下移动一格。如果一条路径经过了矩阵的某一格，那么该路径不能再次进入该格子。
 *
 * 例如，在下面的3×4的矩阵中包含一条字符串“bfce”的路径（路径中的字母用加粗标出）。
 * [["a","b","c","e"],
 * ["s","f","c","s"],
 * ["a","d","e","e"]]
 * 但矩阵中不包含字符串“abfb”的路径，因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，路径不能再次进入这个格子。
 * <P>
 * 解法: DFS来做吧
 */
class Offer12 {
    var isFound = false;
    val dx = arrayListOf<Int>(0, 1, 0, -1)
    val dy = arrayListOf<Int>(1, 0, -1, 0)
    var n = 0
    var m = 0

    fun exist(board: Array<CharArray>, word: String): Boolean {
        val c = word[0]
        n = board.size
        m = board[0].size
        for (i in board.indices) {
            for (j in board[0].indices) {
                if (c == board[i][j]) {
                    val isVisited = Array(n) { BooleanArray(m) }
                    isVisited[i][j] = true
                    startDfs(i, j, board, word, 1, isVisited)
                }
                if (isFound) {
                    break
                }
            }
            if (isFound) {
                break
            }
        }
        return isFound
    }

    private fun startDfs(i: Int, j: Int, board: Array<CharArray>, word: String, count: Int, isVisited: Array<BooleanArray>) {
        if (count == word.length || isFound) {
            isFound = true
            return
        }

        for (ii in dx.indices) {
            val tmpX = i + dx[ii]
            val tmpY = j + dy[ii]
            if (tmpX < 0 || tmpX > n - 1 || tmpY < 0 || tmpY > m - 1) continue
            if (isVisited[tmpX][tmpY]) continue

            if (word[count] != board[tmpX][tmpY]) continue
            isVisited[tmpX][tmpY] = true
            startDfs(tmpX, tmpY, board, word, count + 1, isVisited)
            isVisited[tmpX][tmpY] = false
        }

    }
}