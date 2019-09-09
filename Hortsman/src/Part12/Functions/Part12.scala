package src.Part12.Functions

import scala.collection.{immutable, mutable}

object Part12 {
  def main(args: Array[String]): Unit = {
    firstTask()
    secondTask()
    thirdTask()
    fourthTask()
    fifthTask()
    sixtTask()
    seventhTask()
    eightTask()
    ninthTask()
    tenthTask()
  }

  def firstTask(): Unit = {
    val map = values(x => x * x, -5, 5)
    for ((k, v) <- map)
      println(s"${k} ${v}")
  }

  def secondTask(): Unit = {
    val array = Array(1, 4, 1, 10, -10, 3, -4)

    val min = array.reduceLeft((min, current) => if (min > current) current else min)
    println()
    println(min)
  }

  def thirdTask(): Unit = {
    val factor = factorial(5)

    println()
    println(factor)
  }

  def fourthTask(): Unit = {
    val factor = betterFactorial(5)

    println()
    println(factor)
  }

  def fifthTask(): Unit = {
    val max = largest(x => 10 * x - x * x, 1 to 10)

    println()
    println(max)
  }

  def sixtTask(): Unit = {
    val maxIndex = largestAt(x => 10 * x - x * x, 1 to 10)

    println()
    println(maxIndex)
  }

  def seventhTask(): Unit = {
    val pairs = (1 to 10) zip (11 to 20)

    val result = adjustToPair(_ * _)((6, 7))
    println(result)
    println()

    val mapped = pairs.map(x => adjustToPair(_ * _)(x))
    for (value <- mapped) {
      print(s"${value} ")
    }
    println()
  }

  def eightTask(): Unit = {
    val a = Array("Hello", "World", "New")
    val b = Array(5, 5, 3)
    val isCorrespond = a.corresponds(b)((str, lenStr) => str.length == lenStr)

    println(isCorrespond)
  }

  def ninthTask(): Unit = {
    val a = Array("Hello", "World", "Neww")
    val b = Array(5, 5, 3)
    val isCorrespond = corresponds(a, b, (str: String, lenStr: Int) => str.length == lenStr)

    println(isCorrespond)
  }

  def tenthTask(): Unit = {
    val a = 12
    val b = 5
    unless(a == b) {
      println("in block a == b")
    }

    unless(12 == 5 || a == b) {
      println("in block 12 == 5 || a == b")
    }
  }

  def values(func: (Int) => Int, low: Int, high: Int): mutable.Map[Int, Int] = {
    val result = new mutable.HashMap[Int, Int]

    for (i <- low to high)
      result(i) = func(i)

    result
  }

  def factorial(number: Int): Int = (1 to number).reduceLeft(_ * _)
  def betterFactorial(number: Int): Int = (1 to number).foldLeft(1)(_ * _)

  def largest(func: (Int) => Int, inputs: Seq[Int]): Int = {
    inputs
      .map(func)
      .reduceLeft((max, current) => if(max < current) current else max)
  }

  def largestAt(func: (Int) => Int, inputs: Seq[Int]): (Int, Int) = {
    inputs
      .foldLeft((Int.MinValue, Int.MinValue))((maxTuple, current) => {
        val funcValue = func(current)
        if (maxTuple._1 < funcValue)
          (funcValue, current)
        else
          maxTuple
      })
  }

  def adjustToPair(func: (Int, Int) => Int): ((Int, Int)) => Int = {
    (x: (Int, Int)) => func(x._1, x._2)
  }

  def corresponds[A, B](firstArray: Array[A], secondArray: Array[B], func: (A, B) => Boolean): Boolean = {
    var i = 0
    var result = true

    while (i < firstArray.length && result) {
      result = func(firstArray(i), secondArray(i))
      i += 1
    }

    result
  }

  def unless(contition: => Boolean)(block: => Unit): Unit = {
    if (!contition) {
      block
    }
  }
}
