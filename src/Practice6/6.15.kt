fun main(){
    println("Введите количество элементов")
    val arrayN = readln().toInt()
    val array = Array(arrayN, {""})
    println("Вводите элементы массива (через enter)")
    for (i in array.indices)
    {
        array[i] = readln()
    }

    if (array.contentEquals(array.reversedArray()))
        println("Массив является палиндромом")
    else
        println("Массив не является палиндромом")

}