package com.saner.scala.chapter07

object Scala20_Method5 {

    def main(args: Array[String]): Unit = {
        val list = List(1, 2, 3, 4, 5)
        println(list.fold(0)(_ + _))
        //        println(list.foldLeft(0)(_ - _))
        //        println(list.foldRight(0)(_ - _))
        //        println(list.foldLeft("")(_ + _))
        //        val str = list.foldRight(" ")(_+_)
        val str = list.foldLeft(" ")(_ + _)
        println(str + "111")
        //        println(list.foldRight("")(_ + _))
        // TODO 扫描 ：将fold方法中间的计算过程结果保留下来，形成集合
        //        println(list.scan(0)(_ + _))
    }
}
