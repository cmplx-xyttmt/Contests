import java.io.File
import java.io.FileOutputStream
import java.io.OutputStreamWriter
import kotlin.math.pow
import kotlin.random.Random

fun main() {
    val printStream = OutputStreamWriter(FileOutputStream(File("input.txt")))
    val random = Random(0)
    val t = 1
    val n = 100000
    printStream.appendln("$t")
    printStream.appendln("$n")
    repeat(n) {
        var num = random.nextInt(1000_000_000 - 1000, 1000_000_001)
        if (random.nextInt(1000_000_000) % 10 == 7) num = -1
        if (it < n - 1) printStream.append("$num ")
        else printStream.appendln("$num")
    }
//    printStream.appendln("${n/2}")
    printStream.close()
}