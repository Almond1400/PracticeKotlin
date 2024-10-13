fun delSpaceInString(string: String):String
{
    val newString = string.replace(" ", "")
    return newString
}

fun main()
{
    println("Введите строку")
    val string = readln()

    println("Строка без пробелов")
    println(delSpaceInString(string))

}