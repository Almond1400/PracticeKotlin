fun main(){
    println("Введите строку")
    var s = readln()
    s.replace(" ", "")

    if (s.reversed() == s)
        println("Строка является палиндромом")
    else
        println("Строка не является палиндромом")

}