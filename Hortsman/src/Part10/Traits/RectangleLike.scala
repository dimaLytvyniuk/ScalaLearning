package src.Part10.Traits

import java.awt.geom.Ellipse2D.Double;

trait RectangleLike {
  this: Double =>
    def translate(x: Int, y: Int): Unit =
    {
      this.x += x;
      this.y += y;
    }

    def grow(h: Int, w: Int): Unit =
    {
      this.height += h;
      this.width += w;
    }
}
