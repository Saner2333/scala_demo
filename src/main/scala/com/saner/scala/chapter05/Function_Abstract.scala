package com.saner.scala.chapter05

object Function_Abstract {

    def main(args: Array[String]): Unit = {
        //控制抽象
        def f =
            () => {
                println("f...")
                10
            }

        foo(f())

        def foo(a: => Int) = {
            println(a)
            println(a)
        }

    }

}
