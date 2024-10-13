fun listMaxMinusMin()
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
    println("Разность самого большого и самого маленького числа: ${list.max() - list.min()}")
}


fun main()
{
    println("Вводите элементы списка через enter. Когда закончите, введите 'end'")
    listMaxMinusMin()
}