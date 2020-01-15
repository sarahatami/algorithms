object MainRunner {
  def main(args: Array[String]): Unit = {
    val arr = Array(Array(1,2,3),Array(4,5,6),Array(10,20,30))
    println(DiagonalDifference(arr))
  }

  def DiagonalDifference(matrix: Array[Array[Int]]) = {

    var j=0;
    var i=matrix.size-1
    var sum1 , sum2=0

    matrix.foreach{ ar =>
      sum1 += ar(j)
      j+=1
    }
    matrix.foreach{ ar =>
      sum2+=ar(i)
      i-=1
    }

    scala.math.abs(sum2 - sum1)
  }

}
