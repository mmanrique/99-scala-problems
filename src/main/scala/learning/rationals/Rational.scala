package learning.rationals

class Rational(n: Int, d: Int) {
  require(d != 0)
  private val g: Int = gcd(n.abs, d.abs)
  val numer: Int = n / g
  val denom: Int = d / g

  def this(n: Int) = this(n, 1)

  override def toString: String = numer + "/" + denom

  def +(that: Rational): Rational = {
    new Rational(numer * that.denom + denom * that.numer, denom * that.denom)
  }

  def +(that: Int): Rational = {
    new Rational(numer + that * denom, denom)
  }

  def -(that: Rational): Rational = {
    new Rational(numer * that.denom - denom * that.numer, denom * that.denom)
  }

  def -(that: Int): Rational = {
    new Rational(numer - that * denom, denom)
  }

  def *(that: Rational): Rational = {
    new Rational(numer * that.numer, denom * that.denom)
  }

  def *(that: Int): Rational = {
    new Rational(numer * that, denom)
  }

  def /(that: Rational): Rational = {
    new Rational(numer * that.denom, denom * that.numer)
  }

  def /(that: Int): Rational = {
    new Rational(numer, denom * that)
  }

  def isLessThan(that: Rational): Boolean = {
    this.numer * that.denom < that.numer * this.denom
  }

  def max(that: Rational): Rational = {
    if (this.isLessThan(that)) that else this
  }

  def gcd(a: Int, b: Int): Int = {
    if (b == 0) a else gcd(b, a % b)
  }

  override def equals(obj: Any): Boolean = obj match {
    case that: Rational => numer == that.numer && denom == that.denom
    case _ => false
  }

}
