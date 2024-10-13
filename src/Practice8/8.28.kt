fun createArray(n: Int): Array<Int> {
    var array = Array(n) { 0 }
    var el = 1
    for (i in 0..<n){
        array[i] = el
        el++
    }
    return array
}

fun main()
{
    println("Введите размер массива")
    val n = readln().toInt()
    println(createArray(n).joinToString())
}