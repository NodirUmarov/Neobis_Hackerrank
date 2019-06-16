import java.util.*
import kotlin.math.roundToInt

// Complete the solve function below.
fun solve(meal_cost: Double, tip_percent: Double, tax_percent: Double): Double {
    val totalPrice = ((meal_cost * (tip_percent / 100)) + (meal_cost * (tax_percent / 100)) + meal_cost)
    return totalPrice
}

fun main(args: Array<String>) {

    Locale.setDefault(Locale.US)

    val scan = Scanner(System.`in`)

    val meal_cost = scan.nextDouble()

    val tip_percent = scan.nextDouble()

    val tax_percent = scan.nextDouble()

    println(solve(meal_cost, tip_percent, tax_percent).roundToInt())

    }
