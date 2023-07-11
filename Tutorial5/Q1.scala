object Q1 extends App {
  def Prime(n: Int, i: Int = 2): Boolean = {
    if (n <= 2) {
      if (n == 2) true else false
    } else if (n % i == 0) {
      false
    } else if (i * i > n) {
      true
    } else {
      Prime(n, i + 1)
    }
  }
  println(Prime(24))
}
