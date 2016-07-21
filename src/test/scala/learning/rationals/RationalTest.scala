package learning.rationals

import org.scalatest.FunSuite

class RationalTest extends FunSuite {

  test("should be normalized") {
    val rational = new Rational(66, 42)
    assert(rational.numer == 11)
    assert(rational.denom == 7)
  }

  test("should gget the lesser") {
    val first = new Rational(3, 4)
    val second = new Rational(1, 5)
    assert(second isLessThan first)
  }

  test("should get the maximum") {
    val first = new Rational(3, 4)
    val second = new Rational(1, 5)
    assert(first.max(second) == first)
  }

  test("Should add two rationals") {
    val first = new Rational(1, 5)
    val second = new Rational(3, 9)
    assert(first + second == new Rational(8, 15))
  }

  test("Should substract two rationals") {
    val first = new Rational(8, 15)
    val second = new Rational(1, 5)
    assert(first - second == new Rational(1, 3))
  }

  test("Should multiply two Rationals") {
    val first = new Rational(3, 4)
    val second = new Rational(4, 7)
    assert(first * second == new Rational(3, 7))
  }

  test("Should divide two rationals") {
    val first = new Rational(3, 4)
    val second = new Rational(4, 7)
    assert(first / second == new Rational(21, 16))
  }


  test("SHould compare two Rationals") {
    val first: Rational = new Rational(3, 4)
    val second: Rational = new Rational(7, 8)
    assert(first < second)
  }


}
