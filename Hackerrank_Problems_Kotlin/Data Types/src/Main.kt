import java.util.*
import kotlin.math.roundToInt

fun main(args: Array<String>){

    Locale.setDefault(Locale.US)

    val scan = Scanner(System.`in`)

    val a = scan.nextInt()
    val b = scan.nextDouble()

    scan.nextLine()

    val s = scan.nextLine()

    println((a + b).roundToInt())
    println((b + b))
    println("HackerRank " + s)
}
