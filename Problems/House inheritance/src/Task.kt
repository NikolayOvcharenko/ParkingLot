// Posted from EduTools plugin
fun main() {
    val rooms = readLine()!!
    val price = readLine()!!
    val house = createHouse(rooms, price)
    println(totalPrice(house))
}
fun totalPrice(house: House): Int {
    val price = house.price * house.coefficient
    return price.toInt()
}
fun createHouse(rooms: String, price: String): House {
    val houses = House(rooms.toInt(), price.toInt())
    if (houses.price < 0) houses.price = 0
    when {
        rooms.toInt() in 2..3 -> {
            houses.tipes = "Bungalow"
            houses.coefficient = 1.2
        }
        rooms.toInt() == 4 -> {
            houses.tipes = "Cottage"
            houses.coefficient = 1.25
        }
        rooms.toInt() in 5..7 -> {
            houses.tipes = "Mansion"
            houses.coefficient = 1.4
        }
        rooms.toInt() > 7 -> {
            houses.tipes = "Palace"
            houses.coefficient = 1.6
        }
    }
    return houses
}
open class House(var rooms: Int, var price: Int) {
    var tipes = "Cabin"
    var coefficient = 1.0
}
