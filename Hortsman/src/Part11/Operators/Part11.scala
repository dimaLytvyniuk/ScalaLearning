package src.Part11.Operators

object Part11 {
  def main(args: Array[String]) {
    thirdTask()
    fourthTask()
    fifthTask()
    eighthTask()
    ninthTask()
  }

  def thirdTask(): Unit = {
    val number = new Fraction(5, 6)
    val number2 = new Fraction(8, 6)
    val optimized = number.optimize()
    println(number + number2)
  }

  def fourthTask(): Unit = {
    val money1 = new Money(1, 22)
    val money2 = new Money(1, 82)

    println(money1 + money2)

    val money3 = new Money(1, 22)
    println(money1 == money3)
    println(money1 != money3)
  }

  def fifthTask(): Unit = {
    val table = new Table() | "Java" | "Scala" || "C#" | "F#"
    println(table)
  }

  def eighthTask(): Unit = {
    val richFile = new RichFile("/home/cay/readme.txt")
    //val RichFile((path, fileName, fileExtension)) = richFile
    //println(path)
    //println(fileName)
    //println(fileExtension)
  }

  def ninthTask(): Unit = {
    val richFile = new RichFile("/home/cay/readme.txt")

    richFile match {
      case RichFile(pathFirst, pathSecond) => println(pathFirst)
      case RichFile(pathFirst, pathSecond, pathThird) => println(pathThird)
      case RichFile(pathFirst, pathSecond, pathThird, pathFourth) => println(pathFourth)
      case _ => println("notFound")
    }

    val RichFile(fist, second, third, _*) = richFile
    println(third)
  }
}
