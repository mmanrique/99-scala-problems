package lists

object P03 {
  def nth[T](n: Int, list: List[T]): T = {
    if (list.length < n || n < 1) {
      throw new NoSuchElementException
    }
    list.take(n).reverse.head
  }

}
