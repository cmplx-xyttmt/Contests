import java.io.File
import java.io.FileInputStream
import java.io.InputStreamReader

fun main() {

}

// Input Reader
private fun readLn() = readLine()!!
// Read from file
//private val inputReader = InputStreamReader(FileInputStream(File("input.txt")))
//private val lines = inputReader.readLines()
//private var currLine = -1
//private fun readLn(): String {
//    currLine++
//    return lines[currLine]
//}

private fun readStrings() = readLn().trim().split(" ")
private fun readInt() = readLn().toInt()
private fun readInts() = readStrings().map { it.toInt() }