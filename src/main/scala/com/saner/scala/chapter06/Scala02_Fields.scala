package com.saner.scala.chapter06

object Scala02_Fields {
    def main(args: Array[String]): Unit = {
        var user = new User
        user.name = "zhangsan"
        println(user.name)
        println(user.age)
    }

}

class User {
    var name: String = _
    private[chapter06] val age = 18

}
