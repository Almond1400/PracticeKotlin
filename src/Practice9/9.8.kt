import kotlin.random.Random

fun main()
{
    println("Игра 'Угадай число'\n")
    val num = Random.nextInt(1, 100)
    while (true)
    {
        println("Введите число")
        val n = readln().toInt()
        if (n == num) {
            println("Вы угадали!")
            break
        }
        else
        {
            if (n > num)
                println("Вы не угадали, но предположенное число больше загаданного числа")
            else
                println("Вы не угадали, но предположенное число меньше загаданного числа")
        }
    }
}