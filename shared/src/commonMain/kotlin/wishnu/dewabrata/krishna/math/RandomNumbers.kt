package wishnu.dewabrata.krishna.math

import kotlin.random.Random

class RandomNumbers(private val numOfNumbers: Int) {

    private val numbers = IntArray(numOfNumbers)

    fun generate(): IntArray {
        for(n in 0 until numOfNumbers){
            numbers[n] = (1..9).random()
        }

        return numbers
    }
}