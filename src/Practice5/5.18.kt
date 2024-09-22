fun main()
{
    println("Введите высоту треугольника")
    val N = readln().toInt()

    for (i in 1.. N)
    {
        for (j in 1..i)
            print("#")
        println()
    }
}