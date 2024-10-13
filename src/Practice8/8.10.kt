fun repeatString(txt: String, n: Int): String
{
    if (n == 1)
        return txt
    return txt + repeatString(txt,n-1)
}

fun main()
{
    println("Введите строку и количество повторений")
    val txt = readln()
    val n = readln().toInt()
    print(repeatString(txt, n))

}