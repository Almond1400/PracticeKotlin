fun nListFizBizViz(n:Int):List<Any>
{
    var list = mutableListOf<Any>()

    if (n != 0) {
        for (i in 1..n){
            list += when
            {
                (i % 3 == 0) and (i % 5 != 0) -> "Физлл"
                (i % 5 == 0) and (i % 3 != 0) -> "Бизлл"
                (i % 3 == 0) and (i % 5 == 0) -> "ВизллБизлл"
                else -> i
            }
        }
    }
    return list
}

fun main()
{
    println("Введите n")
    val n = readln().toInt()
    println(nListFizBizViz(n))
}