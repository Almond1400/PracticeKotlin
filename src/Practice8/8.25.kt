fun unitString(string1: String, string2: String): String
{
    val unitString = string1 +string2
    return unitString
}

fun main()
{
    println("Введите две строки")
    val s1 = readln()
    val s2 = readln()

    println("Объединенная строка: ${unitString(s1,s2)}")
}