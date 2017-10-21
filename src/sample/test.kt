package sample.test

fun square(i: Int): Int = i * i

fun main(args: Array<String>) {
    val functionObject = ::square
    println(functionObject(5))
}