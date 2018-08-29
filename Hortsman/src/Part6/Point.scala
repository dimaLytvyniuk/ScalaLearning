package Part6

class Point private (var x: Int, var y: Int) {

}

object Point {
  def apply(x: Int, y: Int) = new Point(x, y)
}