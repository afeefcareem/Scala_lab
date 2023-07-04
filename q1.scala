object q1 extends App {
  def calculateInterest(depositAmount: Double): Double = {
    depositAmount match {
      case amount if amount <= 20000 => amount * 0.02
      case amount if amount <= 200000 => amount * 0.04
      case amount if amount <= 2000000 => amount * 0.035
      case amount => amount * 0.065
    }
  }

  def readIntP(s: String) = {
    printf("%s", s);
    scala.io.StdIn.readInt()
  }

  val depositAmount = readIntP("enter the amount: ")
  val interest = calculateInterest(depositAmount)
  println(s"The interest earned on Rs. $depositAmount is Rs. $interest")


}
