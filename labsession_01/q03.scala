package labsession_01

object q03 {

  import scala.math._

  def calculatesphereVolume(radius: Double): Double = {
    val volume = (4.0 / 3.0) * Pi * pow(radius, 3)
    volume
  }

  def main(args: Array[String]): Unit = {
    val radius = 5.0
    val sphereVolume = calculatesphereVolume(radius)
    println(s"The volume of sphere with radius $radius is $sphereVolume")
  }

}
