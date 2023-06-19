package labsession_01

object q05 {
  def calculateRunningTime(easyPaceDistance: Double, easyPaceTime: Double, tempoDistance: Double, tempoTime: Double): Double = {
    val totalTime = easyPaceTime * easyPaceDistance + tempoTime * tempoDistance + easyPaceTime * easyPaceDistance
    totalTime
  }

  def main(args: Array[String]): Unit = {
    val easyPaceDistance = 2.0
    val easyPaceTime = 8.0
    val tempoDistance = 3.0
    val tempoTime = 7.0

    val totalRunningTime = calculateRunningTime(easyPaceDistance, easyPaceTime, tempoDistance, tempoTime)
    println(s"The total running time is $totalRunningTime minutes")
  }

}
