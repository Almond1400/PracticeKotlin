fun vowelCount(string: String):Int
{
    val vowel= "АаОоУуЭэЫыЯяЁёЕеЮюИиAaEeIiOoUuYy"
    var count = 0
    for (i in string)
    {
        if (i in vowel)
            count++
    }
    return count
}

fun main()
{
    println("Введите строку")
    val string = readln()
    println("В этой строке ${vowelCount(string)} гласных")
}