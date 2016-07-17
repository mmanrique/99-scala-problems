package lists

object P08 {

  def compress[T](ls: List[T]): List[T] = ls match {
    case Nil => Nil
    case h :: tail => h :: compress(tail dropWhile (_ == h))
  }

}
