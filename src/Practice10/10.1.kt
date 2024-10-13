fun nList(n:Int):List<Int>
{
    var list = mutableListOf<Int>()

    if (n != 0) {
        var i = n
        while (i>=1) {
            list += i
            i--
        }
    }
    return list
}

fun main()
{
    println("Введите n")
    val n = readln().toInt()
    println(nList(n))
}