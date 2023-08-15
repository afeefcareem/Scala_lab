object Q3 {
  val toUpper: String => String = input => input.toUpperCase
  val toLower: String => String = input => input.toLowerCase

  def formatNames(name: String)(formatFunction: String => String): String = {
    val words = name.split("\\s+")
    val formattedWords = words.map(formatFunction)
    formattedWords.mkString(" ")
  }

  def main(args: Array[String]): Unit = {
    val names = List("Benny", "Niroshan", "Saman", "Kumara")

    for (name <- names) {
      val formatted = formatNames(name) { str =>
        val formattedStr = str.head.toString.toUpperCase + str.tail.toLowerCase
        formattedStr
      }
      println(formatted)
    }
  }
}
