package com.saner.scala.chapter08

object Scala08_Match7 {
    def main(args: Array[String]): Unit = {
        // TODO - 模式匹配

        // 以偏概全
        // 偏函数：函数只对满足条件的数据进行操作，并不会对所有的数据进行操作

        // 将该List(1,2,3,4,5,6,"test")中的Int类型的元素加一，并去掉字符串
        val list = List(1,2,3,4,5,6,"test")


        // 采集
        // collect方法可以对部分数据进行采集
        val list1: List[Int] = list.collect {
            case num: Int => num + 1
        }
        println(list1)


    }
}
