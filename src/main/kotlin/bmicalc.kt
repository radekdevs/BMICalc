import kotlin.math.round

fun get_data() {
    print("Give a height in cm: ")
    val height: Double = readLine()?.toDoubleOrNull() ?: return
    val heightInMeters = height / 100.0

    print("Give a weight in kg: ")
    val weight: Double = readLine()?.toDoubleOrNull() ?: return

    val bmi = weight / (heightInMeters * heightInMeters)
    println("BMI: ${round(bmi)} kg/m²")
}

fun main() {
    var continueProgram = true

    while (continueProgram) {
        get_data()

        print("Do you want to calculate BMI again? (yes/no): ")
        val userInput = readLine()

        continueProgram = userInput.equals("yes", ignoreCase = true)
    }
}



