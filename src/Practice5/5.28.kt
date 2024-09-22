fun main(){
    println("Введите количество чисел")
    val N = readln().toInt()

    var numbers = emptyArray<Int>()
    println("Введите $N чисел")

    for (i in 0..N-1)
    {
        numbers += readln().toInt()
    }
    numbers.sort()
    for (i in 0..N-1)
    {
        print("${numbers[i]} ")
    }


}