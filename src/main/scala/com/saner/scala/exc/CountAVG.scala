package com.saner.scala.exc

/*
val time1 = List(
    ( "anheqiao", 1549044122, 10.0 ),
    ( "shengbeilu", 1549044122, 32.0 ),
    ( "pinganjie", 1549044122,25.0 )
)
val time2 = List(
    ( "anheqiao", 1549044122, 13.0 ),
    ( "shengbeilu", 1549044122, 34.0 ),
    ( "pinganjie", 1549044122,27.0 )
)
val time3 = List(
    ( "anheqiao", 1549130522, 14.0 ),
    ( "shengbeilu", 1549130522, 33.0 ),
    ( "pinganjie", 1549130522,26.0 )
)
val time4 = List(
    ( "anheqiao", 1549130522, 11.0 ),
    ( "shengbeilu", 1549130522, 32.0 ),
    ( "pinganjie", 1549130522,23.0 )
)

取得传感器上报数据，并统计出每一个传感器点位每天的平均水位
*/
object CountAVG {
    def main(args: Array[String]): Unit = {
        val time1 = List(
            ("anheqiao", 1549044122, 10.0),
            ("shengbeilu", 1549044122, 32.0),
            ("pinganjie", 1549044122, 25.0)
        )
        val time2 = List(
            ("anheqiao", 1549044123, 13.0),
            ("shengbeilu", 1549044123, 34.0),
            ("pinganjie", 1549044122, 27.0)
        )
        val time3 = List(
            ("anheqiao", 1549130522, 14.0),
            ("shengbeilu", 1549130522, 33.0),
            ("pinganjie", 1549130522, 26.0)
        )
        val time4 = List(
            ("anheqiao", 1549130523, 11.0),
            ("shengbeilu", 1549130523, 32.0),
            ("pinganjie", 1549130523, 23.0)
        )
        val list = List(time1, time2, time3, time4)
        //        println(list)
        //分组
        val stringToTuples = list.flatten.groupBy(i => i._1)
        //map
        println(stringToTuples.mapValues(i => i.map(i => i._3)).map(i => (i._1, i._2.sum / i._2.size)))


    }

}
