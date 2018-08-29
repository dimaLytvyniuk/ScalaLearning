package Part6

import Suit._
import CubeRGB._

object Part6 extends App {
  def firstTask(): Unit = {
    println(s"1 inch to centimeters: ${Conversions.inchesToCentimeters(1)}")
    println(s"1 gallon to liter: ${Conversions.gallonsToLiters(1)}")
    println(s"1 mile to kilometer: ${Conversions.milesToKilometers(1)}")
  }

  def secondTask(): Unit = {
    println(s"1 inch to centimeters: ${InchesToCentimeters.convert(1)}")
    println(s"1 gallon to liter: ${GallonsToLiters.convert(1)}")
    println(s"1 mile to kilometer: ${MilesToKilometers.convert(1)}")
  }

  def fourthTask(): Unit = {
    val point = Point(5, 4)

    println(s"${point.x} ${point.y}")
  }

  def sixthTask(): Unit = {
    println(s"${Diamonds.toString} ${Spades.toString} ${Hearts.toString} ${Clubs.toString}")
  }

  def seventhTask(): Unit = {
      println(s"Is red hearth: ${Suit.isRed(Hearts)}")
      println(s"Is red spades: ${Suit.isRed(Spades)}")
  }

  def eighthTask(): Unit = {
    println(s"Red: ${Red.id.toHexString}")
    println(s"Green: ${Green.id.toHexString}")
    println(s"Blue: ${Blue.id.toHexString}")
  }

  firstTask()

  secondTask()

  fourthTask()

  sixthTask()

  seventhTask()

  eighthTask()
}
