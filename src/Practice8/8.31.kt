fun CinF(Celsius: Double): Double
{
    return Celsius*9/5+32
}
fun main()
{
    println("Введите градусы в Цельсиях")
    val c = readln().toDouble()
    println("Градусы в Фаренгейтах: ${CinF(c)}")
}