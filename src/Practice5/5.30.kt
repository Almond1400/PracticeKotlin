fun main()
{
    println("Введите число")
    var num = readln().toInt()

    var binNum = ""
    var tmp = 0
    while (num != 0)
    {
        tmp = num % 2
        binNum += tmp.toString()
        num /= 2
    }
    binNum.reversed()
    println("Это число в двоичной системе: $binNum")
}