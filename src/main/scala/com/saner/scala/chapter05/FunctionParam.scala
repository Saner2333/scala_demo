package com.saner.scala.chapter05

object FunctionParam {

    def main(args: Array[String]): Unit = {
        //    （1）可变参数
        //    def f1(s : String*): Unit = {
        //      println("可变参数" + s)
        //    }
        //    f1("scala","nihao")
        //    f1()

        //    （2）可变参数位置：如果参数列表中存在多个参数，那么可变参数一般放置在最后
        //    def f2(i : Int,s : String*): Unit ={
        //      println("i = " + i  + "\ns =" + s)
        //    }
        //    f2(10,"hello","hhh")
        ////    （3）参数默认值：一般将有默认值的参数放置在参数列表的后面
        //    def f3(s : String,name : String="sa"): Unit ={
        //      println(s + " " + name)
        //    }
        //    f3("hello")
        //    （4）带名参数
        def f4(sex: String = "nan", name: String): Unit = {
            println(name + " " + sex)
        }

        f4(name = "sa")


    }

}
