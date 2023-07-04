object q2 {
  def main(args: Array[String]): Unit = {
    val input = if (args.length > 0) {
      args(0).toInt
    } else {
      print("Enter an integer: ")
      scala.io.StdIn.readInt()
    }
    val message = input match {
      case num if num <= 0 => "Negative/Zero is input"
      case num if num % 2 == 0 => "Even number is given"
      case num => "Odd number is given"
    }
    println(message)
  }

}
