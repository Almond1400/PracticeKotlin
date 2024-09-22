fun main()
{
    println("Введите группу крови")
    val groupBl = readln()

    when(groupBl)
    {
        "O" -> println("Можно отдавать: O, A, B, AB. Можно принимать: O")
        "A" -> println("Можно отдавать: A, AB. Можно принимать: O, A")
        "B" -> println("Можно отдавать: B, AB. Можно принимать: O, B")
        "AB" -> println("Можно отдавать: AB. Можно принимать: O, A, B, AB")
        else -> println("Ошибка ввода")
    }
}