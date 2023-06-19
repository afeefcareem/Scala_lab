package labsession_01

object q01 {

  import scala.math._

  def calculateArea(radius: Double): Double = {
    val area = Pi * pow(radius, 2)
    area
  }

  def main(args: Array[String]): Unit = {
    val radius = 5.0
    val diskArea = calculateArea(radius)
    println(s"The area of the disk with radius $radius is $diskArea")
  }

}
