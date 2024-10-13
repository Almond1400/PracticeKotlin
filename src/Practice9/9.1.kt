import kotlin.random.Random

fun main()
{
    println("Сгенерированные числа от 1 до 100:")
    for(i in 1..10)
    {
        print("${Random.nextInt(1, 100)} ")}
}