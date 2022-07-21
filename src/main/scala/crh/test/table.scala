package crh.test

import scala.language.postfixOps

object table {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to  9; j <- 1 to 9 if(i <= j)) {
      print(i + " * " + j +" = " + i*j + "   ")
      if (j == 9) println()
    }
  }

}
