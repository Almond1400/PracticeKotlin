fun main() {
    println("Введите растояние в футах")
    var futx = readln().toDouble()
    println("Введите расстояние в километрах")
    var metx = readln().toDouble()
    futx *= 0.305
    metx *= 1000

    if (futx == metx)
        println("Расстояния равны")
    else if(futx > metx)
        println("Расстояние в футах больше, чем в километрах")
    else
        println("Расстояние в километрах больше, чем в футах")
}