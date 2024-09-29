import kotlin.random.Random

fun arrayPro(array: Array<Int>) {
    var pro = 1
    for (i in array){
        pro *= i
    }
    println(pro)
}

fun main()
{
    val array = Array(5, { Random.nextInt(from = 1,until = 20)})
    println("Массив: ")
    println(array.joinToString())

    print("Сумма всех элементов массива: ")
    arraySum(array)
    print("Произведение всех элементов массива: ")
    arrayPro(array)
}