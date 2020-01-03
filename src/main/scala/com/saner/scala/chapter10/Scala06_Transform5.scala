package com.saner.scala.chapter10

object Scala06_Transform5 {
    def main(args: Array[String]): Unit = {
        // Scala可以使用隐式类来扩展功能
        // 在类的声明前增加implicit关键字，这个类就是隐式类，可以自动完成隐式转换
        // A类 => B类
        // 隐式类必须有主构造函数，且必须只有一个参数
        val user = new User1
        user.insertUser()
        user.updateUser()
    }

    implicit class ExtUser1(user: User1) {
        def updateUser(): Unit = {
            println("update user....")
        }

    }

}

class User1 {
    def insertUser(): Unit = {
        println("insert user....")
    }
}

