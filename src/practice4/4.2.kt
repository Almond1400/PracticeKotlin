fun main()
{
    println("Сначало ведите большую сторону треугольника, потом меньшие")
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    var t = 0

    if (a*a == b*b + c*c)
        t = 1
    else if (a*a > b*b + c*c)
        t = 2
    else
        t = 3

    when(t)
    {
        1 -> println("Треугольник прямоугольник")
        2 -> println("Треугольник тупоугольный")
        3 -> println("Треугольник остроугольник")
    }
}