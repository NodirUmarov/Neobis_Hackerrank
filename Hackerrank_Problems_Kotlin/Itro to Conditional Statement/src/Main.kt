import java.util.*

fun main(args: Array<String>){

    Locale.setDefault(Locale.US)

    val scan = Scanner(System.`in`)

    val num = scan.nextInt()


    if(num % 2 != 0){
        println("Weird")
    }
    else if(num % 2 == 0){
        if(num >= 2 && num <= 5){
            println("Not Weird")
        }
        else if(num > 5 && num <= 20){
            println("Weird")
        }
        else if(num > 20){
            println("Not Weird")
        }
    }

}