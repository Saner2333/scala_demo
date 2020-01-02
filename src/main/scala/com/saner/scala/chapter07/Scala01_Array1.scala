package com.saner.scala.chapter07

object Scala01_Array1 {

    def main(args: Array[String]): Unit = {
        val array = new Array[Int](10)
        array(0) = 10
        array.update(1,20)
        println(array.mkString(","))
        array.foreach(println)
        // Scala中的运算符如果使用冒号结尾，那么调用的顺序为从右到左
        val ints = array :+ 5
        //val value = array.+:(5)
        //val ints1 = 5 +: array
        for (a <- ints){
            println(a)
        }

    }

}

