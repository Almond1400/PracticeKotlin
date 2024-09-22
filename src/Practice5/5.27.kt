fun main()
{
    println("Введите число N")
    val N = readln().toInt()

    for (i in 1.. N)
    {
        for (j in 1..i)
            print("$i\t")
        println()
    }
}