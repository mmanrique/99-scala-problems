package lists

object P04 {

  def lenght[T](ls: List[T]): Int = {
    ls.length

  }

  def lenghtRecursive[T](ls: List[T]): Int = ls match {
    case Nil => 0
    case _ :: tail => 1 + lenghtRecursive(tail)
  }

}
