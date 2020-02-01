object MainRunner {
  def main(args: Array[String]): Unit = {
//    val arr = Array(Array(1, 2, 3), Array(4, 5, 6), Array(10, 20, 30))
//    val enter= Array(1,1,1,0,0,0,0,0,-1,-1)
//    val x = Plusminus(enter)
//    x.plusMinus
//    staircase(7)
    miniMaxSum(Array(9,9,8,9,4))

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


  case class Plusminus(Arr:Array[Int]) {
    var arr= Arr
    def plusMinus = {
      var positive, negative, zero: Int = 0
      arr.foreach { a =>
        a match {
          case a if a > 0 => positive += 1
          case a if a < 0 => negative += 1
          case 0 => zero += 1
        }
      }
      println(positive, negative, zero)
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

  def miniMaxSumByMahdi(arr: Array[Int]): Unit = {
    val sum = arr.sum
    println(sum)
    val indices=Range.inclusive(0,arr.length-1).toList
    val all=indices.map(e=>sum-arr(e))
    println(Array(all.min,all.max).toList)
  }


  def miniMaxSum(arr: Array[Int])= {
    val sum=arr.sum
    val newarr=arr.map{a => sum-a}
    var my_itter=newarr.iterator
    println(my_itter.min)
    var my_itter2=newarr.iterator
    println(my_itter2.max)
  }

}