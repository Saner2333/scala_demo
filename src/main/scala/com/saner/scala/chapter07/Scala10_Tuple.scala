package com.saner.scala.chapter07

object Scala10_Tuple {

    def main(args: Array[String]): Unit = {
        val tuple: (Int, String, String, Int, Int) = (1, "ttt", "zzz", 20, 30)
        println(tuple._1)
        val iterator = tuple.productIterator
        while (iterator.hasNext) {
            println(iterator.next())
        }

    }

}
