package com.saner.scala.chapter05

object Function_Curry {

    def main(args: Array[String]): Unit = {

        def f1(i: Int) = {
            def f2(j: Int) = {
                def f3(f: (Int, Int) => Int) = {
                    f(i, j)
                }

                f3 _
            }

            f2 _
        }

        println(f1(10)(20)(_ + _))

    }

}
