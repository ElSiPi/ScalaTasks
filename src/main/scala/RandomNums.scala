import scala.util.Random

object RandomNums extends App {
  //TODO generate a sequence of 100 random 2 dice throws so and then calculate the average and print frequency of each throw
  //val r = scala.util.Random
  //so we want two dice throws - 100 of them
  // between(min inclusive, max exclusive), dice = values 1-6, 2 dices = values 2-12
  val myRandoms = for(i <- 1 to 100) yield Random.between(2, 13)
  println(myRandoms)

  println(myRandoms.sum/myRandoms.length.toDouble) //avg value

  println(myRandoms.filter(el => el == 2)) //get freq of 2
  println(myRandoms.filter(el => el == 3)) //get freq of 3


}
