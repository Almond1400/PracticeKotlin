import kotlin.random.Random

fun main()
{
    var matrix = arrayOf<Array<Int>>()

    for (i in 0..2)
    {
        var array = arrayOf<Int>()
        for (j in 0..2)
        {
            array += Random.nextInt(from = 0,until = 9)
        }
        matrix += array
    }

    println("Изначальная матрица: ")
    for (array in matrix) {
        for (value in array) {
            print("$value ")
        }
        println()
    }

    var Tmatrix = Array(matrix.size) { Array(matrix[0].size) { 0 } }
    for (i in matrix.indices) {
        for (j in matrix[0].indices) {
            Tmatrix[j][i] = matrix[i][j]
        }
    }

    println("Транспонированная матрица: ")

    for (array in Tmatrix) {
        for (value in array) {
            print("$value ")
        }
        println()
    }
}