package Part4

import java.io.File
import java.util.Scanner

import scala.collection.JavaConversions.mapAsScalaMap
import scala.collection.mutable

object Part4 extends App {
  def printMap(map: Iterable[(String, Int)]): Unit = {
    for ((k, v) <- map)
      println(k + " " + v)
    println()
  }

  def firstTask(): Unit = {
    val wantToBuy = Map("Notebook" -> 1500, "Smartphone" -> 300, "SSD" -> 250)
    val discount = wantToBuy.map(entry => entry._1 -> (entry._2 * 0.9).toInt)

    printMap(wantToBuy)
    printMap(discount)
  }

  def secondTask(): Unit = {
    val in = new Scanner(new File("myfile.txt"))
    val map = new mutable.HashMap[String, Int]
    while (in.hasNext()) {
      val word = in.next()
        .replaceAll("[,:;?.!]", "")
        .toLowerCase

      map(word) = if (map.contains(word)) map(word) + 1 else 1
    }

    printMap(map)
  }

  def thirdTask(): Unit = {
    val in = new Scanner(new File("myfile.txt"))
    var map = new scala.collection.immutable.HashMap[String, Int]

    while (in.hasNext()) {
      val word = in.next()
        .replaceAll("[,:;?.!]", "")
        .toLowerCase

      map += (word -> (if (map.contains(word)) map(word) + 1 else 1))
    }

    printMap(map)
  }

  def fourthTask(): Unit = {
    val in = new Scanner(new File("myfile.txt"))
    var map = new scala.collection.immutable.TreeMap[String, Int]

    while (in.hasNext()) {
      val word = in.next()
        .replaceAll("[,:;?.!]", "")
        .toLowerCase

      map += (word -> (if (map.contains(word)) map(word) + 1 else 1))
    }

    printMap(map)
  }

  def fifthTask(): Unit = {
    val in = new Scanner(new File("myfile.txt"))
    val map: scala.collection.mutable.Map[String, Int] = new java.util.TreeMap[String, Int]()

    while (in.hasNext()) {
      val word = in.next()
        .replaceAll("[,:;?.!]", "")
        .toLowerCase

      map(word) = if (map.contains(word)) map(word) + 1 else 1
    }

    printMap(map)
  }

  def sixthTask(): Unit = {
    import scala.collection.mutable.LinkedHashMap;

    val calendar = LinkedHashMap(
      "Monday" -> java.util.Calendar.MONDAY,
      "Tuesday" -> java.util.Calendar.TUESDAY,
      "Wednesday" -> java.util.Calendar.WEDNESDAY,
      "Thursday" -> java.util.Calendar.THURSDAY,
      "Friday" -> java.util.Calendar.FRIDAY,
      "Saturday" -> java.util.Calendar.SATURDAY,
      "Sunday" -> java.util.Calendar.SUNDAY
    )

    for ((k, v) <- calendar)
      println(k + " " + v)
    println()
  }

  firstTask()

  secondTask()

  thirdTask()

  fourthTask()

  fifthTask()

  sixthTask()
}

