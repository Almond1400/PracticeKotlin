fun upCaseStr(string: String):String
{
    var arStr = string.toCharArray()
    var upString = ""
    for (i in arStr.indices)
    {
        upString += arStr[i].uppercaseChar()
    }

    return upString
}


fun main()
{
    println("Введите строку")
    var str = readln()
    println(upCaseStr(str))
}