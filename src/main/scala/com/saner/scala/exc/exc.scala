package com.saner.scala.exc

object exc {
    def main(args: Array[String]): Unit = {

        var list = List(
            ("Hello Hadoop Hive Kafka", 4),
            ("Hello Hadoop Hive", 3),
            ("Hello Hadoop", 2),
            ("Hello", 1)
        )

        //分割
        // ("Hello Scala Hive", 3)
        // =>[ (Hello), (Scala), (Hive) ]
        // =>[ (Hello,3), (Scala,3), (Hive,3) ]
        val tuples = list.flatMap(t => {
            t._1.split(" ").map(w => (w, t._2))
        })

        //分组
        //Hadoop -> List((Hadoop,4), (Hadoop,3), (Hadoop,2))
        val stringToTuples: Map[String, List[(String, Int)]] = tuples.groupBy(i => i._1)
//        println(stringToTuples)

        //map
//        Map(Kafka -> 4, Hadoop -> 9, Hello -> 10, Hive -> 7)
        val stringToInt: Map[String, Int] = stringToTuples.map((i => {

            val count: List[Int] = i._2.map(tt => tt._2)
            (i._1, count.sum)

        }))
//        println(stringToInt)

        //排序取前3
        val list1 = stringToInt.toList.sortWith((left, right) => left._2 > right._2).take(3)

        println(list1)


    }

}
