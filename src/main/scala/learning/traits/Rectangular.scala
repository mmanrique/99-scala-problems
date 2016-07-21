package learning.traits

trait Rectangular {
  def topLeft: Point

  def bottomRight: Point

  def left: Int = topLeft.x

  def right: Int = bottomRight.x

  def top: Int = topLeft.y

  def width: Int = (left - right) abs

}
