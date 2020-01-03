package com.saner.scala.chapter08

object Scala02_Match1 {

    // TODO - 模式匹配 - 守卫
    // Scala中的模式匹配可以匹配数据的类型
    def main(args: Array[String]): Unit = {
        def abs(x: Int) = {
            x match {
                case i: Int if i >= 0 => i
                case j: Int if j < 0 => -j
                case _ => "illegal"
            }
        }
        println(abs(-5))
    }
}
