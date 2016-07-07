package lists

import org.scalatest.FunSuite

class P01Test extends FunSuite {

  test("should return the last element of a list") {
    val last: String = P01.last(List("a", "b", "c", "d"))
    assert(last == "d")
  }

  test("should return Nil when list is empty") {
    try {
      val last: String = P01.last(List())
      fail();
    }
    catch {
      case nse: NoSuchElementException => //ignore
    }
  }
}
