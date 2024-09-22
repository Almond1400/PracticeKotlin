fun main()
{
    println("Введите N чисел Фибоначчи")
    var N = readln().toInt()
    var a = 0
    var b = 1
    var c = 0

    for (i in 1..N)
    {
        print("$a ")
        c = a + b
        a = b
        b = c
    }
}