package lists

object P02 {

  def penultimate[T](list: List[T]): T = list match {
    case x :: y :: Nil => x
    case x :: tail => penultimate(tail)
    case _ => throw new NoSuchElementException
  }

}
