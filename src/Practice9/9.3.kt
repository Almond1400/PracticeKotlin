fun main()
{
    println("Конвертация валют из евро в фунты-стерлинги")
    val f = 0.84

    println("Введите евро")
    val euro = readln().toDouble()
    println("$euro евро = ${euro*f} фунтов-стерлингов")
}