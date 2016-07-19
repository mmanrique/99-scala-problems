package learning.objects

class LineElement(s: String) extends Element {


  override def height: Int = 1

  override def width: Int = s.length

  override def contents: Array[String] = Array(s)
}
