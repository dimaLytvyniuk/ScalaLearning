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

  def seventhTask(): Unit = {
    val properties = Map(
      "java.runtime.name" -> System.getProperty("java.runtime.name"),
      "sun.boot.library.path" -> System.getProperty("sun.boot.library.path"),
      "java.vm.version" -> System.getProperty("java.vm.version"),
      "java.vm.vendor" -> System.getProperty("java.vm.vendor"),
      "java.vendor.url" -> System.getProperty("java.vendor.url"),
      "path.separator" -> System.getProperty("path.separator"),
      "java.vm.name" -> System.getProperty("java.vm.name")
    )

    val max = properties.foldLeft(0)(_ max _._1.length)

    for ((k, v) <- properties)
      println(String.format(s"%-${max + 10}s | %s", k, v))
    println()
  }

  def minmax(values: Array[Int]): (Int, Int) = {
    values
      .tail
      .foldLeft((values(0), values(0)))((t, x) =>
        if (t._1 > x)
          (x, t._2)
        else if (t._2 < x)
          (t._1, x)
        else
          t)
  }

  def eighthTask(): Unit = {
    val values = Array(1, 3, -8, 102, 3, 12, 3, -40)

    val result = minmax(values)

    println(s"Min: ${result._1}, Max: ${result._2}")
  }

  def lteqgt(values: Array[Int], v: Int): (Int, Int, Int) = {
    values.foldLeft((0, 0, 0))((t, x) =>
      if(x < v)
        (t._1 + 1, t._2, t._3)
      else if (x > v)
        (t._1, t._2, t._3 + 1)
      else
        (t._1, t._2 + 1, t._3))
  }

  def ninthTask(): Unit = {
    val values = Array(1, 3, -8, 102, 3, 12, 3, -40)

    val result = lteqgt(values, 3)

    println(s"V = 3 Less: ${result._1}, Equal: ${result._2} Great: ${result._3}")
  }

  def tenthTask(): Unit = {
    val zipResult = "Hello".zip("World");

    for ((x, y) <- zipResult) print(s"$x$y ")
  }

  firstTask()

  secondTask()

  thirdTask()

  fourthTask()

  fifthTask()

  sixthTask()

  seventhTask()

  eighthTask()

  ninthTask()

  tenthTask()
}

