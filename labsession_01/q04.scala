package labsession_01

object q04 {
  def calculateWholesaleCost(numBooks: Int): Double = {
    val coverPrice = 24.95
    val discount = 0.4
    val shippingCostFirst50 = 3.0
    val shippingCostAdditional = 0.75

    val discountedPrice = coverPrice * (1 - discount)
    val totalShippingCost = if (numBooks <= 50) {
      shippingCostFirst50*50
    } else {
      shippingCostFirst50*50 + (numBooks - 50) * shippingCostAdditional
    }

    val totalCost = numBooks * discountedPrice + totalShippingCost
    totalCost
  }

  def main(args: Array[String]): Unit ={
    val numBooks = 60
    val totalWholesaleCost = calculateWholesaleCost(numBooks)
    printf(s"The total wholesale cost for $numBooks books is Rs. $totalWholesaleCost")
  }

}
