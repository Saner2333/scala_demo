package com.saner.scala.chapter06

object scala12_Trait2 {
//scala 动态混入
    //创建对象时，可以动态添加功能
    def main(args: Array[String]): Unit = {
        val user1 = new User12 with Person12
        user1.insert()
        user1.update()
    }

}

class User12 {
    def insert(): Unit = {
        println("insert user data...")
    }


}

trait Person12 {
    def update(): Unit = {
        println("update user data...")
    }
}