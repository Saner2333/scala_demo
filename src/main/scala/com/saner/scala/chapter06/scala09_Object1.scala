package com.saner.scala.chapter06

object scala09_Object1 {

    def main(args: Array[String]): Unit = {
        //伴生对象中的属性都可以通过伴生对象名调用
        println(User9.name)
        //伴生类不能调用自己的属性
//        println(User9.age)
    }

}

//伴生对象
object User9 {

    var name: String = "hhh"

}

//伴生类
class User9 {

    var age = 19

}
