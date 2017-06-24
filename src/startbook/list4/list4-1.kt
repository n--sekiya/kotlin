fun main(args: Array<String>) {
    
    if (true) println("START") 

    if (5 in 1..10) println("5DAO")
    
    val start = 1
    val end = 10
    if (5 in start..end) println("OK") else println("NG")
    
    val message = if (5 in start..end) "OK" else "NG"
    println(message)
    
    val count = if (5 in start..end) {
        1
        2
    } else {
        0
    }
    println(count)    
}
