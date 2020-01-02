package com.saner.scala.chapter06

object scala07_Abstract {

    def main(args: Array[String]): Unit = {
        val user = new User7

    }

}

abstract class Person7 {
    val name: String
    val age: Int
    def hello():Unit
    def say(): Unit ={
        println("par say")
    }
}
class User7 extends Person7{
    val name: String = "hhh"
    val age: Int = 18

    def hello(): Unit ={
        println("hello")
    }

    override def say(): Unit = {
        println("ext say")
    }
}
