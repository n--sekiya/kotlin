fun main(args: Array<String>) {
    class Rational(val numrator:Int, val denominator: Int)
    var half = Rational(1,2)
    // 結果：1
    println(half.numrator)
    // 結果：2
    println(half.denominator)
}
