fun main()
{
    println("Введите тип пищи")
    var typeFood = readln()

    when(typeFood)
    {
        "мясо" -> println("Время приготовления: 40 мин")
        "овощи" -> println("Время приготовления: 20 мин")
        "мучное" -> println("Время приготовления: 30 мин")
        "рыба" -> println("Время приготовления: 35 мин")
        else -> println("Ошибка. Такого типа пищи нет, либо время приготовления неизвестно")
    }
}