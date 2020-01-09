package com.saner.scala.chapter02

object Scala8_DataType {
    def main(args: Array[String]): Unit = {

        // TODO DataType
        // String name = null
        // int i = null
        // Integer i = null
        // null 其实是Null类型的对象

        // null是引用类型，无法赋值给值类型
        //val name:String = null
        //val age :Int = 0

        //println(name)
        //println(age)
        //val list: List[Nothing] = List()

        println(test1())

    }

    def test(): Nothing = {
        throw new Exception()
    }

    def test1(): Unit = {

    }
}
