package com.saner.scala.chapter05

object Function_factorial {

  def main(args: Array[String]): Unit = {

    def f(i: Int): Int = {
      if (i == 1)
        return 1
      else
        return i * f(i - 1)

    }
    println(f(5))
  }

}
