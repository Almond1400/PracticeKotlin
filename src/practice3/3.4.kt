fun main()
{
    println("Введите два числа")
    var a = readln().toInt()
    var b = readln().toInt()

    if (a % b != 0)
        println("Числа не делятся. Остаток: ${a%b}")
    else
        println("Числа делятся.")
}