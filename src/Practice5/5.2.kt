fun main()
{
    var i = 0

    while (i <= 20)
    {
        i++
        if (i % 2 != 0)
            continue

        println(i)
    }
}