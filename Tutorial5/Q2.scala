object Q2 extends App {
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
  def primeSeq(n: Int, i: Int = 2): Unit = {
    if (i < n) {
      if (Prime(i)) {
        print(i + " ")
      }
      primeSeq(n, i + 1)
    }
  }

  primeSeq(14)


}
