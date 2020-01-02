package com.saner.scala.chapter07

object Scala19_Method4 {

    def main(args: Array[String]): Unit = {
        val list = List(1, 2, 3, 4, 5)
        // TODO 简化，规约，聚合
        // 采用自定义计算规则对集合的数据进行聚合操作
        // reduce方法要求返回值和参数类型保持一致
        //        val i: Int = list.reduce(
        //              (x, y) => x + y
        //             )
        println(list.reduce(_ + _))
        // ((((1 - 2) - 3)- 4) - 5)
        println(list.reduceLeft(_ - _))//-13
        //(1 - (2 - (3 - (4 - 5))))
        //reversed.reduceLeft[B]((x, y) => op(y, x))
        println(list.reduceRight(_ - _))//3
        // 1,2,3,4,5
        // 5,4,3,2,1
        // 4 - 5 = -1
        // 3 - (-1) = 4
        // 2 - 4 = -2
        // 1 - (-2) = 3



    }
}
