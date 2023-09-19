object Q1nQ2 extends App{
  class Rational(x: Double) {
    def neg: Double = -x

    def frac_division(numerator: Int, denominator: Int): Double = {
      val numer = numerator.toDouble
      val denom = denominator.toDouble
      return numer / denom
    }

    def sub(a: Double, b: Double): Double = a - b
  }

  //1.
  val num = new Rational(45)
  println(num.neg)

  //2.
  val num1 = num.frac_division(3, 4)
  val num2 = num.frac_division(5, 8)
  val num3 = num.frac_division(2, 7)

  val sub_value = num.sub(num.sub(num1, num2), num3)
  println(sub_value)

}
