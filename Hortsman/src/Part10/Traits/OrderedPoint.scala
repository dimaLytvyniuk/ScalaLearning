package src.Part10.Traits

import java.awt.Point

import scala.math.Ordered

class OrderedPoint extends Point with Ordered[Point] {
  override def compare(that: Point): Int = {
    if (this.x == that.x && this.x == that.y)
      return 0;

    if (this.x > that.x || (this.x == that.x && this.y > that.y))
      return 1;

    return -1;
  }
}
