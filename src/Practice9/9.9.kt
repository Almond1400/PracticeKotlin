fun generetedPassword(size: Int): String
{
    val UpCaseLet = ('A'..'Z').toList()
    val LowCaseLet = ('a'..'z').toList()
    val dig = (1..9).toList()
    val specSymbols = listOf('!', '@', '#', '$', '%', '^', '[', ']', ':', ';', '"', '\'',
        '<', '&', '*', '(', ')', '-', '_', '=', '+', '{', '}', '>', ',', '.', '?', '/')
    val Symbols = UpCaseLet + LowCaseLet + dig + specSymbols

    var password = ""
    for (i in 1..size)
        password += Symbols.random()
    return password
}

fun main()
{
    println("Введите длину пароля")
    val passwordSize = readln().toInt()
    println("Сгенерированный пароль: ${generetedPassword(passwordSize)}")
}