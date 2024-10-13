fun reverseStr(string: String):String
{
    var arStr = string.toCharArray()
    var reString = ""
    var i = arStr.size-1
    while (i >= 0)
    {
        reString += arStr[i]
        i--
    }

    return reString
}


fun main()
{
    println("Введите строку")
    var str = readln()
    println(reverseStr(str))
}