fun substring(string: String, substring: String):Boolean
{
    if (substring in string)
        return true
    else
        return false
}

fun main()
{
    println("Введите строку")
    val string = readln()
    println("Введите подстроку")
    val substring = readln()

    if (substring(string,substring))
        println("В этой строке есть подстрока")
    else
        println("В этой строке нет подстроки")
}