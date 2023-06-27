package lab03

object q2 extends App {

    var stringList: List[String] = List("apple", "grapes", "orange", "mango", "lemon", "pineapple");
    var stringList1: List[String] = List();

    for (string <- stringList) {
      if (string.length() > 5) {
        stringList1 = string :: stringList1;
      }
    }

    println(stringList1)



}
