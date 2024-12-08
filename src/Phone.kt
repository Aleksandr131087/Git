abstract class Phone(val model: String, var price: Double) {
    var soldCount = 0

    fun sell() {
        soldCount++
    }
}