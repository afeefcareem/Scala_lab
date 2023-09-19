object Q2 extends App {
    def countLetterOccurrences(words: List[String]): Int = {
      val length = words.map(word => word.length)
      val total = length.reduce((acc, x) => acc + x)
      return total
    }
      val out = countLetterOccurrences(List("apple", "mango", "banana"))
      println(out)
}
