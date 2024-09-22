fun main()
{
    println("Введите длину трех сторон треугольника")
    var a = readln().toDouble()
    var b = readln().toDouble()
    var c = readln().toDouble()

    if ((a > (b+c)) or (b > (a+c)) or (c > (a+b)))
        println("Треугольник не существует")
    else
        println("Треугольник существует")
}