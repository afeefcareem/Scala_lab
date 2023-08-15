object Q1 {
  def calculateInterest: Double => Double = (depositAmount: Double) => {
    val interestRate: Double = depositAmount match {
      case d if d <= 20000 => 0.02
      case d if d <= 200000 => 0.04
      case d if d <= 2000000 => 0.035
      case _ => 0.065
    }
    depositAmount * interestRate
  }

  def main(args: Array[String]): Unit = {
    println("Enter the deposit amount: ")
    val depositAmount: Double = scala.io.StdIn.readDouble()
    val interestFunction = calculateInterest
    val interest: Double = interestFunction(depositAmount)
    println(s"Interest earned on Rs. $depositAmount deposit: Rs. $interest")
  }
}
