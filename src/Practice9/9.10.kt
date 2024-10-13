fun mostLongWord(string: String): String
{
    var stringWithoutPunctMarks = string.replace(",","")
    stringWithoutPunctMarks = stringWithoutPunctMarks.replace(".","")
    stringWithoutPunctMarks = stringWithoutPunctMarks.replace("!","")
    stringWithoutPunctMarks = stringWithoutPunctMarks.replace("?","")
    val words = stringWithoutPunctMarks.split(" ")

    var biggerWord = words[0]
    for (i in words)
    {
        if (stringSize(i) > stringSize(biggerWord))
            biggerWord = i
    }
    return biggerWord
}

fun main()
{
    println("Введите строку")
    val string = readln()
    if (stringSize(string.replace(" ", "")) != 0)
        println("Самое длинное слово в строке: ${mostLongWord(string)}")
    else
        println("Ошибка. Строка пустая")
}