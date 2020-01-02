package com.saner.scala.chapter04

import scala.util.control.Breaks._

object TestBreak {

  def main(args: Array[String]): Unit = {
    breakable(
      for (i <- 1 to 10) {
        println("i = " + i)
        if (i == 5)
          break
      })
  }
}
