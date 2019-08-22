package src.Part10.Traits

import java.awt.geom.Ellipse2D.Double

object Part10 {
  def main(args: Array[String]) {
    firstTask()
    secondTask()
    fourthTask()
  }

  def firstTask(): Unit = {
    var egg = new Double(5, 10, 20, 30) with RectangleLike
    egg.translate(10, -10)
    egg.grow(10, 20)
    println(s"${egg.x} ${egg.y}")
    println(s"${egg.width} ${egg.height}")
  }

  def secondTask(): Unit = {
    var pointFirst = new OrderedPoint
    var pointSecond = new OrderedPoint

    pointFirst.x = 10
    pointFirst.y = 10

    pointSecond.x = -10
    pointSecond.y = -10

    println(pointFirst.compare(pointSecond))
  }

  def fourthTask(): Unit = {
    var logger = new CryptoLogger
    logger.log("hello")
  }
}
