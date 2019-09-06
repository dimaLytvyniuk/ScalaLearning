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
}
