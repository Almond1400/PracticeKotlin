import kotlin.random.Random
fun main(){
    println("Случайные 10 чисел от 1 до 100")
    for (i in 1..10)
    {
        print("${Random.nextInt(from = 1,until = 100)} ")
    }
}