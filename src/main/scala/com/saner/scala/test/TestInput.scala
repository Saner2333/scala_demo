package com.saner.scala.test

import scala.io.StdIn

object TestInput {

    def main(args: Array[String]): Unit = {

        println("input name: ")
        val name = StdIn.readLine()
        println("input age : ")
        var age = StdIn.readInt()
        println("input salary : ")
        var salary = StdIn.readDouble()
        printf("name = %s \nage = %d \nsal = %f", name, age, salary)
        StdIn.readDouble()
    }

}
