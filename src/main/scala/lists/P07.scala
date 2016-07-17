package lists

object P07 {
  def flatten(list: List[Any]): List[Any] = {
    if (list == Nil) {
      return Nil
    }
    list.head match {
      case seconHead: List[Any] =>
        val firstFlat = flatten(seconHead)
        val seconFlat = flatten(list.tail)
        firstFlat ::: seconFlat
      case _ => list.head :: flatten(list.tail)
    }
  }

  def flatten2(ls: List[Any]): List[Any] = ls flatMap {
    case ms: List[_] => flatten2(ms)
    case e => List(e)
  }
}
