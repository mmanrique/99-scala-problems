package lists

import org.scalatest.FunSuite

class P08$Test extends FunSuite {

  test("Should compress the list without repeat elements") {

    val compress: List[Symbol] = P08.compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    assert(compress == List('a, 'b, 'c, 'a, 'd, 'e))
  }

}
