import kotlin.random.Random

fun main()
{
    val numberRan = Random.nextInt(from = 1,until = 100)
    println("Угадайте число от 1 до 100")
    val numberU = readln().toInt()

    if (numberU == numberRan)
        println("Вы угадали!")
    else
        println("Вы не угадали.")

}