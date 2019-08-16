package Part9.FilesAndRegex

import java.io.{File, PrintWriter}

import scala.io.Source

object Part9 {
  def main(args: Array[String]) {
    firstTask()
    secondTask()
    thirdTask()
    fourthTask()
    fifthTask()
  }

  def firstTask(): Unit = {
    val source = Source.fromFile("Write.txt")
    val fileContent = source.getLines().toArray
    source.close()

    val writer = new PrintWriter(new File("Write.txt"))
    fileContent.reverse.foreach { x => writer.println(x)}
    writer.close()
  }

  def secondTask(): Unit = {
    val source = Source.fromFile("Write.txt")
    val fileContent = source.getLines().toArray
    source.close()

    val writer = new PrintWriter(new File("Write.txt"))
    fileContent.foreach { x => writer.println(changeTabToSpaces(x))}
    writer.close()
  }

  def thirdTask(): Unit = {
    val source = Source.fromFile("Write.txt")
    val fileContent = source
      .getLines()
      .foreach {
        x => x.split("\\s")
          .foreach(x => if (x.length > 11) println(x))
      }

    source.close()
  }

  def fourthTask(): Unit = {
    val source = Source.fromFile("ReadNumbers.txt")
    val numbers = source.mkString.split("\\s+").map(_.toDouble)
    source.close()

    val sum = numbers.sum
    val avg = sum / numbers.length
    val min = numbers.min
    val max = numbers.max

    println(s"${sum} ${avg} ${min} ${max}")
  }

  def fifthTask(): Unit = {
    val writer = new PrintWriter(new File("WriteNumbers.txt"))

    for (i <- 0 to 20) {
      val pow = math.pow(2, i)
      writer.printf("%10.0f %12f", pow, 1 / pow)
      writer.println()
    }

    writer.close()
  }

  def changeTabToSpaces(str: String): String = {
    str.replaceAll("\\t", " ")
  }
}
