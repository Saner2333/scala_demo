package com.saner.scala.chapter07

import scala.collection.mutable

object Scala07_Set {

    def main(args: Array[String]): Unit = {

        //不可变
        val set: Set[Int] = Set(1, 2, 1, 1, 1, 1, 3, 1, 4, 5, 5, 6)
        //无序，不可重复
        println(set)

        //可变
        val value: mutable.Set[Int] = mutable.Set(1, 2, 3, 4)
        value.add(5)
        //        println(value)
        // update方法可以添加数据,也可以删除数据
        value.update(2, false)
        value.update(6, true)
        println(value)
        println(value.mkString(","))

    }
}
