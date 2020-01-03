package com.saner.scala.chapter08

object Scala01_Match {
    def main(args: Array[String]): Unit = {
        var a = 10
        var b = 20
        var operator = 'd'
        val result = operator match {
            case '+' => a + b
            case '-' => a - b
            case '*' => a * b
            case '/' => a / b
            case _ => "illegal"
        }
        println(result)
    }
}
