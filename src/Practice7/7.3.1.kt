fun pointGame(win: Int, lose: Int, draw: Int): Int
{
    val points = win*3 + draw
    return points
}

fun main()
{
    println("Введите количество побед")
    val win = readln().toInt()
    println("Введите количество ничьих")
    val draw = readln().toInt()
    println("Введите количество проигрышей")
    val lose = readln().toInt()

    println("Количество очков: ${pointGame(win, draw, lose)}")
}