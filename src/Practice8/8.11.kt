fun equRes(equation: String):Double
{
    var res = 0.0
    when
    {
        equation.contains("*") -> {
            val num = equation.split("*")
            res += num[0].toDouble() * num[1].toDouble()
        }
        equation.contains("/") -> {
            val num = equation.split("/")
            res += num[0].toDouble() / num[1].toDouble()
        }

        equation.contains("+") -> {
            val num = equation.split("+")
            res += num[0].toDouble() + num[1].toDouble()
        }
        equation.contains("-") -> {
            val num = equation.split("-")
            res += num[0].toDouble() - num[1].toDouble()
        }
    }
    return res
}

fun main()
{
    println("Введите уравнение")
    val equation = readln()
    println("$equation = ${equRes(equation)}")
}