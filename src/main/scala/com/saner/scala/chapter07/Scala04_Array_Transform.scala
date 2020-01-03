package com.saner.scala.chapter07

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object Scala04_Array_Transform {

    def main(args: Array[String]): Unit = {
        // 集合 - Array - 数组 转换
        val array = Array(1, 2, 3)
        val buffer = ArrayBuffer(1, 2, 3)
        //mu-immu
        val array1: Array[Int] = buffer.toArray
        //immu-mu
        val buffer1: mutable.Buffer[Int] = array.toBuffer

        //多维数组
        val array2: Array[Array[Int]] = Array.ofDim[Int](3, 4)
    }

}
