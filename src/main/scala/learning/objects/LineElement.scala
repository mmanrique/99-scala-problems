package learning.objects

class LineElement(s: String) extends ArrayElement(Array(s)) {
  override def height: Int = 1

  override def width: Int = s.length
}
