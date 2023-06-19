package lab_02

object lab02_3 extends App {
  val normalRate = 250.0
  val otRate = 85.0
  val taxRate = 0.12
  val normalHours = 40
  val otHours = 30
  val takeHomeSalary = ((normalHours*normalRate) + (otHours*otRate))*(1-taxRate)
  println(s"weekly takehome salary is: $takeHomeSalary")



}
