package lists

import org.scalatest.FunSuite

class P01Test extends FunSuite {

  test("should return the last element of a list") {
    val list: List[String] = List("a", "b", "c", "d")
    val last: String = P01.last(list)
    assert(last == "d")
  }

  test("should return Nil when list is empty") {
    val list: List[String] = List()
    try {
      val last: String = P01.last(list)
      fail();
    }
    catch {
      case nse: NoSuchElementException => //ignore
    }
  }
}
