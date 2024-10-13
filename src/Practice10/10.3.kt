fun searchArrEl(arrayChar: CharArray, elChar: Char): String
{
    var index = 0
    for (i in arrayChar)
    {
        if (i == elChar) {
            return index.toString()
        }
        index++
    }
    return "Элемент не найден"
}
fun cezarCode(Alphabet:String, step: Int, text:String):String
{
    val alphabetArray = Alphabet.toCharArray()
    val lowerCaseText = text.lowercase()
    var translate = ""

    for (i in lowerCaseText)
    {
        when(i)
        {
            ' ' ->translate += " "
            '.' ->translate += "."
            ',' ->translate += ","
            '!' ->translate += "!"
            '?' ->translate += "?"
            else ->
            {
                var letter = searchArrEl(alphabetArray, i).toInt() + step
                if (letter > Alphabet.length)
                    letter -= Alphabet.length
                translate += alphabetArray[letter]
            }
        }
    }
    return translate
}

fun main()
{
    val ruAlphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя"
    println("Введите шаг шифра Цезаря")
    val step = readln().toInt()
    println("Введите сообщение")
    val message = readln()
    println("Ваше сообщение на шифре Цезаря:")
    println(cezarCode(ruAlphabet,step,message))
}