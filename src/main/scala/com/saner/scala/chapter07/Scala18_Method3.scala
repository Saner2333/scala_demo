package com.saner.scala.chapter07

object Scala18_Method3 {

    def main(args: Array[String]): Unit = {
        val list1 = List(1, 2, "", 3, 4)
        val list2 = List(4, 5, 6, 7, 8)
        val list3 = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13)

        // 多元数据操作
        // 交集，并集，差集
        // TODO 并集
        //        println(list1.union(list2))
        //TODO 交集
        //        println(list1.intersect(list2))
        //TODO 差集
        //        println(list1.diff(list2))
        // TODO 拉链  两两结合
        //        println(list1.zip(list2))
        // TODO 滑动
        val iterator = list3.sliding(3, 4)
        while (iterator.hasNext) {
            println(iterator.next())
        }

    }

}
