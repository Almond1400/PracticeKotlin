fun main()
{
    println("Для завершения введите 'стоп'")
    while (true)
    {
        println("Введите две цифры")
        val input = readln()
        var fnum = 0
        if (input == "стоп")
            break
        else
            fnum = input.toInt()

        val snum = readln().toInt()

        if((fnum > 9) or (fnum < 0) or (snum > 9) or (snum < 0)) {
            println("Неправильный ввод")
            continue
        }

        println("Сложение или умножение?")
        println("1. Сложение. 2. Умножение")
        val quest = readln().toInt()
        when (quest) {
            1 -> println("Cумма: ${fnum + snum}")
            2 -> println("Произведение: ${fnum*snum}")
            else -> println("Неправильный ввод")
        }
    }
}