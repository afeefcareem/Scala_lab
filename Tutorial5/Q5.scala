object Q5 extends App {
  def isEven(n: Int): Boolean = {
    if (n == 0) {
      true
    } else if (n == 1) {
      false
    } else {
      isEven(n - 2)
    }
  }
  def sumEven(n: Int): Int = {
    if (n <= 0) {
      0
    } else if (isEven(n - 1)) {
      n - 1 + sumEven(n - 1)
    } else {
      sumEven(n - 1)
    }
  }

  println(sumEven(8))


}
