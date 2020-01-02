package com.saner.scala.chapter07

object Scala16_WordCount2 {
    def main(args: Array[String]): Unit = {

        // TODO WordCount
        val list = List( "Hello World", "Hello World", "Hello Scala", "Hello Scala Hadoop" )
        //分割
        val wordList: List[String] = list.flatMap(i=>i.split(" "))
        //分组
        val stringToStrings = wordList.groupBy(i=>i.substring(0,1))
        //map
        val wordMap = stringToStrings.map(kv=>(kv._1,kv._2.size))
        //排序
        val tuples = wordMap.toList.sortWith(
            (left, right) => {
                left._2 > right._2
            }
        ).take(3)
        println(tuples)
    }



}
