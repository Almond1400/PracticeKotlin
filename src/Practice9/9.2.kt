fun consonantCount(string: String):Int
{
    val consonant= "БбВвГгДдЖжЗзЙйКкЛлМмНнПпРрСсТтФфХхЦцЧчШшЩщBbCcDdFfGgHhJjKkLlMmNnPpQqRrSsTtVvWwXxZz"
    var count = 0
    for (i in string)
    {
        if (i in consonant)
            count++
    }
    return count
}

fun main()
{
    println("Введите строку")
    val string = readln()
    println("В этой строке ${vowelCount(string)} гласных и ${consonantCount(string)} согласных")
    //vowelCount() была создана в файле 8.41.kt
}