package com.saner.scala.chapter07

object Scala12_Method {

    def main(args: Array[String]): Unit = {
        val list = List(1, 2, 3, 4)
        //        println(list.length)
        //        println(list.size)
        //        println(list.head)
        //        println(list.tail)
        //        println(list.last)
        //        println(list.init)
        //        val iterator = list.iterator
        //        while (iterator.hasNext){
        //            println(iterator.next())
        //        }


        //        println(list.sum)
        //        println(list.max)
        //        println(list.min)
        //        println(list.product)


        println(list.contains(1))
        println(list.reverse)
        println(list.take(2)) //List(1, 2)
        //从右边开始取
        println(list.takeRight(2))
        println(list.distinct)


    }

}
