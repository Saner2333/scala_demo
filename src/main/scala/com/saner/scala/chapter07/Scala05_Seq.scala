package com.saner.scala.chapter07

object Scala05_Seq {

    def main(args: Array[String]): Unit = {
        // 集合 - Seq - List (不可变)
        val list = List(1, 2, 3, 4)
        val ints: List[Int] = 1 :: 2 :: 3 :: Nil
        //        println(ints)
        val value = list.+:(5)
        val ints1: List[Int] = 5 +: list
        // 三个冒号表示将一个整体拆分成一个一个的个体来使用, 将这个操作称之为扁平化操作
        val ints2 = 5 :: list ::: ints
        println(ints2)
        //修改
        val ints3 = list.updated(0, 4)
        println(ints3)
        //删除

    }

}
