package learning.objects

import org.scalatest.FunSuite

class ElementTest extends FunSuite {
  test("Elements should be printed") {
    val elem: Element = Element.elem("Memin")
    assert(elem.toString == "Memin")
  }

  test("Array Elements width is dictated by first element") {
    val elem: Element = Element.elem(Array("one", "two", "eleven"))
    assert(elem.width == "one".length)
    assert(elem.height == 3)
    assert(elem.toString == "one\ntwo\neleven")
  }

  test("Above palces one element before the other") {
    val elem1: Element = Element.elem("Nice to Meet you")
    val elem2: Element = Element.elem("Me too")
    val result: Element = elem1 above elem2
    assert(result.toString == "Nice to Meet you\n     Me too     ")
  }

}
