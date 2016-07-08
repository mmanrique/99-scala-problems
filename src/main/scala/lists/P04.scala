package lists

object P04 {

  def length[T](ls: List[T]): Int = {
    ls.length

  }

  def lengthRecursive[T](ls: List[T]): Int = ls match {
    case Nil => 0
    case _ :: tail => 1 + lengthRecursive(tail)
  }

}
