package machine

const val WATER_PER_CUP_ESPRESSO = 250
const val BEANS_PER_CUP_ESPRESSO = 16
const val ESPRESSO_COSTS = 4

const val WATER_PER_CUP_LATTE = 350
const val MILK_PER_CUP_LATTE = 75
const val BEANS_PER_CUP_LATTE = 20
const val LATTE_COSTS = 7

const val WATER_PER_CUP_CAPPUCCINO = 200
const val MILK_PER_CUP_CAPPUCCINO = 100
const val BEANS_PER_CUP_CAPPUCCINO = 12
const val CAPPUCCINO_COSTS = 6

const val ACTION_FILL = "fill"
const val ACTION_TAKE = "take"
const val ACTION_BUY = "buy"
const val ACTION_REMAINING = "remaining"
const val ACTION_EXIT = "exit"

const val ESPRESSO_CODE = "1"
const val LATTE_CODE = "2"
const val CAPPUCCINO_CODE = "3"
const val BACK_CODE = "back"

var waterAmount = 400
var milkAmount = 540
var beansAmount = 120
var moneyAmount = 550
var cupsAmount = 9

fun remaining() {
    println(
        """
        The coffee machine has:
        $waterAmount ml of water
        $milkAmount ml of milk
        $beansAmount g of coffee beans
        $cupsAmount disposable cups
        $${moneyAmount} of money
    """.trimIndent()
    )
}

fun buy() {
    print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ")
    if (cupsAmount < 1) {
        println("Sorry, not enough coffee disposable cups!")
        return
    }
    when (readln()) {
        ESPRESSO_CODE -> {
            if (waterAmount < WATER_PER_CUP_ESPRESSO) {
                println("Sorry, not enough water!")
                return
            }
            if (beansAmount < BEANS_PER_CUP_ESPRESSO) {
                println("Sorry, not enough coffee beans!")
                return
            }
            println("I have enough resources, making you a coffee!")
            waterAmount -= WATER_PER_CUP_ESPRESSO
            beansAmount -= BEANS_PER_CUP_ESPRESSO
            cupsAmount--
            moneyAmount += ESPRESSO_COSTS
        }
        LATTE_CODE -> {
            if (waterAmount < WATER_PER_CUP_LATTE) {
                println("Sorry, not enough water!")
                return
            }
            if (milkAmount < MILK_PER_CUP_LATTE) {
                println("Sorry, not enough milk!")
                return
            }
            if (beansAmount < BEANS_PER_CUP_LATTE) {
                println("Sorry, not enough coffee beans!")
                return
            }
            println("I have enough resources, making you a coffee!")
            waterAmount -= WATER_PER_CUP_LATTE
            milkAmount -= MILK_PER_CUP_LATTE
            beansAmount -= BEANS_PER_CUP_LATTE
            cupsAmount--
            moneyAmount += LATTE_COSTS
        }
        CAPPUCCINO_CODE -> {
            if (waterAmount < WATER_PER_CUP_CAPPUCCINO) {
                println("Sorry, not enough water!")
                return
            }
            if (milkAmount < MILK_PER_CUP_CAPPUCCINO) {
                println("Sorry, not enough milk!")
                return
            }
            if (beansAmount < BEANS_PER_CUP_CAPPUCCINO) {
                println("Sorry, not enough coffee beans!")
                return
            }
            println("I have enough resources, making you a coffee!")
            waterAmount -= WATER_PER_CUP_CAPPUCCINO
            milkAmount -= MILK_PER_CUP_CAPPUCCINO
            beansAmount -= BEANS_PER_CUP_CAPPUCCINO
            cupsAmount--
            moneyAmount += CAPPUCCINO_COSTS
        }
        BACK_CODE -> {
            return
        }
        else -> print("Unknown operation!")
    }
}

fun fill() {
    print("Write how many ml of water do you want to add: ")
    waterAmount += readln().toInt()
    print("Write how many ml of milk do you want to add: ")
    milkAmount += readln().toInt()
    print("Write how many grams of coffee beans do you want to add: ")
    beansAmount += readln().toInt()
    print("Write how many disposable cups of coffee do you want to add: ")
    cupsAmount += readln().toInt()
}

fun take() {
    println("I gave you $$moneyAmount")
    moneyAmount = 0
}

fun main() {
    while (true) {
        print("Write action (buy, fill, take, remaining, exit): ")
        when (readln()) {
            ACTION_BUY -> {
                buy()
            }
            ACTION_FILL -> {
                fill()
            }
            ACTION_TAKE -> {
                take()
            }
            ACTION_REMAINING -> {
                remaining()
            }
            ACTION_EXIT -> return
            else -> println("Unknown action!")
        }
    }
}
