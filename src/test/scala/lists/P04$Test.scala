package lists

import org.scalatest.FunSuite

class P04$Test extends FunSuite {

  test("Length of a list") {
    val length: Int = P04.lengthRecursive(List(1, 2, 3, 4))
    assert(length == 4)
  }

  test("Lenght of an empty List") {
    val length: Int = P04.lengthRecursive(List())
    assert(length == 0)
  }

}
