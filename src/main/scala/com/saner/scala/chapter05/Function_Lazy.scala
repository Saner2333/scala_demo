package com.saner.scala.chapter05

object Function_Lazy {

    def main(args: Array[String]): Unit = {
        lazy val res = sum(10, 20)
        println("-------------------")
        println("res=" + res)

        def sum(n1: Int, n2: Int) = {
            println("sum被执行")
            n1 + n2
        }
    }
}
