package scala.problem_2

/**
 * Even Fibonacci numbers
 * Problem 2
 *
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
 *
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 *
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 * 
 */
object Main {
  def main(args: Array[String]): Unit = {
    val limit = 4000000

    //---------------------------------
    //
    //---------------------------------
//    def fibonacciseq(): Stream[Int] = {
//      1 #:: 2 #:: fibonacciseq().zip(fibonacciseq().tail).map(p => p._1 + p._2)
//    }
//    val l = fibonacciseq().filter(_ % 2 == 0).takeWhile(_ < limit)

    //---------------------------------
    //
    //---------------------------------
    def fibonacci(a: Int, b: Int): Stream[Int] = {
      b #:: fibonacci(b, a + b)
    }
    val l = fibonacci(0, 1).filter(_ % 2 == 0).takeWhile(_ < limit)

    //---------------------------------
    //
    //---------------------------------
    l.foreach(println)
    println("result: %d".format(l.sum))
    
  }

}
