package learning.objects

import learning.objects.Element.elem

object Spiral {

  private val space: Element = elem(" ")
  private val corner: Element = elem("+")

  def spiral(nEdges: Int, direction: Int): Element = {
    if (nEdges == 1) {
      corner
    } else {
      val sp = spiral(nEdges - 1, (direction + 3) % 4)
      def verticalBar = elem('|', 1, sp.height)
      def horizontalBar = elem('-', sp.width, 1)
      if (direction == 0) {
        (corner besides horizontalBar) above (sp besides space)
      } else if (direction == 1) {
        (sp above space) besides (corner above verticalBar)
      } else if (direction == 2) {
        (space besides sp) above (horizontalBar besides corner)
      } else {
        (verticalBar above corner) besides (space above sp)
      }
    }
  }

  def main(args: Array[String]): Unit = {
    val nSides = 25
    println(spiral(nSides, 0))
  }
}
