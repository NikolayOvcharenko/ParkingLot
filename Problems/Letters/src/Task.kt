// Posted from EduTools plugin
import java.util.*

fun main() {
    val letters = mutableMapOf(1 to "null", 2 to "null", 3 to "null", 4 to "null")
    val scan = Scanner(System.`in`)
    do {
        val scanNum = scan.next()
        for (i in 3 downTo 1) {
            letters[i + 1] = letters[i].toString()
        }
        letters[1] = scanNum
    } while (scanNum != "z")
    print(letters[4])
}