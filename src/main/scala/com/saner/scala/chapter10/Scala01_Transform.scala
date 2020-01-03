package com.saner.scala.chapter10

//扩展更新用户功能，不能修改源代码
object Scala01_Transform {

    def main(args: Array[String]): Unit = {

        // 声明下面的方法用于编译器的自动转换(隐式转换)
        // 需要在函数前增加特殊的关键字，让编译器可以自动识别

        // 当编译器编译程序时发生错误，会尝试通过隐式转换将数据类型发生变化，看看是否能够编译通过
        // 所以有时也称之为二次编译

        // 隐式转换 ： 类型A => 类型B (类型转换)

        implicit def transform(d: Double): Int = {
            d.toInt
        }

        val d: Int = 2.0

    }

}

