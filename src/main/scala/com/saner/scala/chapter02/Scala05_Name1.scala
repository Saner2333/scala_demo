package com.saner.scala.chapter02

object Scala05_Name1 {
    def main(args: Array[String]): Unit = {

        // TODO 标识符
        // Scala中一行代码最后的分号可以省略
        // 如果一行代码中有多个逻辑，那么分号不能省略
        //println("abc");println("abc");println("abc");println("abc")

        // Scala中给下划线提供了更多语法的支持，所以在当前场合下，无法确定下划线的作用。
        val _: String = "zhangsan"
        //        println(_)

        val Int: Int = 10
    }
}