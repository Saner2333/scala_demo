package com.saner.scala.test

object TestNull {

    def main(args: Array[String]): Unit = {
        var cat = new Cat()
        cat = null
        //null不可以赋值给数值类型
        //var n1 : Int = null
        //println("n1=" + n1)
        println(cat)
    }

}

class Cat {

}