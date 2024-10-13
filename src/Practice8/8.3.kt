fun unitListInt(list1: List<Int>, list2: List<Int>): List<Int>
{
    val unitList = list1+list2
    return unitList
}

fun main()
{
    val list1 = listOf(1,2,4,8,16)
    val list2 = listOf(32, 64, 128, 256, 512)

    println("Первый лист: $list1")
    println("Второй лист: $list2")
    println("Объединенный лист: ${unitListInt(list1, list2)}")
}