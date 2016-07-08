package lists

object P05 {

  def reverse[T](ls: List[T]): List[T] = ls match {
    case Nil => Nil
    case h :: tail => reverse(tail) ::: List(h)
  }

}
