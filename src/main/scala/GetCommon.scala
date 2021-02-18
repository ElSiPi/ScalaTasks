import scala.math.Ordering.Implicits.seqOrdering

object GetCommon extends App{

  def getCommonElements(s1: Seq[Int], s2: Seq[Int], s3: Seq[Int]): Seq[Int] = {
    //TODO return sorted Sequence of common elements in all 3 sequences
    val set1 = s1.toSet
    val set2 = s2.toSet
    val set3 = s3.toSet
    val commonElem = (set1 & set2 & set3).toSeq.sorted
    commonElem

  }
  val testSeq1 = Seq(1,3,5,7,9)
  val testSeq2 = Seq(3,1,4,6,8,0)
  val testSeq3 = Seq(14,16,1,18,10,3)
  val testSeq4 = getCommonElements(testSeq1, testSeq2, testSeq3)
  println(testSeq4)

  def isPangram(text: String, alphabet : String = "abcdefghijklmnopqrstuvwxyz"): Boolean= {
    //TODO determine if the sentence contains all English letters
    //https://en.wikipedia.org/wiki/Pangram
    // (case is not important here)
    //this function should work on other languages too, if we pass it different alphabet
    val textForTesting = text.replace(" ", "")
    textForTesting.toSet == alphabet.toSet
    //false
  }

  println(isPangram("The five boxing wizards jump quickly.")) //should be true
  println(isPangram("The quick brown fox jumps over a lazy dog"))
}
