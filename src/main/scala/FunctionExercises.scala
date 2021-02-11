object FunctionExercises extends App{

  def isPalindrome(text:String): Boolean = {
    val textWhitespacesRemoved = text.replace(" ", "")
    //textWhitespacesRemoved.equalsIgnoreCase(textWhitespacesRemoved.reverse))
    if (textWhitespacesRemoved.equalsIgnoreCase(textWhitespacesRemoved.reverse))
   {
     println(s"'$text' is a palindrome")
      true
    }
    else {
     println(s"'$text' is not a palindrome")
      false
    }
  }
  isPalindrome("This is a palindrome")
  isPalindrome("Borrow or rob")
  isPalindrome("Taco cat")

  def getCityYear(p0:Int, perc:Double, delta:Int, p:Int): Int = {
    var counter = 0
    var yearlyResult = p0 * perc/100.00 + delta
    if(yearlyResult < p0) {
      counter = -1
    }
    else {
      while(yearlyResult < p && counter >= 0){
        yearlyResult += yearlyResult * perc/100.0 + delta
        counter += 1
      }
    }
    counter
  }
  //Write a function which takes 4 parameters p0, perc, delta, p
  //return integer of years when the population reaches p
  //yearly formula is previous year * percentage increas + delta
  //percentage is in percent so you will need to convert
  //delta is how many people leave or join the city every year
  //probably while loop will work best here
  //also consider that it is possible that city never reaches p, then you should return -1
  //hint: if population does not increase after first year it will never reach p


  println(getCityYear(1000,2,50,1200)) //should print 3
  println(getCityYear(1000,2,-50,1200)) //should print -1
  println(getCityYear(1500000,2.5,10000,2000000)) //should print 10
}
