package com.saner.scala.chapter10

object Scala04_Transform3 {
    def main(args: Array[String]): Unit = {
        // 将方法参数的前面增加：implicit， 这个参数称之为隐式参数
        // 如果想要动态改变参数的值，需要采用隐式变量
        def registerUser(implicit password: String = "123123"): Unit = {
            println("insert user(" + password + ")")
        }
        // 隐式变量的使用，不能在调用函数时增加小括号
        implicit val passwd = "000000"
        registerUser()
        registerUser
    }
}
