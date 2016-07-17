package lists

import org.scalatest.FunSuite

class P07$Test extends FunSuite {

  test("should flatten a nubers list") {
    val flatten: List[Any] = P07.flatten(List(List(1, 1), 2, List(3, List(5, 8))))
    assert(flatten == List(1, 1, 2, 3, 5, 8))
  }

}
