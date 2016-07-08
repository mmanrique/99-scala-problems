package lists

import org.scalatest.FunSuite

class P05$Test extends FunSuite {

  test("Should reverse a list") {

    val reverse: List[Int] = P05.reverse(List(1, 2, 3, 4, 5, 6, 7, 8))
    assert(reverse == List(8, 7, 6, 5, 4, 3, 2, 1))
  }


}
