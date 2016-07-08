package lists

import org.scalatest.FunSuite

class P06$Test extends FunSuite {

  test("List is palindrome") {
    assert(P06.isPalindrome(List(1, 2, 3, 4, 5, 4, 3, 2, 1)))
  }

  test("list is not palindrome") {
    assert(!P06.isPalindrome(List(1, 2, 3, 4, 5, 4, 3, 2, 1, 0)))
  }

  test("Empty List is palindrome") {
    assert(P06.isPalindrome(List()))
  }


}
