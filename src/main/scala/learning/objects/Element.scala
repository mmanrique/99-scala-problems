package learning.objects

import learning.objects.Element.elem

abstract class Element {

  def contents: Array[String]

  def width: Int = if (height == 0) 0 else contents(0).length

  def height: Int = contents.length

  def above(that: Element): Element = {
    val this1 = this widen that.width
    val that1 = that widen this.width
    elem(this1.contents ++ that1.contents) //++ concatenates 2 arrays
  }

  def besides(that: Element): Element = {
    val this1 = this heighten that.height
    val that1 = that heighten this.height
    elem(
      for ((line1, line2) <- this1.contents zip that1.contents)
        yield line1 + line2
    )
  }

  override def toString: String = contents mkString "\n"

  def widen(w: Int): Element = {
    if (w <= width) this
    else {
      val left = elem(' ', (w - width) / 2, height)
      val right = elem(' ', w - left.width - width, height)
      left besides this besides right
    }
  }

  def heighten(h: Int): Element = {
    if (h <= height) this
    else {
      val top = elem(' ', width, (h - height) / 2)
      val bottom = elem(' ', width, h - top.height - height)
      top above this above bottom
    }
  }

}

object Element {

  def elem(contents: Array[String]): Element = {
    new ArrayElement(contents)
  }

  def elem(string: String): Element = {
    new LineElement(string)
  }

  def elem(chr: Char, width: Int, height: Int): Element = {
    new UniformElement(chr, width, height)
  }
}
