import scala.io.StdIn.readLine

object TemperatureTester extends App {
  //TODO write a program which asks for user's temperature
  val feverTemp = 37
  val coldTemp = 35
  val patient = readLine("What is your name?")
  val inputTemperature = readLine(s"$patient please enter your temperature: ").toFloat

  if (inputTemperature >= feverTemp) {
    println(s"Warning! Your temperature of $inputTemperature degrees is high!")
  }
  else if (inputTemperature <= coldTemp) {
    println(s"Warning! Your temperature of $inputTemperature degrees is low!")
  }
  else {
    println("Temperature OK!")
  }

  //if Temperature is over 37C print a warming about high temperature
  //if temperature is under 35 print a warning about being cold
  //otherwise print that everything is great :0
}
