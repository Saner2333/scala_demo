package com.saner.scala.exc

object exc2 {

    def main(args: Array[String]): Unit = {
        var list = List(
            ("Hello Hadoop Hive Kafka", 4),
            ("Hello Hadoop Hive", 3),
            ("Hello Hadoop ", 2),
            ("Hello", 1)
        )
        //List(Hello Hadoop Hive Kafka Hello Hadoop Hive Kafka Hello Hadoop Hive Kafka Hello Hadoop Hive Kafka ,
        // Hello Hadoop Hive Hello Hadoop Hive Hello Hadoop Hive , Hello Hadoop  Hello Hadoop  , Hello )
        val strings = list.map(t => (t._1 + " ") * t._2)
        //        println(strings)

        //分割
        val flatMapList: List[String] = strings.flatMap(t => t.split(" "))
        //分组
        val stringToStrings = flatMapList.groupBy(i => i)
        //map
        //        Map( -> 1, Hive -> 7, Hello -> 10, Kafka -> 4, Hadoop -> 9)
        val stringToInt = stringToStrings.map(i => (i._1, i._2.size))
        //        println(stringToInt)
        //排序取前三
        val tuples = stringToInt.toList.sortWith((left, right) => left._2 > right._2).take(3)
        println(tuples)


    }

}
