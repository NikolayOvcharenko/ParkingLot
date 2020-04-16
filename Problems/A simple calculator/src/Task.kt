// Posted from EduTools plugin
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextLong()
    val operator = scanner.next().first()
    val b = scanner.nextLong()
    if (operator == '/' && b.toInt() == 0) {
        println("Division by 0!")
    } else {
        println(when (operator) {
            '+' -> "${a + b}"
            '-' -> "${a - b}"
            '/' -> "${a / b}"
            '*' -> "${a * b}"
            else -> "Unknown operator"
        })
    } // write your code here
}
