package com.saner.scala.chapter07

object Scala15_WordCount {
    def main(args: Array[String]): Unit = {

        // TODO WordCount
        val list = List( "Hello World", "Hello World", "Hello Scala", "Hello Scala Hadoop" )

        // 获取单词出现次数排名前3

        //分割
        val wordlist: List[String] = list.flatMap(i=>i.split(" "))
        //分组
        val wordtolist: Map[String, List[String]] = wordlist.groupBy(s=>s.substring(0,1))
        //map (word,list)=>(word,list.size)
        val stringToInt: Map[String, Int] = wordtolist.map(i => {
            (i._1, i._2.size)
        })
        //排序
        val tuples: List[(String, Int)] = stringToInt.toList.sortWith(
            (left, right) => left._2 > right._2
        ).take(3)

        println(tuples)
    }



}
