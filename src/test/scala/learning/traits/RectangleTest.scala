package learning.traits

import org.scalatest.FunSuite

class RectangleTest extends FunSuite {

  test("should create a new Rectangle") {
    val rectangle: Rectangle = new Rectangle(new Point(1, 1), new Point(10, 10))
    assert(rectangle.left == 1)
    assert(rectangle.right == 10)
    assert(rectangle.width == 9)
  }
}
