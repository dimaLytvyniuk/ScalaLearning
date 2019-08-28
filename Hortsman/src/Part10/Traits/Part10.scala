package src.Part10.Traits

import java.awt.geom.Ellipse2D.Double
import java.awt.Point
import java.io.ByteArrayInputStream
import java.io.InputStream
import java.nio.charset.Charset
import java.util

object Part10 {
  def main(args: Array[String]) {
    firstTask()
    secondTask()
    fourthTask()
    fifthTask()
    eighthTask()
    nineTask()
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

  def fifthTask(): Unit = {
    var point = new Point with PropertyChangeSupportTrait
    var propertyChangeListener = new MyPropertyChangeListener
    point.addPropertyChangeListener(propertyChangeListener)
    point.pcs.firePropertyChange("x", 0, 11)
    point.x = 11
    point.pcs.firePropertyChange("y", 0, 11)
    point.y = 11
    point.removePropertyChangeListener(propertyChangeListener)
  }

  def eighthTask(): Unit = {
    val string = "My some strange tasks"
    val byteString = string.getBytes(Charset.forName("UTF-8"))
    val inputStream = new ByteArrayInputStream(byteString) with BufferedInputStream
    val byteArray = new Array[Byte](byteString.length)

    for (i <- byteString.indices) {
      byteArray(i) = inputStream.read().asInstanceOf[Byte]
    }

    val newString = new String(byteArray)
    println(newString)
  }

  def nineTask(): Unit = {
    val string = "My some strange tasks"
    val byteString = string.getBytes(Charset.forName("UTF-8"))
    val inputStream = new ByteArrayInputStream(byteString) with BufferedInputStream
    val byteArray = new Array[Byte](byteString.length)

    inputStream.foreach(x => print(x.asInstanceOf[Char]));
  }
}
