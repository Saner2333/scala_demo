package com.saner.scala.chapter07

import scala.collection.mutable

object Scala22_Method7 {
    def main(args: Array[String]): Unit = {

        // 集合 - 常用方法
        val map1 = mutable.Map(("a", 1), ("b", 2), ("c", 3))
        val map2 = mutable.Map(("a", 4), ("d", 5), ("c", 6))
//
//         map1+map2 merge
//         ("a", 5),("b", 2),("d", 5),("c", 9)
//
//         Scala
        val result: mutable.Map[String, Int] = map2.foldLeft(map1)(
            (map, kv) => {
                //map(kv._1) = map.getOrElse(kv._1, 0) + kv._2
                map.update(kv._1, map.getOrElse(kv._1, 0) + kv._2)
                map
            }
        )
        println(result)



    }
}

