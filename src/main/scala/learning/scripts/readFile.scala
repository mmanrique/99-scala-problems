import scala.io.Source

def widthOfLine(line: String) = line.length.toString.length
if (args.length > 0) {
  val lines = Source.fromFile(args(0)).getLines().toList

  val maxLine: String = lines.reduceLeft((a, b) => if (a.length > b.length) a else b)

  val withMaxLine = widthOfLine(maxLine)

  for (line <- lines) {
    val numPad = withMaxLine - widthOfLine(line)
    val padding = " " * numPad
    println(padding + line.length + " | " + line)
  }

} else {
  Console.err.println("Please enter filename")
}