package com.saner.scala.chapter02

object Scala01_Var {
    def main(args: Array[String]): Unit = {
        // TODO 变量
        // java => int i = 10
        // scala => var i : int = 10
        //       => var 变量名称 : 变量类型 = 变量值
        // Scala中声明变量可以采用var声明
        var i: Int = 10
        var s: String = "abc"
        var b: Boolean = true
        // Scala中声明变量也可以采用val声明，不想让变量的值发生变化
        val d: Int = 20

    }
}
