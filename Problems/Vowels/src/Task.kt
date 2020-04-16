// Posted from EduTools plugin
fun main() {
    val letter = readLine()!!
    println(when (letter.first()) {
            'A', 'a' -> "1"
            'E', 'e' -> "5"
            'I', 'i' -> "9"
            'O', 'o' -> "15"
            'U', 'u' -> "21"
            else -> "0"
        })
}