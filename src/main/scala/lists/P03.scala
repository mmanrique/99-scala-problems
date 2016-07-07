package lists

object P03 {
  def nth[T](n: Int, list: List[T]): T = {
    if (list.length <= n || n < 0) {
      throw new NoSuchElementException
    }
    list(n)
  }

}
