
fun main() {

    var running = true
    val storeA = CityStore()
    val storeB = CityStore() // Предполагается, что аналогичный класс для магазина в городе B также существует.

    while (running) {
        println("Выберите город: 1. Город A 2. Город B 3. Выход")
        when (readLine()) {
            "1" -> handleStore(storeA)
            "2" -> handleStore(storeB)
            "3" -> running = false
        }
    }
}

fun handleStore(store: Store) {
    store.welcome()
    var visiting = true
    while (visiting) {
        val phone = store.choosePhone()
        if (phone != null) {
            phone.sell()
            println("Вы купили ${phone.model} за ${phone.price} руб.")
            store.showStatistics()
        }
        println("Хотите продолжить покупки? (да/нет)")
        visiting = readLine()?.toLowerCase() == "да"
    }
}