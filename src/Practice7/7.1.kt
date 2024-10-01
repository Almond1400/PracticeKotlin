fun main()
{
    println("Введите первое число")
    val a = readln().toDouble()
    println("Введите второе число")
    val b = readln().toDouble()
    
    println("Выберите операцию")
    println("1 - Сложение")
    println("2 - Вычитание")
    println("3 - Умножение")
    println("4 - Деление")
    val op = readln().toInt()
    var res = 0.0

    when (op)
    {
        1 -> res = a + b
        2 -> res = a - b
        3 -> res = a * b
        4 -> res = a / b
        else -> println("Неправильный ввод")
    }
    println("Результат: $res")
}