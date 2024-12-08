class CityStore : Store {
    private val phones = listOf(PhoneModel("Model A1", 500.0), PhoneModel("Model A2", 700.0))

    override fun welcome() {
        println("Добро пожаловать в магазин города A!")
    }

    override fun choosePhone(): Phone? {
        println("Выберите модель телефона:")
        phones.forEachIndexed { index, phone -> println("${index + 1}. ${phone.model} - ${phone.price} руб.") }
        val choice = readLine()?.toIntOrNull() ?: return null
        return if (choice in 1..phones.size) phones[choice - 1] else null
    }

    override fun showStatistics() {
        phones.forEach { println("${it.model}: продано ${it.soldCount} шт.") }
    }
}