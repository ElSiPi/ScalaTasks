import scala.io.StdIn.readLine

object GuessingGame extends App {

  //TODO Write a guessing game where the user has to guess a secret number.

  val r = scala.util.Random

  val min = 1
  val max = 20
  val secretValue = r.between(min, max + 1)

  //println(secretValue) // for test

  var userInput = readLine(s"Try to uncover the secret number! Write your guess between $min and $max:  ").toInt
  var counter = 1
  while (userInput != secretValue) {
    if (userInput < secretValue) println(s"Wrong! $userInput is smaller than the secret number!")
    else println(s"Wrong! $userInput is larger than the secret number!")
    var newUserInput = readLine(" Write your next lucky guess:  ").toInt
    if (newUserInput == userInput) counter = counter
    else counter += 1
    userInput = newUserInput
  }
    println(s"Your guess No.$counter was right. $userInput is equal to the secret number $secretValue!")

    //you will need to create a secret number using random
    // After every guess the program tells the user whether their number was too large or too small.
    // At the end the number of tries needed should be printed.
    // It counts only as one try if they input the same number multiple times consecutively.


    //remember we can use readLine
    //most likely a while loop
    //do not need a breakable unless you want to try it out

    //there was a game i think 20 questions where you have to guess something

}
