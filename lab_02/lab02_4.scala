package lab_02

object lab02_4 extends App {

  def attendees(price:Int):Int=120+(15-price)/5*20
  def revenue(price: Int): Int = attendees(price)*price
  def cost(price:Int):Int=500+attendees(price)

  def profit(price: Int): Int = revenue(price) - cost(price)

  println(profit(25), profit(30), profit(35), profit(40))

  val maxProfit = List(profit(25), profit(30), profit(35), profit(40)).max
  println(s"The maximum profit is: $maxProfit")


}
