package Part9.FilesAndRegex

import java.io._

import src.Part9.FilesAndRegex.Person

import scala.io.Source

object Part9 {
  def main(args: Array[String]) {
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

  def sixthTask(): Unit = {
    val source = Source.fromFile("Write.txt")
    val str = source.mkString
    val pattern = "\"[^\"]*\"".r

    val result = pattern.findAllIn(str).foreach(x => println(x))
  }

  def seventhTask(): Unit = {
    val source = Source.fromFile("Write.txt")
    val str = source.mkString
    val pattern = "[^-0-9]+".r

    val result = pattern.findAllIn(str).foreach(x => println(x))
  }

  def eighthTask(): Unit = {
    val source = Source.fromURL("https://github.com")
    val str = source.mkString
    val pattern = "<img .*/>".r

    val result = pattern.findAllIn(str).foreach(x => println(x))
  }

  def ninthTask(): Unit = {
    val file = new File("C:\\Programs")

    for (d <- subdirs(file))
      println(d.getName)
  }

  def tenthTask(): Unit = {
    val fred = new Person("Fred", 43)
    val steve = new Person("Steve", 43)
    val yosif = new Person("Yosif", 43)
    val margaret = new Person("Margaret", 43)

    fred.addFriend(steve)
    fred.addFriend(yosif)
    fred.addFriend(margaret)

    steve.addFriend(fred)
    steve.addFriend(yosif)
    steve.addFriend(margaret)

    yosif.addFriend(steve)
    yosif.addFriend(fred)
    yosif.addFriend(margaret)

    margaret.addFriend(steve)
    margaret.addFriend(yosif)
    margaret.addFriend(fred)

    val array = Array(fred, steve, yosif, margaret)
    val outputStream = new ObjectOutputStream(new FileOutputStream("Serialization.obj"))
    outputStream.writeObject(array)
    outputStream.close()

    val inputStream = new ObjectInputStream(new FileInputStream("Serialization.obj"))
    val serializedArray = inputStream.readObject().asInstanceOf[Array[Person]]

    for (friend <- serializedArray) {
      println(friend.name)
      println(friend.friends.size)
    }
  }

  def subdirs(dir: File): Iterator[File] = {
    val pattern = ".*\\.exe".r;
    val classFiles = dir.listFiles().filter(x => x.isFile && pattern.matches(x.getName))
    val childrenDirectories = dir.listFiles().filter(_.isDirectory)
    classFiles.iterator ++ childrenDirectories.iterator.flatMap(subdirs(_))
  }

  def changeTabToSpaces(str: String): String = {
    str.replaceAll("\\t", " ")
  }
}
