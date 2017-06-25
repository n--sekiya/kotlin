package startbook.list4

fun main(args: Array<String>) {
    loop@ for (x in 1..10) {
        for (y in 1..10) {
            if (y == 5) {
                println(x)
                break@loop
            }
        }
    }
}
