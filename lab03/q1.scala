package lab03

object q1 extends App {
  def reverseString(str: String): String = {
    if (str.isEmpty)
      ""
    else
      reverseString(str.tail) + str.head
  }

    // Example usage
    val inputString = "Hello, World!"
    val reversedString = reverseString(inputString)

    println(reversedString) // Output: "!dlroW ,olleH"

}
