package lists

import org.scalatest.FunSuite

class P03$Test extends FunSuite {

  test("Should get the nth element") {
    val list: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8)
    val nth: Int = P03.nth(3, list)
    assert(nth == 3)
  }

  test("Shoulg get the last element") {
    val list: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8)
    val nth: Int = P03.nth(8, list)
    assert(nth == 8)
  }

  test("Should not try to get the 9th element") {
    val list: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8)
    try {
      val nth: Int = P03.nth(9, list)
      fail()
    }
    catch {
      case nse: NoSuchElementException => //ignore
      case _: Throwable => fail()
    }

  }

  test("Should not try to get the 0th element") {
    val list: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8)
    try {
      val nth: Int = P03.nth(0, list)
      fail()
    }
    catch {
      case nse: NoSuchElementException => //ignore
      case _: Throwable => fail()
    }

  }


}
