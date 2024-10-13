fun palyndrom(string: String): Boolean
{
    if (string == string.reversed())
        return true
    else
        return false
}

fun main(){
    println("Введите строку")
    val string = readln()
    if (palyndrom(string))
        println("Строка является палиндромом")
    else
        println("Строка не является палиндромом")
}