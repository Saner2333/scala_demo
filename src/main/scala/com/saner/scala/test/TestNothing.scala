package com.saner.scala.test

object TestNothing {

  def main(args: Array[String]): Unit = {
    def test(): Nothing = {
      throw new Exception()
    }

    test
  }

}
