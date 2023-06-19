package labsession_01

object q02 {
  def celsiusToFahrenheit(celsius: Double): Double = {
    val fahrenheit = celsius * 1.8 + 32.0
    fahrenheit
  }

  def main(args: Array[String]): Unit = {
    val celsius = 35.0
    val fahrenheit = celsiusToFahrenheit(celsius)
    println(s"$celsius°C is equal to $fahrenheit°F")
  }


}
