fun frameTime(min: Int, FPS: Int):Int
{
    val frames = FPS * (min*60)
    return frames
}

fun main()
{
    println("Введите FPS")
    val fps = readln().toInt()
    println("Введите минуты")
    val min = readln().toInt()
    println("Количество кадров за это время: ${frameTime(min, fps)}")
}