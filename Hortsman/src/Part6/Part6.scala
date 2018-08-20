package Part6

object Part6 extends App {
  def firstTask(): Unit = {
    println(s"1 inch to centimeters: ${Conversations.inchesToCentimeters(1)}")
    println(s"1 gallon to liter: ${Conversations.gallonsToLiters(1)}")
    println(s"1 mile to kilometer: ${Conversations.milesToKilometers(1)}")
  }

  def secondTask(): Unit = {
    println(s"1 inch to centimeters: ${InchesToCentimeters.convert(1)}")
    println(s"1 gallon to liter: ${GallonsToLiters.convert(1)}")
    println(s"1 mile to kilometer: ${MilesToKilometers.convert(1)}")
  }

  firstTask()

  secondTask()
}
