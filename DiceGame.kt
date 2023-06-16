// create dicegame class and take var die1 , var die2 and var die3
class DiceGame {
    fun run() {
        val die1 = Die()
        val die2 = Die(20)
        val die3 = Die("Percentile", 10)

        println("Creating a default d6...")
        println("Creating a d20...")
        println("Creating percentile die (a special d10)...")
        println(die1)
        println(die2)
        println(die3)

        println("\nTesting the roll method\n")

        println("Rolling the d6...")
        die1.roll()
        println(die1)

        println("Rolling the d20...")
        die2.roll()
        println(die2)

        println("Rolling the Percentile...")
        die3.roll()
        println(die3)

        println("\nSetting the d20 to show 20...")
        die2.currentSideUp = 20
        println("The side up is now ${die2.currentSideUp}.\n")

        println("Creating 5 d6...")
        var rolls = 0
        var matchCount = 0
        val dice = Array(5) { Die() }

// here using the while condition

        while (matchCount < 5) {
            rolls++
            dice.forEach { die ->
                die.roll()
                if (die.currentSideUp == 6) {
                    matchCount++
                }
            }
        }

        println("YAHTZEE! It took $rolls rolls")
        println("The d6 and d20 values matched both times, so here's a second output")
    }
}

fun main() {
    val game = DiceGame()
    game.run()
}