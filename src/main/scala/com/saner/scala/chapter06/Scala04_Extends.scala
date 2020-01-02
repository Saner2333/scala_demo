package com.saner.scala.chapter06

object Scala04_Extends {

    def main(args: Array[String]): Unit = {
        val user14  = new User4("zhangsan")
        println(user14.name)
    }

}

//class User14(name : String) extends Parent14 {
//name 作为参数传输给父类
class User4(name : String) extends Parent4(name) {

}
class Parent4(var name : String){

}
