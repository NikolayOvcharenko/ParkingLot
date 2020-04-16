// Posted from EduTools plugin
fun main() {
    val productType = readLine()!!
    val price = readLine()!!
    val product = Product(price.toInt())
    println(totalPrice(product, productType))
}
fun totalPrice(product: Product, productType: String): Int {
        // var productTax = 0.0
        when (productType) {
            "headphones" -> product.productTax = 0.11
            "smartphone" -> product.productTax = 0.15
            "tv" -> product.productTax = 0.17
            "laptop" -> product.productTax = 0.19
        }
    val total = product.price.toDouble() * (1 + product.productTax)
        return total.toInt()
}
data class Product(val price: Int) {
    var productTax = 0.0
}
