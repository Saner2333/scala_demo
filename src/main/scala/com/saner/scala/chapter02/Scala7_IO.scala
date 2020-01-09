package com.saner.scala.chapter02

import scala.io.StdIn

object Scala7_IO {
    def main(args: Array[String]): Unit = {

        // TODO IO

        //val age: String = StdIn.readLine()

        val age: Int = StdIn.readInt()


        println("age = " + (age + 20))

    }
}
