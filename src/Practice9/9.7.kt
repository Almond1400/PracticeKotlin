fun main()
{
    println("Введите строку")
    var str = readln().toCharArray()

    for (i in str.indices)
    {
        if (str[i] == str[i].uppercaseChar()) {
            str[i] = str[i].lowercaseChar()
        }
        else
            str[i] = str[i].uppercaseChar()
    }
    println(str)
}