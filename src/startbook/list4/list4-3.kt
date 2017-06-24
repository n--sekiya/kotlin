fun main(args: Array<String>) {
    val x = 30
    when (x) {
		1 -> println("one")
//	myFavoriteInt() -> "favorite: $x"
		in 2..10 -> println("1 <= x <= 10")
	    else -> println(x.toString())
    }
}
