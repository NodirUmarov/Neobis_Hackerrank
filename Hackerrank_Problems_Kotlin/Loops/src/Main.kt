import java.util.Scanner

fun main(args: Array<String>){

    val scan = Scanner(System.`in`)

    val n = scan.nextInt()

    for(i in 1 until 11){
        println("" + n + " x " + i + " = " + (i*n))
    }

}