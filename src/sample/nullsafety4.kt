fun main(args: Array<String>) {
	val numbers = (1..10).toList();
	for (number in numbers) {
		when (number) {
			1 -> println("one")
			in 2..10 -> println("2 <= ${number} <= 5")
			else -> println(number.toString())
		}
	}
}



