fun listNumSum()
{
    var list = mutableListOf<Int>()
    var input = ""
    while (true){
        input = readln()
        if (input == "end")
            break
        else
            list += input.toInt()
    }
    println("Сумма списка: ${list.sum()}")
}

fun main()
{
    println("Вводите элементы списка через enter. Когда закончите, введите 'end'")
    listNumSum()
}