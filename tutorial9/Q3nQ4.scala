object Q3nQ4  extends App {
  class Account(n: String) {
    val name: String = n
    var amount = 0

    def deposit(amt: Int): Int = {
      amount = amount + amt
      return amount
    }

    def withdraw(amt: Int): Int = {
      amount = amount - amt
      return amount
    }

    def transfer(amt: Int, acc: Account): Unit = {
      amount = amount - amt
      acc.deposit(amt)
    }
  }


  //3.
  val acc1 = new Account("acc1")
  val acc2 = new Account("acc2")
  val acc3 = new Account("acc3")

  println("Acc1 balance " + acc1.deposit(1500))
  println("Acc1 balance " + acc1.withdraw(500))
  acc1.transfer(500, acc2)
  println(s"This account balance: ${acc1.amount}")
  println(s"Second account balance: ${acc2.amount}")
  println("Acc3 balance" + acc3.withdraw(500))

  //4.
  val Bank = List(acc1, acc2, acc3)
  //4.1
  val negative_accounts = Bank.filter(account => account.amount < 0)
  println("Positive accounts: " + negative_accounts.map(account => account.name))

  //4.2
  var total = 0
  Bank.map(account => total = total + account.amount)
  println(s"Total amount: ${total}")

  //4.3
  var new_total = 0.0
  Bank.map(account => {
    if (account.amount > 0) {
      new_total = new_total + (0.05 * account.amount) + account.amount
    } else {
      new_total = new_total + (0.1 * account.amount) + account.amount
    }
  })

  println(s"Total amount: ${new_total}")

}
