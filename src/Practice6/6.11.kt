import java.util.*
import kotlin.random.Random

fun main()
{
    val arrayF = Array(5, { Random.nextInt(from = 0,until = 15)})
    val arrayS = Array(5, { Random.nextInt(from = 0,until = 15)})
    println(Arrays.toString(arrayF))
    println(Arrays.toString(arrayS))

    val interArray = arrayF.intersect(arrayS.toList()).toIntArray()
    println("Пересечения массивов: ${Arrays.toString(interArray)}")
}