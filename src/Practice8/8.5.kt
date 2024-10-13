fun probPrizePay2(prob:Int, prize:Int, pay: Int):Boolean
{
    if ((prob * prize) > pay)
        return true
    else
        return false
}

fun main()
{
    println("Введите prob")
    val prob = readln().toInt()
    println("Введите prize")
    val prize = readln().toInt()
    println("Введите pay")
    val pay = readln().toInt()
    println("Результат: ${probPrizePay2(prob, prize, pay)}")
}