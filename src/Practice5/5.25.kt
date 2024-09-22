fun main()
{
    println("Кубы чисел от 1 до 10:")
    for (i in 1.. 10)
    {
        print("${Math.pow(i.toDouble(), 3.0)} ")
    }
}