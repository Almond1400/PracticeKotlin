fun gNumgle(num: Int)
{
    var google = "G"
    for (i in 1.. num)
        google += "o"
    google += "gle"
    println(google)
}

fun main()
{
    println("Введите количество O")
    val num = readln().toInt()
    gNumgle(num)
}