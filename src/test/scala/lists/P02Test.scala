package lists

import java.util.NoSuchElementException

import org.scalatest.FunSuite

class P02Test extends FunSuite {

  test("Should get the penultimate from list") {
    val list: List[Int] = List(1, 2, 3, 4, 5, 6)
    val penultimate: Int = P02.penultimate(list)
    assert(penultimate == 5)
  }

  test("Should return the penultimate from small list") {
    val list: List[Int] = List(1, 2)
    val penultimate: Int = P02.penultimate(list)
    assert(penultimate == 1)
  }

  test("should throw exception when there is no penultimate") {
    val list: List[Int] = List(1)
    try {
      val penultimate: Int = P02.penultimate(list)
      fail("Should have thrown an exception")
    }
    catch {
      case nse: NoSuchElementException => //ignore
      case _: Throwable => fail("Should be NoSuchElementException")
    }
  }

  test("Should throw exception when list is empty") {
    val list: List[Int] = List()
    try {
      val penultimate: Int = P02.penultimate(list)
      fail("Should have thrown an exception")
    }
    catch {
      case nse: NoSuchElementException => //ignore
      case _: Throwable => fail("Should be NoSuchElementException")
    }
  }

}
