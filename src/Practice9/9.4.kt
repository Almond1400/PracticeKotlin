fun anagramm(s1:String, s2:String)
{

    s1.replace(" ","")
    s2.replace(" ", "")

    if (s1.length == s2.length)
    {
        val arrayStr1 = s1.toCharArray()
        val arrayStr2 = s2.toCharArray()
        arrayStr1.sort()
        arrayStr2.sort()

        if (arrayStr1.contentEquals(arrayStr2))
            println("Строки являются анаграммами")
        else
            println("Строки не являются анаграммами")
    }
    else
        println("Строки не являются анаграммами")
}

fun main()
{
    println("Введите две строки")
    val s1 = readln()
    val s2 = readln()
    anagramm(s1, s2)
}