fun pyramidN(n:Int)
{
    if (n != 0)
    {
        for (i in 1..n)
        {
            var space = ""
            for (sp in 1..n-i)
                space += " "
            println()
            print(space)
            for (j in 1..2*i-1)
                print("#")
            print(space)
        }
    }
}
fun main()
{
    println("Введите n")
    val n = readln().toInt()
    pyramidN(n)
}