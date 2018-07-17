package Part3

import java.util.TimeZone

import scala.collection.mutable.ArrayBuffer

object Part3 extends App {
  def printArray(array: IndexedSeq[Int]) = {
    for (elem <- array) print(elem + " ")
    println
  }

  def firstTask(n: Int): Unit = {
    val a = for (i <- 0 until n) yield i

    printArray(a)
  }

  def secondTask(array: Array[Int]): Array[Int] = {
    val length = array.length - (if (array.length % 2 == 0)  1 else 2)

    for (i <- 0 until length by 2) {
      val tmp = array(i)
      array(i) = array(i + 1)
      array(i + 1) = tmp
    }

    array
  }

  def thirdTask(array: Array[Int]): Array[Int] = {
    val length = array.length - 1

    val result =
      for (i <- 0 to length)
        yield {
          if (i % 2 == 0) {
            if (i != length)
              array(i + 1)
            else
              array(i)
          }
          else
            array(i - 1)
        }

    result.toArray
  }

  def fourthTask(array: Array[Int]): Array[Int] = {
    array.filter(_ > 0) ++ array.filter(_ <= 0)
  }

  def seventhTask(array: Array[Int]): Unit = {
    printArray(array.distinct)
  }

  def eighthTask(array: ArrayBuffer[Int]): ArrayBuffer[Int] = {
    var indexes =
      (for (i <- 0 until array.length if array(i) < 0) yield i)
        .reverse
        .init

    for (i <- indexes)
      array.remove(i)

    array
  }

  def ninthTask(): Array[String] = {
    var ids = TimeZone
      .getAvailableIDs
      .filter(_.contains("America/"))
      .map(word => word.replace("America/", ""))
      .sorted

    for (elem <- ids)
      println(elem)

    ids
  }

  firstTask(10)

  val array = Array(1, 2, 3, 4, 5)
  printArray(secondTask(array))

  printArray(thirdTask(array))

  printArray(fourthTask(Array(-1, 2, 0, -4, -5, 4)))

  seventhTask(Array(1,1,2,3,2,2, 4, 5, 4, 3))

  printArray(eighthTask(ArrayBuffer(-1, 2, 3, -4, -5, -6, 7, 8)))

  ninthTask()
}

