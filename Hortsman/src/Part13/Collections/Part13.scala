package src.Part13.Collections

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object Part13 {
  def main(args: Array[String]): Unit = {
    firstTask()
    fourthTask()
  }

  def firstTask(): Unit = {
    val indexedAppear = indexes("Mississippi")

    for (ch <- indexedAppear) {
      print(s"${ch._1} - {")
      ch._2.foreach(i => print(s"${i}, "))
      println("}")
    }
  }

  def fourthTask(): Unit = {
    val array = Array("Tom", "Jerry", "Leo")
    var map = Map("Tom" -> 3, "Leo" -> 5)

    val result = strToIntAnalogy(array, map)
    for (i <- result) {
      print(s"${i} ")
    }

    println()
    println(newMkString(array))
  }

  def indexes(str: String): mutable.Map[Char, mutable.LinkedHashSet[Int]] = {
    val result = new mutable.HashMap[Char, mutable.LinkedHashSet[Int]]

    for (i <- str.indices) {
      if (!result.contains(str(i))) {
        result(str(i)) = new mutable.LinkedHashSet[Int]
      }
      result(str(i)) += i
    }

    result
  }

  def strToIntAnalogy(array: Array[String], accordingMap: Map[String, Int]): Iterable[Int] = {
    val arrayBuffer = new ArrayBuffer[Int]()

    for (str <- array) {
      if (accordingMap.contains(str)) {
        arrayBuffer.addOne(accordingMap(str))
      }
    }

    arrayBuffer
  }

  def newMkString[A](sequence: Iterable[A]) = sequence.foldLeft("")((str, elem) => str + elem.toString())
}
