import kotlin.math.max

class UnionFind(n: Int) {
    private val link = MutableList(n + 1) { index -> index }
    private val size = MutableList(n + 1) { 1 }

    private fun find(xx: Int): Int {
        var x = xx
        while (x != link[x]) x = link[x]
        return x
    }

    fun same(a: Int, b: Int): Boolean {
        return find(a) == find(b)
    }

    fun size(a: Int): Int {
        return size[find(a)]
    }

    fun unite(a: Int, b: Int) {
        var aa = find(a)
        var bb = find(b)
        if (size[aa] < size[bb]) aa = bb.apply { bb = aa }
        size[aa] += size[bb]
        link[bb] = aa
    }
}

//class SegmentTree(private val size: Int) {
//
//    private val tree = MutableList(2 * size + 1) { 0 }
//
//    fun add(p: Int, value: Int) {
//        var position = p + size
//        tree[position] += value
//        position /= 2
//        while (position >= 1) {
//            tree[position] = tree[2 * position] + tree[2 * position + 1]
//            position /= 2
//        }
//    }
//
//    fun maxInRange(aa: Int, bb: Int): Int {
//        var maxNum = 0
//        var a = aa + size
//        var b = bb + size
//        while (a <= b) {
//            if (a % 2 == 1) maxNum = max(tree[a++], maxNum)
//            if (b % 2 == 0) maxNum = max(tree[b--], maxNum)
//            a /= 2
//            b /= 2
//        }
//
//        return maxNum
//    }
//}