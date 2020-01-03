package com.saner.scala.chapter08

object Scala07_Match6 {
    def main(args: Array[String]): Unit = {
        val user: User = User("zhangsan", 11)
        val result:String = user match {
            case User("zhangsan", 11) => "yes"
            case _ => "no"
        }
        println(result)
    }

    case class User(name: String, age: Int)

}

