import scala.io.StdIn.readLine

object CubeTable extends App{
  //TODO write a program that takes user input for starting and end values
  //then saves cubes of those values in a Seq data type and then prints the cubes out
  val begVal = readLine("What is the starting value?").toInt
  val endVal = readLine("And what is the ending value?").toInt
  println(s"Will print cubes for $begVal to $endVal ")
  val intSeq = (begVal to endVal).toVector
  val cubeSeq = intSeq.map(el => el*el*el)
  println(cubeSeq)
}
