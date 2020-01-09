package com.saner.scala.chapter01

import java.text.SimpleDateFormat
import java.util.Date

object Scala04_Exam {
    def main(args: Array[String]): Unit = {
        // 需求：取得传感器上报数据，并统计出每一个传感器点位每天的平均水位
        val time1 = List(
            ("anheqiao", 1549044122L, 10.0),
            ("shengbeilu", 1549044122L, 32.0),
            ("pinganjie", 1549044122L, 25.0)
        )
        val time2 = List(
            ("anheqiao", 1549044123L, 13.0),
            ("shengbeilu", 1549044123L, 34.0),
            ("pinganjie", 1549044123L, 27.0)
        )
        val time3 = List(
            ("anheqiao", 1549130522L, 14.0),
            ("shengbeilu", 1549130522L, 33.0),
            ("pinganjie", 1549130522L, 26.0)
        )
        val time4 = List(
            ("anheqiao", 1549130523L, 11.0),
            ("shengbeilu", 1549130523L, 32.0),
            ("pinganjie", 1549130523L, 23.0)
        )
        val datalist = List(time1, time2, time3, time4)
        val ori: List[(String, Long, Double)] = datalist.flatMap(i => i)
        //List[(String, Long, Double)] => List[(String_String, Double)]
        val sdf = new SimpleDateFormat("yyyy-MM-dd")
        val mapWatermarkList: List[(String, Double)] = ori.map {
            case (add, tm, wm) => (add + "_" + sdf.format(new Date(tm * 1000)), wm)
        }
//        mapWatermarkList.foreach(println)
        val stringToTuples: Map[String, List[(String, Double)]] = mapWatermarkList.groupBy(t => t._1)
//        stringToTuples.foreach(println)

        val result: List[(String, String, Double)] = stringToTuples.toList.map {
            case (addTime, list) =>
                val strings: Array[String] = addTime.split("_")
                val list1: List[Double] = list.map(_._2)
                (strings(0), strings(1), list1.sum / list1.size)
        }
//        result.foreach(println)
        val resultMap: Map[String, List[(String, String, Double)]] = result.groupBy(i=> i._1)
        resultMap.foreach(println)

    }
}
