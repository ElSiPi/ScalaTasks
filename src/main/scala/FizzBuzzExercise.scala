object FizzBuzzExercise extends App{
  //TODO print a sequence on a screen of the following type
  // 1,2,3,4,Fizz,6, Buzz, 8, 9, Fizz, 11,....34, FizzBuzz, 36, ..., 99, Fizz
  //so the rules are if number divides by 5 and 7 print FizzBuzz
  //if divides by 5 print Fizz
  //if divides by 7 print Buzz
  //otherwise we print the number itself

  //so this exercise tests your ability to write conditionals and also to write a simple loop

  //this exercise is the first screener at an interview to see if a person can program

  for(i <- 1 to 100){ //or for (i <- 1 until 101)
    if(i % 5 == 0 && i % 7 == 0) println("FizzBuzz")
    else if(i % 5 == 0) println("Fizz")
    else if(i % 7 == 0) println("Buzz")
    else println(i)
  }

   //https://github.com/LauSla/Scala-stuff/blob/main/FizzBuzzExercise.scala
  //with a different output
  //not an efficient method if larger strings
  //var used, always prefer val
  var output = ""
  println(output)
  for (i <- 1 to 100) {
    if (i % 5 == 0) {
      output += "Fizz"
    }
    if (i % 7 == 0) {
      output += "Buzz"
    }
    if (i % 5 != 0 && i % 7 != 0) {  //can we somehow make this an "else"?
      output += i.toString
    }
    if (i < 100) {  //no comma after the last one
      output += ", "
    }
  }
  println(output)
val tokens = output.split(" ")
  for(token <- tokens) println(token)

  val mySeq = for {
    i <- 11 to 20
  } yield i
  mySeq.foreach(println)

  val myNumbers = (21 to 30).toIndexedSeq

  println(mySeq(0))
  println(mySeq(3))

  println(myNumbers(4))

  //very rarely in Scala, often in Java
  for (i <- 0 until myNumbers.length) {
    println(s"index ${i}, value: ${myNumbers(i)}")

    //if need index in Scala, use zip with index
    for ((i, n) <- myNumbers.zipWithIndex) {
      println(s"index ${i}, value: ${n}")
    }
  }
  //create a seq of fizzbuzz items for future use
  val myFizzBuzz = for {
    i <- 1 to 40
  } yield if(i % 5 == 0 && i % 7 == 0) "FizzBuzz"
  else if(i % 5 == 0) "Fizz"
  else if(i % 7 == 0) "Buzz"
  else i.toString

  myFizzBuzz.foreach(println)
}
