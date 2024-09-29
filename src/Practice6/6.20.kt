fun main()
{
    println("Введите первое число")
    var n = readln().toInt()
    println("Введите шаг")
    val step = readln().toInt()
    println("Введите количество чисел в последовательности")
    val x = readln().toInt()
    val array = Array(x, {n})

    print(array.joinToString())
}