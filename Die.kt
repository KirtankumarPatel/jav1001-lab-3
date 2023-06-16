import kotlin.random.Random

// create a class die and take variable type string and numSides int and currentSideup int

class Die(var type: String = "d6", var numSides: Int = 6) {
    var currentSideUp: Int = 0
        private set

    init {
        roll()
    }

    constructor(numSides: Int) : this("d$numSides", numSides)

    constructor(type: String, numSides: Int) : this(type, numSides)

// here fun roll and override fun to called 

    fun roll() {
        currentSideUp = Random.nextInt(1, numSides + 1)
    }

    override fun toString(): String {
        return "Die: $type, Sides: $numSides, Current Side Up: $currentSideUp"
    }
}