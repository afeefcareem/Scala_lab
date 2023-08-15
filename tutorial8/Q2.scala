object Q2 {
  def main(args: Array[String]): Unit = {
    if (args.length != 1) {
      println("Please provide a single integer input.")
    } else {
      val input: Int = args(0).toInt
      val resultMessage = classifyNumber(input)
      println(resultMessage)
    }
  }

  def classifyNumber: Int => String = (num: Int) => num match {
    case n if n < 0 => "Negative"
    case 0 => "Zero"
    case n if n % 2 == 0 => "Even number"
    case n if n % 2 != 0 => "Odd number"
  }
}
