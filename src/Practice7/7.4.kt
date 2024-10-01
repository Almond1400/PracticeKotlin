import kotlin.random.Random

// P - пики, B - бубны, T - трефы, кресты, C - червы

val Deck = mutableListOf("6P","7P","8P","9P","10P","JP","DP","KP","AP",
    "6B","7B","8B","9B","10B","JB","DB","KB","AB",
    "6T","7T","8T","9T","10T","JT","DT","KT","AT",
    "6C","7C","8C","9C","10C","JC","DC","KC","AC")
var bid = 0

class Player
{
    var numpl:Int = 0
    var bank:Int = 0
    var card = Array(5){""}
    var banker = false
    var score = 0
    var numCard = 0
    var win = false
    var lose = false
    fun playerActions()
    {

        if (banker)
        {
            while (true)
            {
                println("Карты банкира: ${card.joinToString()}")
                score += scoreCard(card[numCard-1])
                if (score >= 17)
                {
                    if (score > 21)
                        lose = true
                    break
                }


                println("Банкир введите 1, чтобы вытащить новую карту")
                if (readln() == "1")
                {
                    card[numCard] = Deck[Random.nextInt(0, 35)]
                    numCard++
                }
            }
        }
        else
        {
            score += scoreCard(card[numCard-1])
            while (true) {
                if (score > 21)
                {
                    println("Игрок $numpl, вы проиграли")
                    lose = true
                    break
                }
                else if (score == 21)
                {
                    println("Игрок $numpl, вы выиграли")
                    win = true
                    break
                }

                println("Игрок $numpl, ваши карты: ${card.joinToString()}")
                println("Игрок $numpl, выберите действие")
                println("1 - взять карту")
                println("2 - стоп")
                println("3 - сделать ставку")
                val action = readln().toInt()

                when (action) {
                    1 -> {
                        card[numCard] = Deck[Random.nextInt(0, 35)]
                        numCard++
                        score += scoreCard(card[numCard-1])
                    }
                    2 -> {
                        if (bid == 0)
                            println("Сначала сделайте ставку!")
                        else
                            break
                    }
                    3 -> {
                        while (true) {
                            println("Введите сумму ставки")
                            val tmp = readln().toInt()
                            if ((bank-tmp) < 0) {
                                println("У вас нет столько денег в банке. Ваш баланс: $bank. Введите ставку снова")
                                continue
                            }
                            else {
                                bid += tmp
                                break
                            }
                        }

                    }

                }
            }
        }

    }

}
fun scoreCard(card: String): Int
{
    when(card) {
        "6P","6B","6T","6C" -> return 6
        "7P","7B","7T","7C" -> return 7
        "8P","8B","8T","8C" -> return 8
        "9P","9B","9T","9C" -> return 9
        "10P","10B","10T","10C" -> return 10
        "JP","JB","JT","JC" -> return 2
        "DP","DB","DT","DC" -> return 3
        "KP","KB","KT","KC" -> return 4
        "AP","AB","AT","AC" -> return 11
        else -> return 0
    }
}

fun main()
{


    println("Игра 21 очко\n")
    println("игрок 1, введите свой банк")
    val pl1 = Player()
    pl1.numpl = 1
    pl1.bank = readln().toInt()
    println("игрок 2, введите свой банк")
    val pl2 = Player()
    pl2.numpl = 2
    pl2.bank = readln().toInt()

    fun issuanceCard()
    {
        pl1.card[0] = Deck[Random.nextInt(0, 35)]
        pl1.numCard++
        pl2.card[0] = Deck[Random.nextInt(0, 35)]
        pl2.numCard++
    }

    val Banker = Random.nextInt(1, 3)
    println("Игрок ${Banker} теперь банкир")
    when(Banker)
    {
        1 -> pl1.banker = true
        2 -> pl2.banker = true
    }

    fun whoWin(pl1Score:Int, pl2Score:Int)
    {
        if (pl1Score > pl2Score)
            pl1.win = true
        else
            pl2.win = true
    }

    while (true)
    {
        pl1.win = false
        pl2.win = false
        println("Выдача карт")
        issuanceCard()
        if (pl2.banker) {
            pl1.playerActions()
            if (pl1.win || pl1.lose)
            {
                if (pl1.lose)
                    pl2.win = true
            }
            else
                pl2.playerActions()
        }
        else {
            pl2.playerActions()
            if (pl2.win || pl2.lose)
            {
                if (pl2.lose)
                    pl1.win = true
            }
            else
                pl1.playerActions()
        }
        if ((!pl1.win and !pl2.win))
            whoWin(pl1.score, pl2.score)
        if (pl1.win)
        {
            println("Игрок 1 выиграл")
            pl2.bank -= bid
            bid *= 2
            pl1.bank += bid
            bid = 0
        }
        else if (pl2.win)
        {
            println("Игрок 2 выиграл")
            pl2.bank -= bid
            bid *= 2
            pl1.bank += bid
            bid = 0
        }

        pl1.score = 0
        pl2.score = 0
        pl1.card = Array(5){""}
        pl2.card = Array(5){""}
        pl1.numCard = 0
        pl2.numCard = 0
        pl1.win = false
        pl2.win = false
        pl1.lose = false
        pl2.lose = false
        println("Хотите сыграть ещё раз? (да/нет)")
        when(readln())
        {
            "да" -> continue
            "нет" -> break
            else -> break
        }
    }
    println("Результат:")
    println("Игрок 1 счёт: ${pl1.bank}")
    println("Игрок 2 счёт: ${pl2.bank}")
}