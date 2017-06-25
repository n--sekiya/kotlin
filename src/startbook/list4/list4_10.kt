package startbook.list4

fun main(args: Array<String>) {
    val names = listOf("foo","bar","baz")
    var barIndex = -1;
    for (index in names.indices) {
        // bar??????????????????
        if (names[index] == "bar") {
            barIndex = index
            println("bar?????????")
            break
        }
    }
}
