package com.saner.scala.chapter07

import scala.collection.mutable.ArrayBuffer

object Scala01_Array_mutable {

    def main(args: Array[String]): Unit = {
        val strings = new ArrayBuffer[String]()
        strings.append("a", "b", "c")
        // 可变集合的普通操作方法一般都不会产生新的集合，但是运算符号的方法一般都会产生新的
        //        val strings1 = strings += ("d")
        //        strings.insert(3,"d","e")
        strings(0) = "f"
        strings.update(0, "q")
        val strings1: ArrayBuffer[String] = strings.+:("e")
        //        println(strings1)
        //        strings.remove(1)
        //        val strings2 = strings - "q"
        val strings2 = strings.drop(2)
        println(strings2)
    }

}
