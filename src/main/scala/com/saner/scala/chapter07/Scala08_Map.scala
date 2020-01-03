package com.saner.scala.chapter07

import scala.collection.mutable

object Scala08_Map {
    def main(args: Array[String]): Unit = {
        // 集合 - Map(不可变)
        // Map集合中保存的是键值对(K-V)对象
        //        val map = Map(1->2,2->3,3->4)
        //可变
        val map1 = mutable.Map(1 -> 2, 2 -> 3, 3 -> 4)
        //        map1.put(4,5)
        //        map1.remove(1)
        //        println(map1.mkString(","))
        //        val maybeInt = map1.get(1)
        //        println(maybeInt)

        println(map1.getOrElse(5, 0))
        val keys: Iterable[Int] = map1.keys
        val values: Iterable[Int] = map1.values
        val iterator: Iterator[(Int, Int)] = map1.iterator


    }

}
