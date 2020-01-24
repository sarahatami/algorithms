object MainRunner {
  def main(args: Array[String]): Unit = {
//    val arr = Array(Array(1, 2, 3), Array(4, 5, 6), Array(10, 20, 30))
    val arr2 = Array(1,2,3,0,-1,-2)
    println(plusminus(arr2))
//    staircase(7)
  }

  def DiagonalDifference(matrix: Array[Array[Int]]) = {

    var j = 0;
    var i = matrix.size - 1
    var sum1, sum2 = 0

    matrix.foreach { ar =>
      sum1 += ar(j)
      j += 1
    }
    matrix.foreach { ar =>
      sum2 += ar(i)
      i -= 1
    }

    scala.math.abs(sum2 - sum1)
  }
  case class plusminus(arr:Array[Int]) {

    def plusMinus(arr: Array[Int]): (Int, Int, Int) = {

      var positive, negative, zero: Int = 0
      arr.foreach { a =>
        a match {
          case a if a > 0 => positive += 1
          case a if a < 0 => negative += 1
          case 0 => zero += 1
        }
      }
      (positive, negative, zero)
    }
  }

  def staircase(n: Int) {

    for(i <- 1 to n ){
      for(j <- 1 to n-i){
        print(" ")
      }
      for(k <- 1 to i){
        print("#")
      }
      print("\n")
    }

  }

}




