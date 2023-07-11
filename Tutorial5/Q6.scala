object Q6 extends App {
  def printFibonacci(n: Int, a: Int = 0, b: Int = 1): Unit = {
    if (n > 0) {
      print(a + " ")
      printFibonacci(n - 1, b, a + b)
    }
  }
  println(printFibonacci(10))

}
