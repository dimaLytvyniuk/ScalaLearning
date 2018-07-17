package Part2

object Part2 extends App {

  def forthTask: Unit = {
    // (1 to 10).reverse.foreach(println)

    for (i <- 10 until 0 by -1)
      println(i)
  }

  def countdown(n: Int): Unit ={
    for(i <- n to 0 by -1)
      print(i + " ")
    println
  }

  def sixthTask(str: String): Unit ={
    var multi: Long = 1
    for (ch <- str)
      multi *= ch
    println(multi)
  }

  def seventhTask(str: String): Unit ={
    val multi = str.foldLeft(1L){(x, y) => x * y}
    println(multi)
  }

  def product(str: String): Long = {
    str.foldLeft(1L){(x, y) => x * y}
  }

  def productRecurs(str: String): Long = {
    if (!str.isEmpty)
      str.head.toLong * productRecurs(str.tail)
    else
      1
  }

  def myPow(x: Int, n: Int): Double = {
    if (n > 1 && x % 2 == 0) {
      val value = myPow(x, n / 2)
      value * value
    }
    else if (n > 1)
      x * myPow(x, n - 1)
    else if (n == 1)
      x
    else if (n == 0)
      1
    else
      1 / myPow(x, -n)
  }

  forthTask
  countdown(10)
  sixthTask("Hello")
  seventhTask("Hello")
  println(product("Hello"))
  println(productRecurs("Hello"))
  println(myPow(2, 2))
  println(myPow(2, 4))
  println(myPow(2, 0))
  println(myPow(2, 1))
  println(myPow(2, -1))
  println(myPow(2, -2))
}
