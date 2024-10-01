fun main()
{
    val word = readln()

    if(word == word.reversed())
        println("Палиндром - ${word.reversed()}")
    else
        println("У этого слова нет палиндрома")
}