package com.saner.scala.chapter08

object Scala04_Match3 {
    def main(args: Array[String]): Unit = {
        // 模式匹配也可以应用至简原则 省略case match 关键字
        val (name , age , count ) = ("zhangsan" , 18 ,30)
        println(name)
        // map方法可以使用模式匹配
        // 一般情况下，参数只有一个的场合可以使用模式匹配
        // 使用模式匹配时需要将方法的小括号变成大括号
        // case不能省略
        val map1: Map[String, Int] = Map( ("a",1), ("b",2), ("c",3) )
        val res = map1.filter {
            case (word, count) => count >= 2
        }
        println(res)

    }
}
