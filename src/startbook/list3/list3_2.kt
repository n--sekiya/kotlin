package startbook.list3

fun main(args: Array<String>) {
    class Rational(val numerator: Int, val denominator: Int) {
        override fun toString(): String = "${numerator}/${denominator}"
    }
    var half = Rational(1,2)
    // 結果：1/2
    println(half)
}
