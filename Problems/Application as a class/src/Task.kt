// Posted from EduTools plugin
class Application(val name: String) {
    fun run(array: Array<String>) { // write the run method here
        println(name)
        for (i in array) println(i)
    }
}
